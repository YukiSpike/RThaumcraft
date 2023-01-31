package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class thaumiumaxe extends AxeItem{
    public thaumiumaxe() {
        super(CustomItemTier.thaumiumitems,6,-3 ,new Item.Properties().tab(Main.MAIN_TAB));
    }
}