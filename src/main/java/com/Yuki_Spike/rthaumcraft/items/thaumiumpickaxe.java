package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;

public class thaumiumpickaxe extends PickaxeItem{
    public thaumiumpickaxe() {
        super(CustomItemTier.thaumiumitems,2,-2.8F ,new Item.Properties().tab(Main.MAIN_TAB));
    }
}