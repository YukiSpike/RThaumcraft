package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.entity.Cultistleader_Entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityList {
	
    public static final DeferredRegister<EntityType<?>> ENTITYS = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
            Main.MOD_ID);

//            public static final RegistryObject<EntityType<EntityAlumentum>> ALUMENTUM = ENTITY_TYPES.register("alumentum", 
//            () -> EntityType.Builder.<EntityAlumentum>of(EntityAlumentum::new, MobCategory.MISC).sized(0.25F, 0.25F)
//                            .setTrackingRange(4).updateInterval(10).build("alumentum"));

public static final RegistryObject<EntityType<Cultistleader_Entity>> CULTIST_LEADER = ENTITYS.register("cultist_leader",
() -> EntityType.Builder.of(Cultistleader_Entity::new, MobCategory.MONSTER).sized(1f,1.8f).setTrackingRange(20)
        .build(new ResourceLocation(Main.MOD_ID, "cultist_leader").toString()));


    public static void register(IEventBus eventBus) {
        ENTITYS.register(eventBus);
    }
    
}