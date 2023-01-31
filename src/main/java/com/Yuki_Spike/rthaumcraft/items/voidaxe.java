package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class voidaxe extends AxeItem{
    public voidaxe() {
        super(CustomItemTier.voiditems,5,-3 ,new Item.Properties().tab(Main.MAIN_TAB));
    }
}