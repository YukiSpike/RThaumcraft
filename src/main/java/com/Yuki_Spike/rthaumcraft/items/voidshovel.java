package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;

public class voidshovel extends ShovelItem{
    public voidshovel() {
        super(CustomItemTier.voiditems,1,-3 ,new Item.Properties().tab(Main.MAIN_TAB));
    }
}