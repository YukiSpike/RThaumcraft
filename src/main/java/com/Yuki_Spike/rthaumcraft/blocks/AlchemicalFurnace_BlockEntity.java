package com.Yuki_Spike.rthaumcraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;
import com.Yuki_Spike.rthaumcraft.list.BlockEntityList;
import com.Yuki_Spike.rthaumcraft.list.FluidList;
import com.Yuki_Spike.rthaumcraft.list.ItemList;
import com.Yuki_Spike.rthaumcraft.screen.AlchemicalFurnace_Menu;

public class AlchemicalFurnace_BlockEntity extends BlockEntity implements MenuProvider {
	
    private final ItemStackHandler itemHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack) {
            return switch (slot) {
                case 0 -> stack.getItem() == ItemList.ALUMENTUM.get();
                case 1 -> stack.getItem() == ItemList.ALUMENTUM.get();
                case 2 -> stack.getItem() == ItemList.NITOR.get();
                default -> super.isItemValid(slot, stack);
            };

        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private LazyOptional<IFluidHandler> lazyFluidHandler = LazyOptional.empty();

    protected final ContainerData date;
    private int progress = 0;
    private int maxProgress = 78;

    public AlchemicalFurnace_BlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityList.ALCHEMICAL_FURNACE_ENTITY.get(), pos, state);
        this.date = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> AlchemicalFurnace_BlockEntity.this.progress;
                    case 1 -> AlchemicalFurnace_BlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> AlchemicalFurnace_BlockEntity.this.progress = value;
                    case 1 -> AlchemicalFurnace_BlockEntity.this.maxProgress = value;
                };
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }
    
    private final FluidTank FLUID_TANK = new FluidTank(64000) {
        @Override
        protected void onContentsChanged() {
            setChanged();
        }
        private void setChanged() {
        }
        @Override
        public boolean isFluidValid(FluidStack stack) {
            return stack.getFluid() == Fluids.WATER || stack.getFluid() == FluidList.SOURCE_DEATHWATER.get();
        }
    };
    public void setFluid(FluidStack stack) {
        this.FLUID_TANK.setFluid(stack);
    }
    public FluidStack geFluidStack() {
        return this.FLUID_TANK.getFluid();
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("alchemical_furnace");
    }
    
    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new AlchemicalFurnace_Menu(id, inventory, this, this.date);
    }

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return lazyItemHandler.cast();
        }
        if (cap == ForgeCapabilities.FLUID_HANDLER) {
            return lazyFluidHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
        lazyFluidHandler = LazyOptional.of(() -> FLUID_TANK);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
        lazyFluidHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.put("inventory", itemHandler.serializeNBT());
        nbt.putInt("alchemical_furnace.progress", this.progress);
        nbt = FLUID_TANK.writeToNBT(nbt);

        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("alchemical_furnace.progress");
        FLUID_TANK.readFromNBT(nbt);
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, AlchemicalFurnace_BlockEntity entity) {
        if(level.isClientSide()) {
            return;
        }
        if(hasRecipe(entity)) {
        	state.setValue(AlchemicalFurnace_Block.LIT, Boolean.valueOf(false));
            entity.progress++;
            setChanged(level, pos, state);
            if(entity.progress >= entity.maxProgress) {
                craftItem(entity);
            }
        } else {
        	state.setValue(AlchemicalFurnace_Block.LIT, Boolean.valueOf(true));
            entity.resetProgress();
            setChanged(level, pos, state);
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    //检查物品槽是否放了原料
    private static void craftItem(AlchemicalFurnace_BlockEntity entity) {
//        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

//        Optional<AlchemicalFurnace_Recipe> recope = level.getRecipeManager()
//        .getRecipeFor(AlchemicalFurnace_Recipe.Type.INSTANCE, inventory, level);

        if(hasRecipe(entity)) {
            entity.itemHandler.extractItem(0,1, false);
            entity.itemHandler.extractItem(1,1, false);

            entity.itemHandler.setStackInSlot(2, new ItemStack(ItemList.NITOR.get(),
            entity.itemHandler.getStackInSlot(2).getCount() + 1));
          entity.resetProgress();
        }
    }


    private static boolean hasRecipe(AlchemicalFurnace_BlockEntity entity) {
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        boolean hasRawGemInFirstSlot = entity.itemHandler.getStackInSlot(1).getItem() == ItemList.ALUMENTUM.get();

        return hasRawGemInFirstSlot && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, new ItemStack(ItemList.NITOR.get(), 1))
                && hasFuelSlot(entity);
    }

    //燃料槽
    private static boolean hasFuelSlot(AlchemicalFurnace_BlockEntity entity) {
        return entity.itemHandler.getStackInSlot(1).getItem() == ItemList.ALUMENTUM.get()
        || entity.itemHandler.getStackInSlot(1).getItem() == Items.COAL;
    }

    //输出槽
    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {
        return inventory.getItem(2).getItem() == output.getItem() || inventory.getItem(2).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
        return inventory.getItem(2).getMaxStackSize() > inventory.getItem(2).getCount();
    }

}
