package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class crimsonsword extends SwordItem{
    public crimsonsword() {
        super(CustomItemTier.voiditems,4,-2.4F,new Item.Properties().tab(Main.MAIN_TAB));
    }
}