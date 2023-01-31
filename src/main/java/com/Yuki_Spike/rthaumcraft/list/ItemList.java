package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.items.CustomArmorMaterial;
import com.Yuki_Spike.rthaumcraft.items.bonebow;
import com.Yuki_Spike.rthaumcraft.items.thaumiumaxe;
import com.Yuki_Spike.rthaumcraft.items.thaumiumhoe;
import com.Yuki_Spike.rthaumcraft.items.thaumiumpickaxe;
import com.Yuki_Spike.rthaumcraft.items.thaumiumshovel;
import com.Yuki_Spike.rthaumcraft.items.thaumiumsword;
import com.Yuki_Spike.rthaumcraft.items.voidaxe;
import com.Yuki_Spike.rthaumcraft.items.voidhoe;
import com.Yuki_Spike.rthaumcraft.items.voidpickaxe;
import com.Yuki_Spike.rthaumcraft.items.voidshovel;
import com.Yuki_Spike.rthaumcraft.items.voidsword;
import com.google.common.base.Supplier;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemList {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

        public static final RegistryObject<Item> SALIS_MUNDUS = register("salis_mundus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMOMETER = register("thaumometer",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SHARD_BALANCED = register("shard_balanced",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SHARD_AIR = register("shard_air",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SHARD_FIRE = register("shard_fire",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SHARD_WATER = register("shard_water",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SHARD_EARTH = register("shard_earth",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SHARD_ORDER = register("shard_order",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SHARD_ENTROPY = register("shard_entropy",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> PRIMAL_CHARM = register("primal_charm",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> PRIMORDIAL_PEARL = register("primordial_pearl",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
    
        public static final RegistryObject<Item> THAUMIUM_INGOT = register("thaumium_ingot",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> VOID_INGOT = register("void_ingot",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> AMBER = register("amber",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> ALUMENTUM = register("alumentum",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> Enchanted_Fabric = register("enchanted_fabric",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> QUICKSILVER = register("quicksilver",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> QUICKSILVER_NUGGET = register("quicksilver_nugget",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CRIMSON_RITES = register("crimson_rites",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMONOMICON = register("thaumonomicon",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static RegistryObject<Item> THAUMIUM_SWORD = register("thaumium_sword",
        () -> {return new thaumiumsword();});

        public static RegistryObject<Item> THAUMIUM_PICKAXE = register("thaumium_pickaxe",
        () -> {return new thaumiumpickaxe();});

        public static RegistryObject<Item> THAUMIUM_AXE = register("thaumium_axe",
        () -> {return new thaumiumaxe();});

        public static RegistryObject<Item> THAUMIUM_SHOVEL = register("thaumium_shovel",
        () -> {return new thaumiumshovel();});

        public static RegistryObject<Item> THAUMIUM_HOE = register("thaumium_hoe",
        () -> {return new thaumiumhoe();});

        public static RegistryObject<Item> VOID_SWORD = register("void_sword",
        () -> {return new voidsword();});

        public static RegistryObject<Item> VOID_PICKAXE = register("void_pickaxe",
        () -> {return new voidpickaxe();});

        public static RegistryObject<Item> VOID_SHOVEL = register("void_shovel",
        () -> {return new voidshovel();});

        public static RegistryObject<Item> VOID_HOE = register("void_hoe",
        () -> {return new voidhoe();});

        public static RegistryObject<Item> VOID_AXE = register("void_axe",
        () -> {return new voidaxe();});

        public static RegistryObject<Item> BONEBOW = register("bonebow",
        () -> {return new bonebow();});

        public static final RegistryObject<Item> THAUMIUM_HELM = ITEMS.register("thaumium_helm", 
            () -> new ArmorItem(CustomArmorMaterial.THAUMIUMARMOR,EquipmentSlot.HEAD,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMIUM_CHESTPLATE = ITEMS.register("thaumium_chestplate", 
            () -> new ArmorItem(CustomArmorMaterial.THAUMIUMARMOR,EquipmentSlot.CHEST,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMIUM_LEGGINGS = ITEMS.register("thaumium_leggings", 
            () -> new ArmorItem(CustomArmorMaterial.THAUMIUMARMOR,EquipmentSlot.LEGS,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMIUM_BOOTS = ITEMS.register("thaumium_boots", 
            () -> new ArmorItem(CustomArmorMaterial.THAUMIUMARMOR,EquipmentSlot.FEET,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> VOID_HELM = ITEMS.register("void_helm", 
            () -> new ArmorItem(CustomArmorMaterial.VOIDARMOR,EquipmentSlot.HEAD,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> VOID_CHESTPLATE = ITEMS.register("void_chestplate", 
            () -> new ArmorItem(CustomArmorMaterial.VOIDARMOR,EquipmentSlot.CHEST,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> VOID_LEGGINGS = ITEMS.register("void_leggings", 
            () -> new ArmorItem(CustomArmorMaterial.VOIDARMOR,EquipmentSlot.LEGS,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> VOID_BOOTS = ITEMS.register("void_boots", 
            () -> new ArmorItem(CustomArmorMaterial.VOIDARMOR,EquipmentSlot.FEET,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMIUMFORTRESS_HELM = ITEMS.register("thaumiumfortress_helm", 
            () -> new ArmorItem(CustomArmorMaterial.THAUMIUMFORTRESS,EquipmentSlot.HEAD,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMIUMFORTRESS_CHESTPLATE = ITEMS.register("thaumiumfortress_chestplate", 
            () -> new ArmorItem(CustomArmorMaterial.THAUMIUMFORTRESS,EquipmentSlot.CHEST,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMIUMFORTRESS_LEGGINGS = ITEMS.register("thaumiumfortress_leggings", 
            () -> new ArmorItem(CustomArmorMaterial.THAUMIUMFORTRESS,EquipmentSlot.LEGS,(new Item.Properties()).tab(Main.MAIN_TAB)));



        private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
                                return ITEMS.register(name, item);
                        }

}
