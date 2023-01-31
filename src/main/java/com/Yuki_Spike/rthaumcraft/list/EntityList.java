package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityList {
	
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
            Main.MOD_ID);

//            public static final RegistryObject<EntityType<EntityAlumentum>> ALUMENTUM = ENTITY_TYPES.register("alumentum", 
//            () -> EntityType.Builder.<EntityAlumentum>of(EntityAlumentum::new, MobCategory.MISC).sized(0.25F, 0.25F)
//                            .setTrackingRange(4).updateInterval(10).build("alumentum"));


}