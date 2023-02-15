package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FoodList {

    public static final DeferredRegister<Item> FOODS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
//nutrition饥饿度，saturationMod饱腹度
    public static final RegistryObject<Item> ZOMBIE_BRAIN = FOODS.register("zombie_brain", 
    () -> new Item(new Item.Properties().tab(Main.MAIN_TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(2.5F).
            alwaysEat().build())));

    public static final RegistryObject<Item> TRIPLE_MEAT_TREAT = FOODS.register("triple_meat_treat", 
    () -> new Item(new Item.Properties().tab(Main.MAIN_TAB).food(new FoodProperties.Builder().nutrition(8).saturationMod(4F).
            alwaysEat().build())));


    public static void register(IEventBus eventBus) {
        FOODS.register(eventBus);
    }
}
