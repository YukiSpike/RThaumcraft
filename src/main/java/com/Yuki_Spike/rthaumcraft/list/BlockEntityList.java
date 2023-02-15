package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.blocks.AlchemicalFurnace_BlockEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityList {
        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Main.MOD_ID);

        public static final RegistryObject<BlockEntityType<AlchemicalFurnace_BlockEntity>> ALCHEMICAL_FURNACE_ENTITY = BLOCK_ENTITIES.register("alchemical_furnace_entity", 
                () -> BlockEntityType.Builder.of(AlchemicalFurnace_BlockEntity::new, BlockList.ALCHEMICAL_FURNACE.get()).build(null));

        public static final RegistryObject<BlockEntityType<AlchemicalFurnace_BlockEntity>> JAR_ENTITY = BLOCK_ENTITIES.register("jar_entity", 
                () -> BlockEntityType.Builder.of(AlchemicalFurnace_BlockEntity::new, BlockList.JAR.get()).build(null));
        

        public static void register(IEventBus eventBus) {
                BLOCK_ENTITIES.register(eventBus);
        }
}
