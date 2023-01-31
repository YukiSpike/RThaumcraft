package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

public class thaumiumhoe extends HoeItem{
    public thaumiumhoe() {
        super(CustomItemTier.thaumiumitems,-2,1 ,new Item.Properties().tab(Main.MAIN_TAB));
    }
}