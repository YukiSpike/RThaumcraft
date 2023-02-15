package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;

public class elementalshovel extends ShovelItem{
    public elementalshovel() {
        super(CustomItemTier.elementalitems,0,-3 ,new Item.Properties().tab(Main.MAIN_TAB));
    }
}