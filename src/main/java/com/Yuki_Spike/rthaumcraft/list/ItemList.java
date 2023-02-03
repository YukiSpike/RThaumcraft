package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.items.CustomArmorMaterial;
import com.Yuki_Spike.rthaumcraft.items.ItemAmulet;
import com.Yuki_Spike.rthaumcraft.items.ItemBelt;
import com.Yuki_Spike.rthaumcraft.items.ItemRing;
import com.Yuki_Spike.rthaumcraft.items.bonebow;
import com.Yuki_Spike.rthaumcraft.items.crimsonsword;
import com.Yuki_Spike.rthaumcraft.items.elementalaxe;
import com.Yuki_Spike.rthaumcraft.items.elementalhoe;
import com.Yuki_Spike.rthaumcraft.items.elementalpickaxe;
import com.Yuki_Spike.rthaumcraft.items.elementalshovel;
import com.Yuki_Spike.rthaumcraft.items.elementalsword;
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
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemList {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

        public static final RegistryObject<Item> VIS_FILTER = register("vis_filter",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> GLASS_PHIAL = register("glass_phial",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> KNOWLEDGE_FRAGMENT = register("knowledge_fragment",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> COIN = register("coin",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> NITOR = register("nitor",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> IRON_NUGGET = register("iron_nugget",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> COPPER_NUGGET = register("copper_nugget",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMIUM_NUGGET = register("thaumium_nugget",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> VOID_NUGGET = register("void_nugget",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> MAGIC_TALLOW = register("magic_tallow",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SALIS_MUNDUS = register("salis_mundus",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> BATH_SALTS = register("bath_salts",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> RUNED_TABLET = register("runed_tablet",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> ELDRITH_EYE = register("eldritch_eye",
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
        () -> new Item(new Item.Properties().stacksTo(1).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> PRIMORDIAL_PEARL = register("primordial_pearl",
        () -> new Item(new Item.Properties().stacksTo(1).tab(Main.MAIN_TAB)));
    
        public static final RegistryObject<Item> THAUMIUM_INGOT = register("thaumium_ingot",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> VOID_INGOT = register("void_ingot",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> AMBER = register("amber",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CINNABAR_CLUSTER = register("cinnabar_cluster",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> ALUMENTUM = register("alumentum",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> ENCHANTED_FABRIC = register("enchanted_fabric",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> BOTTLED_TAINT = register("bottled_taint",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> QUICKSILVER = register("quicksilver",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> QUICKSILVER_NUGGET = register("quicksilver_nugget",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CRIMSON_RITES = register("crimson_rites",
        () -> new Item(new Item.Properties().stacksTo(1).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMONOMICON = register("thaumonomicon",
        () -> new Item(new Item.Properties().stacksTo(1).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMONOMICON_CHEAT = register("thaumonomicon_cheat",
        () -> new Item(new Item.Properties().stacksTo(1).tab(Main.MAIN_TAB)));

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

        public static RegistryObject<Item> ELEMENTAL_SWORD = register("elemental_sword",
        () -> {return new elementalsword();});

        public static RegistryObject<Item> ELEMENTAL_PICKAXE = register("elemental_pickaxe",
        () -> {return new elementalpickaxe();});

        public static RegistryObject<Item> ELEMENTAL_SHOVEL = register("elemental_shovel",
        () -> {return new elementalshovel();});

        public static RegistryObject<Item> ELEMENTAL_HOE = register("elemental_hoe",
        () -> {return new elementalhoe();});

        public static RegistryObject<Item> ELEMENTAL_AXE = register("elemental_axe",
        () -> {return new elementalaxe();});

        public static RegistryObject<Item> CRIMSON_BLADE = register("crimson_blade",
        () -> {return new crimsonsword();});

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

        public static final RegistryObject<Item> TRAVELER_BOOTS = ITEMS.register("traveler_boots", 
            () -> new ArmorItem(CustomArmorMaterial.MAGICARMOR,EquipmentSlot.FEET,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> GOGGLES_REVEALING = ITEMS.register("goggles_revealing", 
            () -> new ArmorItem(CustomArmorMaterial.MAGICARMOR,EquipmentSlot.HEAD,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMOSTATIC_HARNESS = ITEMS.register("thaumostatic_harness", 
            () -> new ArmorItem(CustomArmorMaterial.MAGICARMOR,EquipmentSlot.CHEST,(new Item.Properties()).tab(Main.MAIN_TAB)));

            
        public static final RegistryObject<Item> FOCUS_POUCH = register("focus_pouch",
            () -> new Item(new Item.Properties().stacksTo(1).tab(Main.MAIN_TAB)));


        public static final RegistryObject<Item> WAND_ROD_GREATWOOD = register("wand_rod_greatwood",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_ROD_SILVERWOOD = register("wand_rod_silverwood",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_ROD_REED = register("wand_rod_reed",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_ROD_BLAZE = register("wand_rod_blaze",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_ROD_ICE = register("wand_rod_ice",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_ROD_OBSIDIAN = register("wand_rod_obsidian",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_ROD_QUARTZ = register("wand_rod_quartz",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_ROD_BONE = register("wand_rod_bone",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> STAFF_ROD_GREATWOOD = register("staff_rod_greatwood",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> STAFF_ROD_SILVERWOOD = register("staff_rod_silverwood",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> STAFF_ROD_REED = register("staff_rod_reed",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> STAFF_ROD_BLAZE = register("staff_rod_blaze",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> STAFF_ROD_ICE = register("staff_rod_ice",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> STAFF_ROD_OBSIDIAN = register("staff_rod_obsidian",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> STAFF_ROD_QUARTZ = register("staff_rod_quartz",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> STAFF_ROD_BONE = register("staff_rod_bone",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> STAFF_ROD_PRIMAL = register("staff_rod_primal",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
            
        public static final RegistryObject<Item> DEATH_WATER_BUCKET = register("death_water_bucket",
            () -> new BucketItem(FluidList.SOURCE_DEATH_WATER, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> BAUBLE_RING = register("bauble_ring",
            () -> {return new ItemRing();});

        public static final RegistryObject<Item> BAUBLE_AMULET = register("bauble_amulet",
            () -> {return new ItemAmulet();});

        public static final RegistryObject<Item> BAUBLE_BELT = register("bauble_belt",
            () -> {return new ItemBelt();});



        private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
                                return ITEMS.register(name, item);
                        }

}
