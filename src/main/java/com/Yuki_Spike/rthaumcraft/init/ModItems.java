package com.Yuki_Spike.rthaumcraft.init;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;

import com.Yuki_Spike.rthaumcraft.items.*;
import com.Yuki_Spike.rthaumcraft.items.armor.Cultistleader_Armor;
import com.Yuki_Spike.rthaumcraft.items.armor.Cultistplate_Armor;
import com.Yuki_Spike.rthaumcraft.items.armor.Cultistrobe_Armor;
import com.Yuki_Spike.rthaumcraft.items.armor.Thaumiumfortress_Armor;
import com.Yuki_Spike.rthaumcraft.items.aspect.CompoundAspect;
import com.Yuki_Spike.rthaumcraft.items.aspect.PrimalAspect;
import com.Yuki_Spike.rthaumcraft.items.tool.*;
import com.Yuki_Spike.rthaumcraft.items.weapon.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RThaumcraft.MODID);

    public static final RegistryObject<Item> THAUMONOMICON = ITEMS.register("thaumonomicon",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> THAUMONOMICON_CHEAT = ITEMS.register("thaumonomicon_cheat",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CRIMSON_RITES = ITEMS.register("crimson_rites",
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

    //杖端
    public static final RegistryObject<Item> CAP_IRON = ITEMS.register("cap_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAP_COPPER = ITEMS.register("cap_copper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAP_GOLD = ITEMS.register("cap_gold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAP_THAUMIUM_INERT = ITEMS.register("cap_thaumium_inert",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAP_THAUMIUM = ITEMS.register("cap_thaumium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAP_VOID_INERT = ITEMS.register("cap_void_inert",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAP_VOID = ITEMS.register("cap_void",
            () -> new Item(new Item.Properties()));

    //杖柄
    public static final RegistryObject<Item> ROD_GREATWOOD = ITEMS.register("rod_greatwood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_SILVERWOOD = ITEMS.register("rod_silverwood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_REED = ITEMS.register("rod_reed",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_BLAZE = ITEMS.register("rod_blaze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_ICE = ITEMS.register("rod_ice",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_OBSIDIAN = ITEMS.register("rod_obsidian",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_QUARTZ = ITEMS.register("rod_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_BONE = ITEMS.register("rod_bone",
            () -> new Item(new Item.Properties()));

    //杖芯
    public static final RegistryObject<Item> ROD_STAFF_GREATWOOD = ITEMS.register("rod_staff_greatwood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_STAFF_SILVERWOOD = ITEMS.register("rod_staff_silverwood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_STAFF_REED = ITEMS.register("rod_staff_reed",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_STAFF_BLAZE = ITEMS.register("rod_staff_blaze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_STAFF_ICE = ITEMS.register("rod_staff_ice",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_STAFF_OBSIDIAN = ITEMS.register("rod_staff_obsidian",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_STAFF_QUARTZ = ITEMS.register("rod_staff_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_STAFF_BONE = ITEMS.register("rod_staff_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROD_STAFF_PRIMAL = ITEMS.register("rod_staff_primal",
            () -> new Item(new Item.Properties()));

    //法杖
    public static final RegistryObject<Item> WAND_WOOD_IRON = ITEMS.register("wand_wood_iron",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WAND_WOOD_COPPER = ITEMS.register("wand_wood_copper",
            () -> new Item(new Item.Properties().stacksTo(1)));

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
            crimsonblade::new);
    public static RegistryObject<Item> THAUMIUM_SWORD = ITEMS.register("thaumium_sword",
            thaumiumsword::new);
    public static RegistryObject<Item> THAUMIUM_PICKAXE = ITEMS.register("thaumium_pickaxe",
            thaumiumpickaxe::new);
    public static RegistryObject<Item> THAUMIUM_AXE = ITEMS.register("thaumium_axe",
            thaumiumaxe::new);
    public static RegistryObject<Item> THAUMIUM_SHOVEL = ITEMS.register("thaumium_shovel",
            thaumiumshovel::new);
    public static RegistryObject<Item> THAUMIUM_HOE = ITEMS.register("thaumium_hoe",
            thaumiumhoe::new);
    public static RegistryObject<Item> VOID_SWORD = ITEMS.register("void_sword",
            voidsword::new);
    public static RegistryObject<Item> VOID_PICKAXE = ITEMS.register("void_pickaxe",
            voidpickaxe::new);
    public static RegistryObject<Item> VOID_SHOVEL = ITEMS.register("void_shovel",
            voidshovel::new);
    public static RegistryObject<Item> VOID_HOE = ITEMS.register("void_hoe",
            voidhoe::new);
    public static RegistryObject<Item> VOID_AXE = ITEMS.register("void_axe",
            voidaxe::new);
    public static RegistryObject<Item> ZEPHYR_SWORD = ITEMS.register("zephyr_sword",
            zephyrsword::new);
    public static RegistryObject<Item> CORE_PICKAXE = ITEMS.register("core_pickaxe",
            corepickaxe::new);
    public static RegistryObject<Item> EARTHMOVER_SHOVEL = ITEMS.register("earthmover_shovel",
            earthmovershovel::new);
    public static RegistryObject<Item> GROWTH_HOE = ITEMS.register("growth_hoe",
            growthhoe::new);
    public static RegistryObject<Item> STREAM_AXE = ITEMS.register("stream_axe",
            streamaxe::new);

    //神秘护甲
    public static final RegistryObject<Item> THAUMIUM_HELMET = ITEMS.register("thaumium_helmet",
            () -> new ArmorItem(ModArmorMaterial.THAUMIUM_ARMOR, ArmorItem.Type.HELMET,(new Item.Properties())));
    public static final RegistryObject<Item> THAUMIUM_CHESTPLATE = ITEMS.register("thaumium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.THAUMIUM_ARMOR, ArmorItem.Type.CHESTPLATE,(new Item.Properties())));
    public static final RegistryObject<Item> THAUMIUM_LEGGINGS = ITEMS.register("thaumium_leggings",
            () -> new ArmorItem(ModArmorMaterial.THAUMIUM_ARMOR, ArmorItem.Type.LEGGINGS,(new Item.Properties())));
    public static final RegistryObject<Item> THAUMIUM_BOOTS = ITEMS.register("thaumium_boots",
            () -> new ArmorItem(ModArmorMaterial.THAUMIUM_ARMOR, ArmorItem.Type.BOOTS,(new Item.Properties())));
    //虚空护甲
    public static final RegistryObject<Item> VOID_HELMET = ITEMS.register("void_helmet",
            () -> new ArmorItem(ModArmorMaterial.VOID_ARMOR, ArmorItem.Type.HELMET,(new Item.Properties())));
    public static final RegistryObject<Item> VOID_CHESTPLATE = ITEMS.register("void_chestplate",
            () -> new ArmorItem(ModArmorMaterial.VOID_ARMOR, ArmorItem.Type.CHESTPLATE,(new Item.Properties())));
    public static final RegistryObject<Item> VOID_LEGGINGS = ITEMS.register("void_leggings",
            () -> new ArmorItem(ModArmorMaterial.VOID_ARMOR, ArmorItem.Type.LEGGINGS,(new Item.Properties())));
    public static final RegistryObject<Item> VOID_BOOTS = ITEMS.register("void_boots",
            () -> new ArmorItem(ModArmorMaterial.VOID_ARMOR, ArmorItem.Type.BOOTS,(new Item.Properties())));
    //神秘要塞
    public static final RegistryObject<Thaumiumfortress_Armor> THAUMIUMFORTRESS_HELMET = ITEMS.register("thaumiumfortress_helmet",
            () -> new Thaumiumfortress_Armor(ModArmorMaterial.THAUMIUMFORTRESS_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Thaumiumfortress_Armor> THAUMIUMFORTRESS_CHESTPLATE = ITEMS.register("thaumiumfortress_chestplate",
            () -> new Thaumiumfortress_Armor(ModArmorMaterial.THAUMIUMFORTRESS_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Thaumiumfortress_Armor> THAUMIUMFORTRESS_LEGGINGS = ITEMS.register("thaumiumfortress_leggings",
            () -> new Thaumiumfortress_Armor(ModArmorMaterial.THAUMIUMFORTRESS_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    //血腥主教
    public static final RegistryObject<Cultistleader_Armor> CULTISTLEADER_HELMET = ITEMS.register("cultistleader_helmet",
            () -> new Cultistleader_Armor(ModArmorMaterial.CULTISTLEADER_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Cultistleader_Armor> CULTISTLEADER_CHESTPLATE = ITEMS.register("cultistleader_chestplate",
            () -> new Cultistleader_Armor(ModArmorMaterial.CULTISTLEADER_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Cultistleader_Armor> CULTISTLEADER_LEGGINGS = ITEMS.register("cultistleader_leggings",
            () -> new Cultistleader_Armor(ModArmorMaterial.CULTISTLEADER_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    //血腥邪徒
    public static final RegistryObject<Cultistrobe_Armor> CULTISTROBE_HELMET = ITEMS.register("cultistrobe_helmet",
            () -> new Cultistrobe_Armor(ModArmorMaterial.CULTISTROBE_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Cultistrobe_Armor> CULTISTROBE_CHESTPLATE = ITEMS.register("cultistrobe_chestplate",
            () -> new Cultistrobe_Armor(ModArmorMaterial.CULTISTROBE_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Cultistrobe_Armor> CULTISTROBE_LEGGINGS = ITEMS.register("cultistrobe_leggings",
            () -> new Cultistrobe_Armor(ModArmorMaterial.CULTISTROBE_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Cultistrobe_Armor> CULTISTROBE_BOOTS = ITEMS.register("cultistrobe_boots",
            () -> new Cultistrobe_Armor(ModArmorMaterial.CULTISTROBE_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));
    //血腥骑士
    public static final RegistryObject<Cultistplate_Armor> CULTISTPLATE_HELMET = ITEMS.register("cultistplate_helmet",
            () -> new Cultistplate_Armor(ModArmorMaterial.CULTISTPLATE_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Cultistplate_Armor> CULTISTPLATE_CHESTPLATE = ITEMS.register("cultistplate_chestplate",
            () -> new Cultistplate_Armor(ModArmorMaterial.CULTISTPLATE_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Cultistplate_Armor> CULTISTPLATE_LEGGINGS = ITEMS.register("cultistplate_leggings",
            () -> new Cultistplate_Armor(ModArmorMaterial.CULTISTPLATE_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Cultistplate_Armor> CULTISTPLATE_BOOTS = ITEMS.register("cultistplate_boots",
            () -> new Cultistplate_Armor(ModArmorMaterial.CULTISTPLATE_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    //流体桶
    public static final RegistryObject<Item> DEATHWATER_BUCKET = ITEMS.register("deathwater_bucket",
            () -> new BucketItem(ModFluids.SOURCE_DEATHWATER, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    //要素
    //原始要素
    public static final RegistryObject<Item> UNKNOWN = ITEMS.register("aspect_unknown",
            () -> new PrimalAspect(new Item.Properties(),0x404040,0));
    public static final RegistryObject<Item> AIR = ITEMS.register("aspect_aer",
            () -> new PrimalAspect(new Item.Properties(),0xffff7e,1));
    public static final RegistryObject<Item> FIRE = ITEMS.register("aspect_ignis",
            () -> new PrimalAspect(new Item.Properties(), 0xff5a01, 1));
    public static final RegistryObject<Item> WATER = ITEMS.register("aspect_aqua",
            () -> new PrimalAspect(new Item.Properties(), 0x3cd4fc, 1));
    public static final RegistryObject<Item> EARTH = ITEMS.register("aspect_terra",
            () -> new PrimalAspect(new Item.Properties(), 0x56c000, 1));
    public static final RegistryObject<Item> ORDER = ITEMS.register("aspect_ordo",
            () -> new PrimalAspect(new Item.Properties(), 0xd5d4ec, 1));
    public static final RegistryObject<Item> ENTROPY = ITEMS.register("aspect_perditio",
            () -> new PrimalAspect(new Item.Properties(), 0x404040, 1));

    //二级复合要素
    public static final RegistryObject<Item> VOID = ITEMS.register("aspect_vacuos",
            () -> new CompoundAspect(new Item.Properties(),0x888888, new RegistryObject[] {AIR, ENTROPY}));
    public static final RegistryObject<Item> LIGHT = ITEMS.register("aspect_lux",
            () -> new CompoundAspect(new Item.Properties(),0xfff663, new RegistryObject[] {AIR, FIRE}));
    public static final RegistryObject<Item> WEATHER = ITEMS.register("aspect_tempestas",
            () -> new CompoundAspect(new Item.Properties(),0xFFFFFF, new RegistryObject[] {AIR, WATER}));
    public static final RegistryObject<Item> MOTION = ITEMS.register("aspect_motus",
            () -> new CompoundAspect(new Item.Properties(),0xcdccf4, new RegistryObject[] {AIR, ORDER}));
    public static final RegistryObject<Item> COLD = ITEMS.register("aspect_gelum",
            () -> new CompoundAspect(new Item.Properties(),0xe1ffff, new RegistryObject[] {FIRE, ENTROPY}));
    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("aspect_vitreus",
            () -> new CompoundAspect(new Item.Properties(),0x80ffff, new RegistryObject[] {EARTH, ORDER}));
    public static final RegistryObject<Item> LIFE = ITEMS.register("aspect_victus",
            () -> new CompoundAspect(new Item.Properties(),0xde0005, new RegistryObject[] {WATER, EARTH}));
    public static final RegistryObject<Item> POISON = ITEMS.register("aspect_venenum",
            () -> new CompoundAspect(new Item.Properties(),0x89f000,  new RegistryObject[] {WATER, ENTROPY}));
    public static final RegistryObject<Item> ENERGY = ITEMS.register("aspect_potentia",
            () -> new CompoundAspect(new Item.Properties(),0xc0ffff, new RegistryObject[] {ORDER, FIRE}));
    public static final RegistryObject<Item> EXCHANGE = ITEMS.register("aspect_permutatio",
            () -> new CompoundAspect(new Item.Properties(),0x578357, new RegistryObject[] {ENTROPY, ORDER}));
    
    //三级复合要素
    public static final RegistryObject<Item> METAL = ITEMS.register("aspect_metallum",
            () -> new CompoundAspect(new Item.Properties(),0xb5b5cd, new RegistryObject[] {EARTH, CRYSTAL}));
    public static final RegistryObject<Item> DEATH = ITEMS.register("aspect_mortuus",
            () -> new CompoundAspect(new Item.Properties(),0x887788, new RegistryObject[] {LIFE, ENTROPY}));
    public static final RegistryObject<Item> FLIGHT = ITEMS.register("aspect_volatus",
            () -> new CompoundAspect(new Item.Properties(),0xe7e7d7, new RegistryObject[] {AIR, MOTION}));
    public static final RegistryObject<Item> DARKNESS = ITEMS.register("aspect_tenebrae",
            () -> new CompoundAspect(new Item.Properties(),0x222222, new RegistryObject[] {VOID, LIGHT}));
    public static final RegistryObject<Item> SOUL = ITEMS.register("aspect_spiritus",
            () -> new CompoundAspect(new Item.Properties(),0xebebfb, new RegistryObject[] {LIFE, DEATH}));
    public static final RegistryObject<Item> HEAL = ITEMS.register("aspect_sano",
            () -> new CompoundAspect(new Item.Properties(),0xff2f34, new RegistryObject[] {LIFE, ORDER}));
    public static final RegistryObject<Item> TRAVEL = ITEMS.register("aspect_iter",
            () -> new CompoundAspect(new Item.Properties(),0xe0585b, new RegistryObject[] {MOTION, EARTH}));
    public static final RegistryObject<Item> ELDRITCH = ITEMS.register("aspect_alienis",
            () -> new CompoundAspect(new Item.Properties(),0x805080, new RegistryObject[] {VOID, DARKNESS}));
    public static final RegistryObject<Item> MAGIC = ITEMS.register("aspect_praecantatio",
            () -> new CompoundAspect(new Item.Properties(),0x9700c0, new RegistryObject[] {VOID, ENERGY}));
    public static final RegistryObject<Item> AURA = ITEMS.register("aspect_auram",
            () -> new CompoundAspect(new Item.Properties(),0xffc0ff, new RegistryObject[] {MAGIC, AIR}));
    public static final RegistryObject<Item> TAINT = ITEMS.register("aspect_vitium",
            () -> new CompoundAspect(new Item.Properties(),0x800080, new RegistryObject[] {MAGIC, ENTROPY}));
    public static final RegistryObject<Item> SLIME = ITEMS.register("aspect_limus",
            () -> new CompoundAspect(new Item.Properties(),0x01f800, new RegistryObject[] {LIFE, WATER}));
    public static final RegistryObject<Item> PLANT = ITEMS.register("aspect_herba",
            () -> new CompoundAspect(new Item.Properties(),0x01ac00, new RegistryObject[] {LIFE, EARTH}));
    public static final RegistryObject<Item> TREE = ITEMS.register("aspect_arbor",
            () -> new CompoundAspect(new Item.Properties(),0x876531, new RegistryObject[] {AIR, PLANT}));
    public static final RegistryObject<Item> BEAST = ITEMS.register("aspect_bestia",
            () -> new CompoundAspect(new Item.Properties(),0x9f6409, new RegistryObject[] {MOTION, LIFE}));
    public static final RegistryObject<Item> FLESH = ITEMS.register("aspect_corpus",
            () -> new CompoundAspect(new Item.Properties(),0xee478d, new RegistryObject[] {DEATH, BEAST}));
    public static final RegistryObject<Item> UNDEAD = ITEMS.register("aspect_exanimis",
            () -> new CompoundAspect(new Item.Properties(),0x3a4000, new RegistryObject[] {MOTION, DEATH}));
    public static final RegistryObject<Item> MIND = ITEMS.register("aspect_cognitio",
            () -> new CompoundAspect(new Item.Properties(),0xffc2b3, new RegistryObject[] {FIRE, SOUL}));
    public static final RegistryObject<Item> SENSES = ITEMS.register("aspect_sensus",
            () -> new CompoundAspect(new Item.Properties(),0x0fd9ff, new RegistryObject[] {AIR, SOUL}));
    public static final RegistryObject<Item> HUMAN = ITEMS.register("aspect_humanus",
            () -> new CompoundAspect(new Item.Properties(),0xffd7c0, new RegistryObject[] {BEAST, MIND}));
    public static final RegistryObject<Item> CROP = ITEMS.register("aspect_messis",
            () -> new CompoundAspect(new Item.Properties(),0xe1b371, new RegistryObject[] {PLANT, HUMAN}));
    public static final RegistryObject<Item> MINE = ITEMS.register("aspect_perfodio",
            () -> new CompoundAspect(new Item.Properties(),0xdcd2d8, new RegistryObject[] {HUMAN, EARTH}));
    public static final RegistryObject<Item> TOOL = ITEMS.register("aspect_instrumentum",
            () -> new CompoundAspect(new Item.Properties(),0x4040ee, new RegistryObject[] {HUMAN, ORDER}));
    public static final RegistryObject<Item> HARVEST = ITEMS.register("aspect_meto",
            () -> new CompoundAspect(new Item.Properties(),0xeead82, new RegistryObject[] {CROP, TOOL}));
    public static final RegistryObject<Item> WEAPON = ITEMS.register("aspect_telum",
            () -> new CompoundAspect(new Item.Properties(),0xc05050, new RegistryObject[] {TOOL, FIRE}));
    public static final RegistryObject<Item> ARMOR = ITEMS.register("aspect_tutamen",
            () -> new CompoundAspect(new Item.Properties(),0x00c0c0, new RegistryObject[] {TOOL, EARTH}));
    public static final RegistryObject<Item> HUNGER = ITEMS.register("aspect_fames",
            () -> new CompoundAspect(new Item.Properties(),0x9a0305, new RegistryObject[] {LIFE, VOID}));
    public static final RegistryObject<Item> GREED = ITEMS.register("aspect_lucrum",
            () -> new CompoundAspect(new Item.Properties(),0xe6be44, new RegistryObject[] {HUMAN, HUNGER}));
    public static final RegistryObject<Item> CRAFT = ITEMS.register("aspect_fabrico",
            () -> new CompoundAspect(new Item.Properties(),0x809d80, new RegistryObject[] {HUMAN, TOOL}));
    public static final RegistryObject<Item> CLOTH = ITEMS.register("aspect_pannus",
            () -> new CompoundAspect(new Item.Properties(),0xeaeac2, new RegistryObject[] {TOOL, BEAST}));
    public static final RegistryObject<Item> MECHANISM = ITEMS.register("aspect_machina",
            () -> new CompoundAspect(new Item.Properties(),0x8080a0, new RegistryObject[] {MOTION, TOOL}));
    public static final RegistryObject<Item> TRAP = ITEMS.register("aspect_vinculum",
            () -> new CompoundAspect(new Item.Properties(),0x9a8080, new RegistryObject[] {MOTION, ENTROPY}));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
