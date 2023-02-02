package com.Yuki_Spike.rthaumcraft.items;

import java.util.function.Supplier;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.list.ItemList;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum CustomArmorMaterial implements ArmorMaterial{

	//int[]{鞋子,护腿,胸甲,头盔},附魔能力,抗性,击退抗性
	THAUMIUMARMOR("thaumiumarmor", 25, new int[]{2, 5, 6, 2}, 20, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.1F, () -> {
	      return Ingredient.of(ItemList.THAUMIUM_INGOT.get());
	    }),
    VOIDARMOR("voidarmor", 10, new int[]{3, 6, 7, 3}, 15, SoundEvents.ARMOR_EQUIP_IRON, 3F, 0.1F, () -> {
		      return Ingredient.of(ItemList.VOID_INGOT.get());	   
        }),
    THAUMIUMFORTRESS("thaumiumfortress", 40, new int[]{3, 6, 7, 3}, 20, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 0.2F, () -> {
            return Ingredient.of(ItemList.THAUMIUM_INGOT.get());
        }),

    CLOTHARMOR("clotharmor", 25, new int[]{1, 2, 3, 1}, 20, SoundEvents.ARMOR_EQUIP_LEATHER, 3.0F, 0F, () -> {
            return Ingredient.of(ItemList.ENCHANTED_FABRIC.get());
        }),

    MAGICARMOR("magicarmor", 25, new int[]{1, 2, 3, 1}, 20, SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, 0F, () -> {
            return Ingredient.of(ItemList.SALIS_MUNDUS.get());
        });

    private static final int[] baseDurability = { 13, 15, 16, 11 };
    private final String name;
    private final int durabilityMultiplier;
    private final int[] armorVal;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;
	
    private CustomArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantability, SoundEvent equipSound, 
    		float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {

        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.armorVal = armorVal;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
     }
    
    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return baseDurability[slot.getIndex()] * durabilityMultiplier;
    }
    
    
    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.armorVal[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }


    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }


    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
     }

    @Override
    public String getName() {
        return Main.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}