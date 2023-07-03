package com.Yuki_Spike.rthaumcraft.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class Enchantment_Haste extends Enchantment {

    public Enchantment_Haste(Rarity Rarity, EnchantmentCategory CateGory, EquipmentSlot... ApplicableSlots) {
        super(Rarity, CateGory, ApplicableSlots);
    }
    
    @Override
    public int getMaxLevel() {
        return 3;
    }
}
