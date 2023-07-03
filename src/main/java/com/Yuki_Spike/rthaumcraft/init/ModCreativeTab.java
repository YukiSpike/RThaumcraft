package com.Yuki_Spike.rthaumcraft.init;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.stream.Stream;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RThaumcraft.MODID);


    public static final RegistryObject<CreativeModeTab> RTHAUMCRAFT_ITEM_TAB = CREATIVE_MODE_TABS.register("rthaumcraft_item_tab", () -> CreativeModeTab.builder()
    .withTabsBefore(CreativeModeTabs.COMBAT)
    .icon(() -> ModItems.THAUMONOMICON.get().getDefaultInstance())
    .title(Component.translatable("itemGroup." + RThaumcraft.MODID + ".item_tab"))
    .displayItems((parameters, output) -> {
        output.acceptAll(Stream.of(
                ModItems.THAUMONOMICON,
                ModItems.THAUMONOMICON_CHEAT,
                ModItems.SCRIBING_TOOLS,
                ModItems.CINNABAR_CLUSTER,
                ModItems.QUICKSILVER,
                ModItems.AMBER,
                ModItems.THAUMIUM_INGOT,
                ModItems.VOID_INGOT,
                ModItems.COPPER_NUGGET,
                ModItems.QUICKSILVER_NUGGET,
                ModItems.THAUMIUM_NUGGET,
                ModItems.VOID_NUGGET,
                ModItems.SALIS_MUNDUS,
                ModItems.SHARD_BALANCED,
                ModItems.SHARD_AER,
                ModItems.SHARD_FIRE,
                ModItems.SHARD_WATER,
                ModItems.SHARD_EARTH,
                ModItems.SHARD_ORDER,
                ModItems.SHARD_ENTROPY,
                ModItems.PRIMAL_CHARM,
                ModItems.PRIMORDIAL_PEARL,
                ModItems.CRYSTALLIZED_ESSENCE,
                ModItems.KNOWLEDGE_FRAGMENT,
                ModItems.TALLOW,
                ModItems.ENCHANTED_FABRIC,
                ModItems.MIRRORED_GLASS,
                ModItems.VIS_FILTER,
                ModItems.COIN,
                ModItems.TAINT_SLIME,
                ModItems.TAINT_TENDRIL,

                ModItems.THAUMIUM_HELMET,
                ModItems.THAUMIUM_CHESTPLATE,
                ModItems.THAUMIUM_LEGGINGS,
                ModItems.THAUMIUM_BOOTS,
                ModItems.VOID_HELMET,
                ModItems.VOID_CHESTPLATE,
                ModItems.VOID_LEGGINGS,
                ModItems.VOID_BOOTS,

                ModItems.BONEBOW,
                ModItems.CRIMSON_BLADE,
                ModItems.THAUMIUM_SWORD,
                ModItems.THAUMIUM_PICKAXE,
                ModItems.THAUMIUM_AXE,
                ModItems.THAUMIUM_SHOVEL,
                ModItems.THAUMIUM_HOE,
                ModItems.VOID_SWORD,
                ModItems.VOID_PICKAXE,
                ModItems.VOID_SHOVEL,
                ModItems.VOID_HOE,
                ModItems.VOID_AXE,

                ModItems.GOLEMANCERS_BELL,
                ModItems.GOLEM_CORE_BLANK,
                ModItems.GOLEM_CORE_BUTCHER,
                ModItems.GOLEM_CORE_EMPTY,
                ModItems.GOLEM_CORE_ESSENTIA,
                ModItems.GOLEM_CORE_FILL,
                ModItems.GOLEM_CORE_FISH,
                ModItems.GOLEM_CORE_GATHER,
                ModItems.GOLEM_CORE_GUARD,
                ModItems.GOLEM_CORE_HARVEST,
                ModItems.GOLEM_CORE_LIQUID,
                ModItems.GOLEM_CORE_LUMBER,
                ModItems.GOLEM_CORE_PATROL,
                ModItems.GOLEM_CORE_SORTING,
                ModItems.GOLEM_CORE_USE,
                ModItems.GOLEM_UPGRADE_AER,
                ModItems.GOLEM_UPGRADE_FIRE,
                ModItems.GOLEM_UPGRADE_WATER,
                ModItems.GOLEM_UPGRADE_EARTH,
                ModItems.GOLEM_UPGRADE_ORDER,
                ModItems.GOLEM_UPGRADE_ENTROPY,

                ModFoods.ZOMBIE_BRAIN,
                ModFoods.TRIPLE_MEAT_TREAT

                ).map(sup -> {
					return sup.get().getDefaultInstance();
				}).toList());
			}).build());

    public static final RegistryObject<CreativeModeTab> RTHAUMCRAFT_BLOCK_TAB = CREATIVE_MODE_TABS.register("rthaumcraft_block_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(RTHAUMCRAFT_ITEM_TAB.getKey())
            .icon(() -> ModItems.ARCANE_STONE.get().getDefaultInstance())
            .title(Component.translatable("itemGroup." + RThaumcraft.MODID + ".block_tab"))
            .displayItems((parameters, output) -> {
                output.acceptAll(Stream.of(
                        ModItems.GREAT_SAPLING,
                        ModItems.GREAT_LEAVES,
                        ModItems.GREAT_LOG,
                        ModItems.GREAT_WOOD,
                        ModItems.STRIPPED_GREAT_LOG,
                        ModItems.STRIPPED_GREAT_WOOD,
                        ModItems.GREAT_PLANKS,
                        ModItems.GREAT_STAIRS,
                        ModItems.GREAT_SLAB,
                        ModItems.GREAT_FENCE,
                        ModItems.GREAT_FENCE_GATE,
                        ModItems.GREAT_DOOR,
                        ModItems.GREAT_TRAPDOOR,
                        ModItems.GREAT_BUTTON,
                        ModItems.GREAT_PRESSURE_PLATE,
                        ModItems.GREAT_SIGN,
                        ModItems.GREAT_HANGING_SIGN,
                        ModItems.SILVER_SAPLING,
                        ModItems.SILVER_LEAVES,
                        ModItems.SILVER_LOG,
                        ModItems.SILVER_WOOD,
                        ModItems.STRIPPED_SILVER_LOG,
                        ModItems.STRIPPED_SILVER_WOOD,
                        ModItems.SILVER_PLANKS,
                        ModItems.SILVER_STAIRS,
                        ModItems.SILVER_SLAB,
                        ModItems.SILVER_FENCE,
                        ModItems.SILVER_FENCE_GATE,
                        ModItems.SILVER_DOOR,
                        ModItems.SILVER_TRAPDOOR,
                        ModItems.SILVER_BUTTON,
                        ModItems.SILVER_PRESSURE_PLATE,
                        ModItems.SILVER_SIGN,
                        ModItems.SILVER_HANGING_SIGN,
                        ModItems.ARCANE_STONE,
                        ModItems.THAUMIUM_BLOCK,
                        ModItems.VOID_BLOCK,
                        ModItems.FLESH_BLOCK,
                        ModItems.TALLOW_BLOCK,
                        ModItems.TABLE,
                        ModItems.TABLE_CRAFT,
                        ModItems.TABLE_RESEARCH,

                        ModItems.ORE_AMBER,
                        ModItems.ORE_DEEPSLATE_AMBER,
                        ModItems.ORE_CINNIBAR,
                        ModItems.ORE_DEEPSLATE_CINNIBAR,
                        ModItems.ORE_SHARD_AER,
                        ModItems.ORE_SHARD_FIRE,
                        ModItems.ORE_SHARD_WATER,
                        ModItems.ORE_SHARD_EARTH,
                        ModItems.ORE_SHARD_ORDER,
                        ModItems.ORE_SHARD_ENTROPY
                ).map(sup -> {
                    return sup.get().getDefaultInstance();
                }).toList());
            }).build());

    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
