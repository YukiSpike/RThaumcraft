package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class voidsword extends SwordItem{
    public voidsword() {
        super(CustomItemTier.voiditems,3,-2.4F,new Item.Properties().tab(Main.MAIN_TAB));
    }
}