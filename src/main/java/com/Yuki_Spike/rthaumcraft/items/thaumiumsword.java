package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class thaumiumsword extends SwordItem{
    public thaumiumsword() {
        super(CustomItemTier.thaumiumitems,3,-2.4F,new Item.Properties().tab(Main.MAIN_TAB));
    }
}