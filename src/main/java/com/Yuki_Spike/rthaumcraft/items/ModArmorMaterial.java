package com.Yuki_Spike.rthaumcraft.items;

import java.util.EnumMap;
import java.util.function.Supplier;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.init.ModItems;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterial implements ArmorMaterial{

    THAUMIUMARMOR("thaumiumarmor", 30, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266652_) -> {
        p_266652_.put(ArmorItem.Type.BOOTS, 2);
        p_266652_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266652_.put(ArmorItem.Type.CHESTPLATE, 6);
        p_266652_.put(ArmorItem.Type.HELMET, 2);
    }), 1, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> {
        return Ingredient.of(ModItems.THAUMIUM_INGOT.get());
    }),

    VOIDARMOR("voidarmor", 25, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266652_) -> {
        p_266652_.put(ArmorItem.Type.BOOTS, 3);
        p_266652_.put(ArmorItem.Type.LEGGINGS, 6);
        p_266652_.put(ArmorItem.Type.CHESTPLATE, 8);
        p_266652_.put(ArmorItem.Type.HELMET, 3);
    }), 1, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.VOID_INGOT.get());
    });

    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;
	
    private ModArmorMaterial(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionFunctionForType, int enchantability, SoundEvent equipSound,
                             float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protectionFunctionForType;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
     }



    public int getDurabilityForType(ArmorItem.Type p_266745_) {
        return HEALTH_FUNCTION_FOR_TYPE.get(p_266745_) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type p_266752_) {
        return this.protectionFunctionForType.get(p_266752_);
    }

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
        return RThaumcraft.MODID + ":" + this.name;
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