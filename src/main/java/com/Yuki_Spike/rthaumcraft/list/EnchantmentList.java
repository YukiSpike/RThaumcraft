package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.enchantment.RepairEnchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantmentList {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS,
    Main.MOD_ID);

    public static RegistryObject<Enchantment> REPAIR = ENCHANTMENTS.register("repair",
        () -> new RepairEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEARABLE, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> HASTE = ENCHANTMENTS.register("haste",
        () -> new RepairEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.ARMOR_FEET, EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
