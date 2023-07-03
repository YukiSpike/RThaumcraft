package com.Yuki_Spike.rthaumcraft.init;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.enchantment.Enchantment_Haste;
import com.Yuki_Spike.rthaumcraft.enchantment.Enchantment_Repair;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS,
    RThaumcraft.MODID);

    public static RegistryObject<Enchantment> REPAIR = ENCHANTMENTS.register("repair",
        () -> new Enchantment_Repair(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEARABLE, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> HASTE = ENCHANTMENTS.register("haste",
        () -> new Enchantment_Haste(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.ARMOR_FEET, EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
