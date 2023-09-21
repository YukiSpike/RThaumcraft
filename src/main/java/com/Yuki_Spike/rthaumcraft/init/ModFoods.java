package com.Yuki_Spike.rthaumcraft.init;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFoods {

    public static final DeferredRegister<Item> FOODS = DeferredRegister.create(ForgeRegistries.ITEMS, RThaumcraft.MODID);
//nutrition饥饿度，saturationMod饱腹度
    public static final RegistryObject<Item> ZOMBIE_BRAIN = FOODS.register("zombie_brain", 
    () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).
            alwaysEat().effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600), 1.0F).build())));

    public static final RegistryObject<Item> TRIPLE_MEAT_TREAT = FOODS.register("triple_meat_treat", 
    () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1F).
            alwaysEat().effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100), 2.0F).build())));


    public static void register(IEventBus eventBus) {
        FOODS.register(eventBus);
    }
}
