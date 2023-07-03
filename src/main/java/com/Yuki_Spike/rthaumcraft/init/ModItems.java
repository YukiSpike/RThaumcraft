package com.Yuki_Spike.rthaumcraft.init;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;

import com.Yuki_Spike.rthaumcraft.items.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RThaumcraft.MODID);

    //方块物品
    public static final RegistryObject<Item> GREAT_SAPLING = ITEMS.register("great_sapling",
            () -> new BlockItem(ModBlocks.GREAT_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_LEAVES = ITEMS.register("great_leaves",
            () -> new BlockItem(ModBlocks.GREAT_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_LOG = ITEMS.register("great_log",
            () -> new BlockItem(ModBlocks.GREAT_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_WOOD = ITEMS.register("great_wood",
            () -> new BlockItem(ModBlocks.GREAT_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_GREAT_LOG = ITEMS.register("stripped_great_log",
            () -> new BlockItem(ModBlocks.STRIPPED_GREAT_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_GREAT_WOOD = ITEMS.register("stripped_great_wood",
            () -> new BlockItem(ModBlocks.STRIPPED_GREAT_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_PLANKS = ITEMS.register("great_planks",
            () -> new BlockItem(ModBlocks.GREAT_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_STAIRS = ITEMS.register("great_stairs",
            () -> new BlockItem(ModBlocks.GREAT_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_SLAB = ITEMS.register("great_slab",
            () -> new BlockItem(ModBlocks.GREAT_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_FENCE = ITEMS.register("great_fence",
            () -> new BlockItem(ModBlocks.GREAT_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_FENCE_GATE = ITEMS.register("great_fence_gate",
            () -> new BlockItem(ModBlocks.GREAT_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_DOOR = ITEMS.register("great_door",
            () -> new BlockItem(ModBlocks.GREAT_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_TRAPDOOR = ITEMS.register("great_trapdoor",
            () -> new BlockItem(ModBlocks.GREAT_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_BUTTON = ITEMS.register("great_button",
            () -> new BlockItem(ModBlocks.GREAT_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_PRESSURE_PLATE = ITEMS.register("great_pressure_plate",
            () -> new BlockItem(ModBlocks.GREAT_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREAT_SIGN = ITEMS.register("great_sign",
            () -> new SignItem((new Item.Properties()).stacksTo(16), ModBlocks.GREAT_SIGN.get(), ModBlocks.GREAT_WALL_SIGN.get()));
    public static final RegistryObject<Item> GREAT_HANGING_SIGN = ITEMS.register("great_hanging_sign",
            () -> new HangingSignItem(ModBlocks.GREAT_HANGING_SIGN.get(), ModBlocks.GREAT_WALL_HANGING_SIGN.get(), (new Item.Properties()).stacksTo(16)));
    public static final RegistryObject<Item> SILVER_SAPLING = ITEMS.register("silver_sapling",
            () -> new BlockItem(ModBlocks.SILVER_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_LEAVES = ITEMS.register("silver_leaves",
            () -> new BlockItem(ModBlocks.SILVER_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_LOG = ITEMS.register("silver_log",
            () -> new BlockItem(ModBlocks.SILVER_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_WOOD = ITEMS.register("silver_wood",
            () -> new BlockItem(ModBlocks.SILVER_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SILVER_LOG = ITEMS.register("stripped_silver_log",
            () -> new BlockItem(ModBlocks.STRIPPED_SILVER_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SILVER_WOOD = ITEMS.register("stripped_silver_wood",
            () -> new BlockItem(ModBlocks.STRIPPED_SILVER_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PLANKS = ITEMS.register("silver_planks",
            () -> new BlockItem(ModBlocks.SILVER_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_STAIRS = ITEMS.register("silver_stairs",
            () -> new BlockItem(ModBlocks.SILVER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SLAB = ITEMS.register("silver_slab",
            () -> new BlockItem(ModBlocks.SILVER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_FENCE = ITEMS.register("silver_fence",
            () -> new BlockItem(ModBlocks.SILVER_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_FENCE_GATE = ITEMS.register("silver_fence_gate",
            () -> new BlockItem(ModBlocks.SILVER_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_DOOR = ITEMS.register("silver_door",
            () -> new BlockItem(ModBlocks.SILVER_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_TRAPDOOR = ITEMS.register("silver_trapdoor",
            () -> new BlockItem(ModBlocks.SILVER_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BUTTON = ITEMS.register("silver_button",
            () -> new BlockItem(ModBlocks.SILVER_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PRESSURE_PLATE = ITEMS.register("silver_pressure_plate",
            () -> new BlockItem(ModBlocks.SILVER_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SIGN = ITEMS.register("silver_sign",
            () -> new SignItem((new Item.Properties()).stacksTo(16), ModBlocks.SILVER_SIGN.get(), ModBlocks.SILVER_WALL_SIGN.get()));
    public static final RegistryObject<Item> SILVER_HANGING_SIGN = ITEMS.register("silver_hanging_sign",
            () -> new HangingSignItem(ModBlocks.SILVER_HANGING_SIGN.get(), ModBlocks.SILVER_WALL_HANGING_SIGN.get(), (new Item.Properties()).stacksTo(16)));


    public static final RegistryObject<Item> ARCANE_STONE = ITEMS.register("arcane_stone",
            () -> new BlockItem(ModBlocks.ARCANE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> THAUMIUM_BLOCK = ITEMS.register("thaumium_block",
            () -> new BlockItem(ModBlocks.THAUMIUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> VOID_BLOCK = ITEMS.register("void_block",
            () -> new BlockItem(ModBlocks.VOID_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLESH_BLOCK = ITEMS.register("flesh_block",
            () -> new BlockItem(ModBlocks.FLESH_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> TALLOW_BLOCK = ITEMS.register("tallow_block",
            () -> new BlockItem(ModBlocks.TALLOW_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> TABLE = ITEMS.register("table",
            () -> new BlockItem(ModBlocks.TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TABLE_CRAFT = ITEMS.register("table_craft",
            () -> new BlockItem(ModBlocks.TABLE_CRAFT.get(), new Item.Properties()));
    public static final RegistryObject<Item> TABLE_RESEARCH = ITEMS.register("table_research",
            () -> new BlockItem(ModBlocks.TABLE_RESEARCH.get(), new Item.Properties()));

    public static final RegistryObject<Item> ORE_AMBER = ITEMS.register("ore_amber",
            () -> new BlockItem(ModBlocks.ORE_AMBER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORE_DEEPSLATE_AMBER = ITEMS.register("ore_deepslate_amber",
            () -> new BlockItem(ModBlocks.ORE_DEEPSLATE_AMBER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORE_CINNIBAR = ITEMS.register("ore_cinnibar",
            () -> new BlockItem(ModBlocks.ORE_CINNIBAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORE_DEEPSLATE_CINNIBAR = ITEMS.register("ore_deepslate_cinnibar",
            () -> new BlockItem(ModBlocks.ORE_DEEPSLATE_CINNIBAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORE_SHARD_AER = ITEMS.register("ore_shard_aer",
            () -> new BlockItem(ModBlocks.ORE_SHARD_AER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORE_SHARD_FIRE = ITEMS.register("ore_shard_fire",
            () -> new BlockItem(ModBlocks.ORE_SHARD_FIRE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORE_SHARD_WATER = ITEMS.register("ore_shard_water",
            () -> new BlockItem(ModBlocks.ORE_SHARD_WATER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORE_SHARD_EARTH = ITEMS.register("ore_shard_earth",
            () -> new BlockItem(ModBlocks.ORE_SHARD_EARTH.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORE_SHARD_ORDER = ITEMS.register("ore_shard_order",
            () -> new BlockItem(ModBlocks.ORE_SHARD_ORDER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORE_SHARD_ENTROPY = ITEMS.register("ore_shard_entropy",
            () -> new BlockItem(ModBlocks.ORE_SHARD_ENTROPY.get(), new Item.Properties()));


    //物品
    public static final RegistryObject<Item> THAUMONOMICON = ITEMS.register("thaumonomicon",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> THAUMONOMICON_CHEAT = ITEMS.register("thaumonomicon_cheat",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SCRIBING_TOOLS = ITEMS.register("scribing_tools",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CINNABAR_CLUSTER = ITEMS.register("cinnabar_cluster",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUICKSILVER = ITEMS.register("quicksilver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THAUMIUM_INGOT = ITEMS.register("thaumium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOID_INGOT = ITEMS.register("void_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUICKSILVER_NUGGET = ITEMS.register("quicksilver_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THAUMIUM_NUGGET = ITEMS.register("thaumium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOID_NUGGET = ITEMS.register("void_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SALIS_MUNDUS = ITEMS.register("salis_mundus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_BALANCED = ITEMS.register("shard_balanced",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_AER = ITEMS.register("shard_aer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_FIRE = ITEMS.register("shard_fire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_WATER = ITEMS.register("shard_water",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_EARTH = ITEMS.register("shard_earth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_ORDER = ITEMS.register("shard_order",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_ENTROPY = ITEMS.register("shard_entropy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRIMAL_CHARM = ITEMS.register("primal_charm",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PRIMORDIAL_PEARL = ITEMS.register("primordial_pearl",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CRYSTALLIZED_ESSENCE = ITEMS.register("crystallized_essence",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KNOWLEDGE_FRAGMENT = ITEMS.register("knowledge_fragment",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TALLOW = ITEMS.register("tallow",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENCHANTED_FABRIC = ITEMS.register("enchanted_fabric",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MIRRORED_GLASS = ITEMS.register("mirrored_glass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIS_FILTER = ITEMS.register("vis_filter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COIN = ITEMS.register("coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAINT_SLIME = ITEMS.register("taint_slime",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAINT_TENDRIL = ITEMS.register("taint_tendril",
            () -> new Item(new Item.Properties()));

    //傀儡
    public static final RegistryObject<Item> GOLEMANCERS_BELL = ITEMS.register("golemancers_bell",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GOLEM_CORE_BLANK = ITEMS.register("golem_core_blank",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_BUTCHER = ITEMS.register("golem_core_butcher",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_EMPTY = ITEMS.register("golem_core_empty",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_ESSENTIA = ITEMS.register("golem_core_essentia",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_FILL = ITEMS.register("golem_core_fill",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_FISH = ITEMS.register("golem_core_fish",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_GATHER = ITEMS.register("golem_core_gather",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_GUARD = ITEMS.register("golem_core_guard",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_HARVEST = ITEMS.register("golem_core_harvest",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_LIQUID = ITEMS.register("golem_core_liquid",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_LUMBER = ITEMS.register("golem_core_lumber",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_PATROL = ITEMS.register("golem_core_patrol",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_SORTING = ITEMS.register("golem_core_sorting",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_CORE_USE = ITEMS.register("golem_core_use",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GOLEM_UPGRADE_AER = ITEMS.register("golem_upgrade_aer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLEM_UPGRADE_FIRE = ITEMS.register("golem_upgrade_fire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLEM_UPGRADE_WATER = ITEMS.register("golem_upgrade_water",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLEM_UPGRADE_EARTH = ITEMS.register("golem_upgrade_earth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLEM_UPGRADE_ORDER = ITEMS.register("golem_upgrade_order",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLEM_UPGRADE_ENTROPY = ITEMS.register("golem_upgrade_entropy",
            () -> new Item(new Item.Properties()));

    //工具武器
    public static RegistryObject<Item> BONEBOW = ITEMS.register("bonebow",
            () -> new bonebow((new Item.Properties()).durability(426)));
    public static RegistryObject<Item> CRIMSON_BLADE = ITEMS.register("crimson_blade",
            () -> {return new crimsonblade();});
    public static RegistryObject<Item> THAUMIUM_SWORD = ITEMS.register("thaumium_sword",
            () -> {return new thaumiumsword();});
    public static RegistryObject<Item> THAUMIUM_PICKAXE = ITEMS.register("thaumium_pickaxe",
            () -> {return new thaumiumpickaxe();});
    public static RegistryObject<Item> THAUMIUM_AXE = ITEMS.register("thaumium_axe",
            () -> {return new thaumiumaxe();});
    public static RegistryObject<Item> THAUMIUM_SHOVEL = ITEMS.register("thaumium_shovel",
            () -> {return new thaumiumshovel();});
    public static RegistryObject<Item> THAUMIUM_HOE = ITEMS.register("thaumium_hoe",
            () -> {return new thaumiumhoe();});
    public static RegistryObject<Item> VOID_SWORD = ITEMS.register("void_sword",
            () -> {return new voidsword();});
    public static RegistryObject<Item> VOID_PICKAXE = ITEMS.register("void_pickaxe",
            () -> {return new voidpickaxe();});
    public static RegistryObject<Item> VOID_SHOVEL = ITEMS.register("void_shovel",
            () -> {return new voidshovel();});
    public static RegistryObject<Item> VOID_HOE = ITEMS.register("void_hoe",
            () -> {return new voidhoe();});
    public static RegistryObject<Item> VOID_AXE = ITEMS.register("void_axe",
            () -> {return new voidaxe();});

    //装备护甲
    public static final RegistryObject<Item> THAUMIUM_HELMET = ITEMS.register("thaumium_helmet",
            () -> new ArmorItem(ModArmorMaterial.THAUMIUMARMOR, ArmorItem.Type.HELMET,(new Item.Properties())));
    public static final RegistryObject<Item> THAUMIUM_CHESTPLATE = ITEMS.register("thaumium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.THAUMIUMARMOR, ArmorItem.Type.CHESTPLATE,(new Item.Properties())));
    public static final RegistryObject<Item> THAUMIUM_LEGGINGS = ITEMS.register("thaumium_leggings",
            () -> new ArmorItem(ModArmorMaterial.THAUMIUMARMOR, ArmorItem.Type.LEGGINGS,(new Item.Properties())));
    public static final RegistryObject<Item> THAUMIUM_BOOTS = ITEMS.register("thaumium_boots",
            () -> new ArmorItem(ModArmorMaterial.THAUMIUMARMOR, ArmorItem.Type.BOOTS,(new Item.Properties())));
    public static final RegistryObject<Item> VOID_HELMET = ITEMS.register("void_helmet",
            () -> new ArmorItem(ModArmorMaterial.VOIDARMOR, ArmorItem.Type.HELMET,(new Item.Properties())));
    public static final RegistryObject<Item> VOID_CHESTPLATE = ITEMS.register("void_chestplate",
            () -> new ArmorItem(ModArmorMaterial.VOIDARMOR, ArmorItem.Type.CHESTPLATE,(new Item.Properties())));
    public static final RegistryObject<Item> VOID_LEGGINGS = ITEMS.register("void_leggings",
            () -> new ArmorItem(ModArmorMaterial.VOIDARMOR, ArmorItem.Type.LEGGINGS,(new Item.Properties())));
    public static final RegistryObject<Item> VOID_BOOTS = ITEMS.register("void_boots",
            () -> new ArmorItem(ModArmorMaterial.VOIDARMOR, ArmorItem.Type.BOOTS,(new Item.Properties())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
