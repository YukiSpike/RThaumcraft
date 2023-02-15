package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;

public class elementalpickaxe extends PickaxeItem{
    public elementalpickaxe() {
        super(CustomItemTier.elementalitems,0,-2.8F ,new Item.Properties().tab(Main.MAIN_TAB));
    }
}