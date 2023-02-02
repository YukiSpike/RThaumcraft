package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class elementalsword extends SwordItem{
    public elementalsword() {
        super(CustomItemTier.elementalitems,2,-2.4F,new Item.Properties().tab(Main.MAIN_TAB));
    }
}