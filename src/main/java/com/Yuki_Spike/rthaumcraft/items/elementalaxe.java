package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class elementalaxe extends AxeItem{
    public elementalaxe() {
        super(CustomItemTier.elementalitems,4,-3 ,new Item.Properties().tab(Main.MAIN_TAB));
    }
}