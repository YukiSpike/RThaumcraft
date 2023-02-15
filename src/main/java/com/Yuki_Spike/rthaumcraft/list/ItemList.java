package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.items.Cultistleader_Armor;
import com.Yuki_Spike.rthaumcraft.items.Cultistplate_Armor;
import com.Yuki_Spike.rthaumcraft.items.Cultistrobe_Armor;
import com.Yuki_Spike.rthaumcraft.items.CustomArmorMaterial;
import com.Yuki_Spike.rthaumcraft.items.ItemAmulet;
import com.Yuki_Spike.rthaumcraft.items.ItemBelt;
import com.Yuki_Spike.rthaumcraft.items.ItemRing;
import com.Yuki_Spike.rthaumcraft.items.Thaumiumfortress_Armor;
import com.Yuki_Spike.rthaumcraft.items.Travelerboots_Armor;
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
import com.Yuki_Spike.rthaumcraft.items.voidshield;
import com.Yuki_Spike.rthaumcraft.items.voidshovel;
import com.Yuki_Spike.rthaumcraft.items.voidsword;
import com.google.common.base.Supplier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
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

        public static final RegistryObject<Item> SHARD_AER = register("shard_aer",
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

        public static final RegistryObject<Item> VOID_SEED = register("void_seed",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SANITYCHECKER = register("sanitychecker",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> TAINT_SLIME = register("taint_slime",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> TAINT_TENDRIL = register("taint_tendril",
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

        public static final RegistryObject<Item> MIRROR_HAND = register("mirror_hand",
        () -> new Item(new Item.Properties().stacksTo(1).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> MIRROR_GLASS = register("mirror_glass",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SOAP = register("soap",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> IRONBELL = register("ironbell",
        () -> new Item(new Item.Properties().stacksTo(1).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> INKWELL = register("inkwell",
        () -> new Item(new Item.Properties().stacksTo(1).tab(Main.MAIN_TAB)));

        //工具武器
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

        public static RegistryObject<Item> VOID_SHIELD = register("void_shield", 
        ()-> { return new voidshield();});
     
        //装备护甲
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

        public static final RegistryObject<Item> CLOTH_CHESTPLATE = ITEMS.register("cloth_chestplate", 
            () -> new ArmorItem(CustomArmorMaterial.CLOTHARMOR,EquipmentSlot.CHEST,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CLOTH_LEGGINGS = ITEMS.register("cloth_leggings", 
            () -> new ArmorItem(CustomArmorMaterial.CLOTHARMOR,EquipmentSlot.LEGS,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CLOTH_BOOTS = ITEMS.register("cloth_boots", 
            () -> new ArmorItem(CustomArmorMaterial.CLOTHARMOR,EquipmentSlot.FEET,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> VOID_CHESTPLATE = ITEMS.register("void_chestplate", 
            () -> new ArmorItem(CustomArmorMaterial.VOIDARMOR,EquipmentSlot.CHEST,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> VOID_LEGGINGS = ITEMS.register("void_leggings", 
            () -> new ArmorItem(CustomArmorMaterial.VOIDARMOR,EquipmentSlot.LEGS,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> VOID_BOOTS = ITEMS.register("void_boots", 
            () -> new ArmorItem(CustomArmorMaterial.VOIDARMOR,EquipmentSlot.FEET,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CULTISTROBE_HELM = ITEMS.register("cultistrobe_helm", 
            () -> new Cultistrobe_Armor(CustomArmorMaterial.CLOTHARMOR,EquipmentSlot.HEAD,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CULTISTROBE_CHESTPLATE = ITEMS.register("cultistrobe_chestplate", 
            () -> new Cultistrobe_Armor(CustomArmorMaterial.CLOTHARMOR,EquipmentSlot.CHEST,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CULTISTROBE_LEGGINGS = ITEMS.register("cultistrobe_leggings", 
            () -> new Cultistrobe_Armor(CustomArmorMaterial.CLOTHARMOR,EquipmentSlot.LEGS,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CULTISTPLATE_HELM = ITEMS.register("cultistplate_helm", 
            () -> new Cultistplate_Armor(CustomArmorMaterial.THAUMIUMARMOR,EquipmentSlot.HEAD,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CULTISTPLATE_CHESTPLATE = ITEMS.register("cultistplate_chestplate", 
            () -> new Cultistplate_Armor(CustomArmorMaterial.THAUMIUMARMOR,EquipmentSlot.CHEST,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CULTISTPLATE_LEGGINGS = ITEMS.register("cultistplate_leggings", 
            () -> new Cultistplate_Armor(CustomArmorMaterial.THAUMIUMARMOR,EquipmentSlot.LEGS,(new Item.Properties()).tab(Main.MAIN_TAB)));
            
        public static final RegistryObject<Item> CULTIST_BOOTS = ITEMS.register("cultist_boots", 
            () -> new Cultistrobe_Armor(CustomArmorMaterial.CLOTHARMOR,EquipmentSlot.FEET,(new Item.Properties()).tab(Main.MAIN_TAB)));
     
        public static final RegistryObject<Thaumiumfortress_Armor> THAUMIUMFORTRESS_HELM = ITEMS.register("thaumiumfortress_helm", 
            () -> new Thaumiumfortress_Armor(CustomArmorMaterial.THAUMIUMFORTRESS,EquipmentSlot.HEAD,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Thaumiumfortress_Armor> THAUMIUMFORTRESS_CHESTPLATE = ITEMS.register("thaumiumfortress_chestplate", 
            () -> new Thaumiumfortress_Armor(CustomArmorMaterial.THAUMIUMFORTRESS,EquipmentSlot.CHEST,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Thaumiumfortress_Armor> THAUMIUMFORTRESS_LEGGINGS = ITEMS.register("thaumiumfortress_leggings", 
            () -> new Thaumiumfortress_Armor(CustomArmorMaterial.THAUMIUMFORTRESS,EquipmentSlot.LEGS,(new Item.Properties()).tab(Main.MAIN_TAB)));
         
        public static final RegistryObject<Cultistleader_Armor> CULTISTLEADER_HELM = ITEMS.register("cultistleader_helm", 
            () -> new Cultistleader_Armor(CustomArmorMaterial.CULTISTLEADER,EquipmentSlot.HEAD,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Cultistleader_Armor> CULTISTLEADER_CHESTPLATE = ITEMS.register("cultistleader_chestplate", 
            () -> new Cultistleader_Armor(CustomArmorMaterial.CULTISTLEADER,EquipmentSlot.CHEST,(new Item.Properties()).tab(Main.MAIN_TAB)));

         public static final RegistryObject<Cultistleader_Armor> CULTISTLEADER_LEGGINGS = ITEMS.register("cultistleader_leggings", 
            () -> new Cultistleader_Armor(CustomArmorMaterial.CULTISTLEADER,EquipmentSlot.LEGS,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Travelerboots_Armor> TRAVELER_BOOTS = ITEMS.register("traveler_boots", 
            () -> new Travelerboots_Armor(CustomArmorMaterial.STRAVELERARMOR,EquipmentSlot.FEET,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> GOGGLES_REVEALING = ITEMS.register("goggles_revealing", 
            () -> new ArmorItem(CustomArmorMaterial.GOGGLESARMOR,EquipmentSlot.HEAD,(new Item.Properties()).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> THAUMOSTATIC_HARNESS = ITEMS.register("thaumostatic_harness", 
            () -> new ArmorItem(CustomArmorMaterial.HARNESSARMOR,EquipmentSlot.CHEST,(new Item.Properties()).tab(Main.MAIN_TAB)));

        //饰品
        public static final RegistryObject<Item> BAUBLE_RING = register("bauble_ring",
            () -> {return new ItemRing();});

        public static final RegistryObject<Item> BAUBLE_AMULET = register("bauble_amulet",
            () -> {return new ItemAmulet();});

        public static final RegistryObject<Item> BAUBLE_BELT = register("bauble_belt",
            () -> {return new ItemBelt();});

        public static final RegistryObject<Item> FOCUS_POUCH = register("focus_pouch",
            () -> {return new ItemBelt();});

        //杖端
        public static final RegistryObject<Item> WAND_CAP_IRON = register("wand_cap_iron",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_CAP_COPPER = register("wand_cap_copper",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_CAP_GOLD = register("wand_cap_gold",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_CAP_THAUMIUM_INERT = register("wand_cap_thaumium_inert",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_CAP_THAUMIUM = register("wand_cap_thaumium",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_CAP_VOID_INERT = register("wand_cap_void_inert",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WAND_CAP_VOID = register("wand_cap_void",
            () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        //杖柄
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

        //杖芯
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

        //法杖
        public static final RegistryObject<Item> WAND_WOOD = register("wand_wood",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> GREATWOOD_IRON = register("greatwood_iron",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                    
        public static final RegistryObject<Item> GREATWOOD_COPPER = register("greatwood_copper",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> GREATWOOD_GOLD = register("greatwood_gold",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> GREATWOOD_THAUMIUM = register("greatwood_thaumium",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> GREATWOOD_VOID = register("greatwood_void",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SILVERWOOD_IRON = register("silverwood_iron",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                    
        public static final RegistryObject<Item> SILVERWOOD_COPPER = register("silverwood_copper",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SILVERWOOD_GOLD = register("silverwood_gold",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SILVERWOOD_THAUMIUM = register("silverwood_thaumium",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> SILVERWOOD_VOID = register("silverwood_void",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        public static final RegistryObject<Item> REED_IRON = register("reed_iron",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                    
        public static final RegistryObject<Item> REED_COPPER = register("reed_copper",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> REED_GOLD = register("reed_gold",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> REED_THAUMIUM = register("reed_thaumium",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> REED_VOID = register("reed_void",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
            
        public static final RegistryObject<Item> BLAZE_IRON = register("blaze_iron",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                    
        public static final RegistryObject<Item> BLAZE_COPPER = register("blaze_copper",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> BLAZE_GOLD = register("blaze_gold",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> BLAZE_THAUMIUM = register("blaze_thaumium",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> BLAZE_VOID = register("blaze_void",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> ICE_IRON = register("ice_iron",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                    
        public static final RegistryObject<Item> ICE_COPPER = register("ice_copper",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> ICE_GOLD = register("ice_gold",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> ICE_THAUMIUM = register("ice_thaumium",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> ICE_VOID = register("ice_void",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
         
        public static final RegistryObject<Item> OBSIDIAN_IRON = register("obsidian_iron",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                    
        public static final RegistryObject<Item> OBSIDIAN_COPPER = register("obsidian_copper",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> OBSIDIAN_GOLD = register("obsidian_gold",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> OBSIDIAN_THAUMIUM = register("obsidian_thaumium",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> OBSIDIAN_VOID = register("obsidian_void",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> QUARTZ_IRON = register("quartz_iron",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                    
        public static final RegistryObject<Item> QUARTZ_COPPER = register("quartz_copper",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> QUARTZ_GOLD = register("quartz_gold",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> QUARTZ_THAUMIUM = register("quartz_thaumium",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> QUARTZ_VOID = register("quartz_void",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
 
        public static final RegistryObject<Item> BONE_IRON = register("bone_iron",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                    
        public static final RegistryObject<Item> BONE_COPPER = register("bone_copper",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> BONE_GOLD = register("bone_gold",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> BONE_THAUMIUM = register("bone_thaumium",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> BONE_VOID = register("bone_void",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
    
        public static final RegistryObject<Item> PRIMAL_IRON = register("primal_iron",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
                    
        public static final RegistryObject<Item> PRIMAL_COPPER = register("primal_copper",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> PRIMAL_GOLD = register("primal_gold",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> PRIMAL_THAUMIUM = register("primal_thaumium",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> PRIMAL_VOID = register("primal_void",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));
        
        //液体
        public static final RegistryObject<Item> DEATHWATER_BUCKET = register("deathwater_bucket",
            () -> new BucketItem(FluidList.SOURCE_DEATHWATER, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> WARDED_TERRA_BUCKET = register("warded_terra_bucket",
            () -> new BucketItem(FluidList.SOURCE_WARDED_TERRA, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(Main.MAIN_TAB)));
            
        //生成
        public static final RegistryObject<Item> OB_PLACER = register("ob_placer",
        () -> new Item(new Item.Properties().tab(Main.MAIN_TAB)));

        public static final RegistryObject<Item> CULTISTLEADER_SPAWN_EGG = ITEMS.register("cultistleader_spawn_egg",
        () -> new ForgeSpawnEggItem(EntityList.CULTIST_LEADER, 3093009, 4390912, new Item.Properties().tab(Main.MAIN_TAB)));

        


        private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
                                return ITEMS.register(name, item);
                        }


        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
}
