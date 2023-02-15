package com.Yuki_Spike.rthaumcraft.blocks;

import com.Yuki_Spike.rthaumcraft.list.BlockEntityList;
import com.Yuki_Spike.rthaumcraft.list.FluidList;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;


public class Jar_BlockEntity extends BlockEntity {

    protected final ContainerData date;
    private int progress = 0;
    private int maxProgress = 78;

    private LazyOptional<IFluidHandler> lazyFluidHandler = LazyOptional.empty();

    public Jar_BlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityList.JAR_ENTITY.get(), pos, state);
        this.date = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> Jar_BlockEntity.this.progress;
                    case 1 -> Jar_BlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> Jar_BlockEntity.this.progress = value;
                    case 1 -> Jar_BlockEntity.this.maxProgress = value;
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
    public void onLoad() {
        super.onLoad();
        lazyFluidHandler = LazyOptional.of(() -> FLUID_TANK);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyFluidHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {
        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
    }
}
