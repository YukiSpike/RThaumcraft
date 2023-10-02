package com.Yuki_Spike.rthaumcraft.init;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, RThaumcraft.MODID);

    public static final RegistryObject<BlockEntityType<?>> SIGN =  registerBlockEntityType("sign", SignBlockEntity::new,
            () -> List.of(ModBlocks.GREAT_SIGN.get(), ModBlocks.SILVER_SIGN.get(),
                    ModBlocks.GREAT_WALL_SIGN.get(), ModBlocks.SILVER_WALL_SIGN.get()));

    public static RegistryObject<BlockEntityType<?>> HANGING_SIGN = registerBlockEntityType("hanging_sign", HangingSignBlockEntity::new,
                () -> List.of(ModBlocks.GREAT_HANGING_SIGN.get(), ModBlocks.SILVER_HANGING_SIGN.get(),
                        ModBlocks.GREAT_WALL_HANGING_SIGN.get(), ModBlocks.SILVER_WALL_HANGING_SIGN.get()));

//    public static final RegistryObject<BlockEntityType<ModAlchemicalFurnace_Entity>> ALCHEMICAL_FURNACE_ENTITY = BLOCK_ENTITIES.register("alchemical_furnace_entity",
//            () -> BlockEntityType.Builder.of(ModAlchemicalFurnace_Entity::new, ModBlocks.ALCHEMICAL_FURNACE.get()).build(null));

    public static RegistryObject<BlockEntityType<?>> registerBlockEntityType(String name, BlockEntityType.BlockEntitySupplier<?> factoryIn, Supplier<List<Block>> validBlocks)
    {
        return BLOCK_ENTITIES.register(name, () -> BlockEntityType.Builder.of(factoryIn, validBlocks.get().toArray(new Block[0])).build(null));
    }

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
