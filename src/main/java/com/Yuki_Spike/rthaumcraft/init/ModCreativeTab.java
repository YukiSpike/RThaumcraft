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


    public static final RegistryObject<CreativeModeTab> RTHAUMCRAFT_TAB = CREATIVE_MODE_TABS.register("rthaumcraft_tab", () -> CreativeModeTab.builder()
    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
    .icon(() -> ModItems.THAUMONOMICON.get().getDefaultInstance())
    .title(Component.translatable("itemGroup." + RThaumcraft.MODID + ".tab"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.DEATHWATER_BUCKET.get());
                output.accept(ModItems.THAUMONOMICON.get());
                output.accept(ModItems.THAUMONOMICON_CHEAT.get());
                output.accept(ModItems.CRIMSON_RITES.get());
                output.accept(ModItems.SCRIBING_TOOLS.get());
                output.accept(ModItems.CINNABAR_CLUSTER.get());
                output.accept(ModItems.QUICKSILVER.get());
                output.accept(ModItems.AMBER.get());
                output.accept(ModItems.THAUMIUM_INGOT.get());
                output.accept(ModItems.VOID_INGOT.get());
                output.accept(ModItems.COPPER_NUGGET.get());
                output.accept(ModItems.QUICKSILVER_NUGGET.get());
                output.accept(ModItems.THAUMIUM_NUGGET.get());
                output.accept(ModItems.VOID_NUGGET.get());
                output.accept(ModItems.SALIS_MUNDUS.get());
                output.accept(ModItems.SHARD_BALANCED.get());
                output.accept(ModItems.SHARD_AER.get());
                output.accept(ModItems.SHARD_FIRE.get());
                output.accept(ModItems.SHARD_WATER.get());
                output.accept(ModItems.SHARD_EARTH.get());
                output.accept(ModItems.SHARD_ORDER.get());
                output.accept(ModItems.SHARD_ENTROPY.get());
                output.accept(ModItems.PRIMAL_CHARM.get());
                output.accept(ModItems.PRIMORDIAL_PEARL.get());
                output.accept(ModItems.CRYSTALLIZED_ESSENCE.get());
                output.accept(ModItems.KNOWLEDGE_FRAGMENT.get());
                output.accept(ModItems.TALLOW.get());
                output.accept(ModItems.ENCHANTED_FABRIC.get());
                output.accept(ModItems.MIRRORED_GLASS.get());
                output.accept(ModItems.VIS_FILTER.get());
                output.accept(ModItems.COIN.get());
                output.accept(ModItems.TAINT_SLIME.get());
                output.accept(ModItems.TAINT_TENDRIL.get());

                output.accept(ModItems.THAUMIUM_HELMET.get());
                output.accept(ModItems.THAUMIUM_CHESTPLATE.get());
                output.accept(ModItems.THAUMIUM_LEGGINGS.get());
                output.accept(ModItems.THAUMIUM_BOOTS.get());
                output.accept(ModItems.VOID_HELMET.get());
                output.accept(ModItems.VOID_CHESTPLATE.get());
                output.accept(ModItems.VOID_LEGGINGS.get());
                output.accept(ModItems.VOID_BOOTS.get());
                output.accept(ModItems.THAUMIUMFORTRESS_HELMET.get());
                output.accept(ModItems.THAUMIUMFORTRESS_CHESTPLATE.get());
                output.accept(ModItems.THAUMIUMFORTRESS_LEGGINGS.get());
                output.accept(ModItems.CULTISTLEADER_HELMET.get());
                output.accept(ModItems.CULTISTLEADER_CHESTPLATE.get());
                output.accept(ModItems.CULTISTLEADER_LEGGINGS.get());
                output.accept(ModItems.CULTISTROBE_HELMET.get());
                output.accept(ModItems.CULTISTROBE_CHESTPLATE.get());
                output.accept(ModItems.CULTISTROBE_LEGGINGS.get());
                output.accept(ModItems.CULTISTROBE_BOOTS.get());
                output.accept(ModItems.CULTISTPLATE_HELMET.get());
                output.accept(ModItems.CULTISTPLATE_CHESTPLATE.get());
                output.accept(ModItems.CULTISTPLATE_LEGGINGS.get());
                output.accept(ModItems.CULTISTPLATE_BOOTS.get());

                output.accept(ModItems.BONEBOW.get());
                output.accept(ModItems.CRIMSON_BLADE.get());
                output.accept(ModItems.THAUMIUM_SWORD.get());
                output.accept(ModItems.THAUMIUM_PICKAXE.get());
                output.accept(ModItems.THAUMIUM_AXE.get());
                output.accept(ModItems.THAUMIUM_SHOVEL.get());
                output.accept(ModItems.THAUMIUM_HOE.get());
                output.accept(ModItems.VOID_SWORD.get());
                output.accept(ModItems.VOID_PICKAXE.get());
                output.accept(ModItems.VOID_SHOVEL.get());
                output.accept(ModItems.VOID_HOE.get());
                output.accept(ModItems.VOID_AXE.get());
                output.accept(ModItems.ZEPHYR_SWORD.get());
                output.accept(ModItems.CORE_PICKAXE.get());
                output.accept(ModItems.EARTHMOVER_SHOVEL.get());
                output.accept(ModItems.GROWTH_HOE.get());
                output.accept(ModItems.STREAM_AXE.get());

                output.accept(ModItems.CAP_IRON.get());
                output.accept(ModItems.CAP_COPPER.get());
                output.accept(ModItems.CAP_GOLD.get());
                output.accept(ModItems.CAP_THAUMIUM_INERT.get());
                output.accept(ModItems.CAP_THAUMIUM.get());
                output.accept(ModItems.CAP_VOID_INERT.get());
                output.accept(ModItems.CAP_VOID.get());

                output.accept(ModItems.ROD_GREATWOOD.get());
                output.accept(ModItems.ROD_SILVERWOOD.get());
                output.accept(ModItems.ROD_REED.get());
                output.accept(ModItems.ROD_BLAZE.get());
                output.accept(ModItems.ROD_ICE.get());
                output.accept(ModItems.ROD_OBSIDIAN.get());
                output.accept(ModItems.ROD_QUARTZ.get());
                output.accept(ModItems.ROD_BONE.get());

                output.accept(ModItems.ROD_STAFF_GREATWOOD.get());
                output.accept(ModItems.ROD_STAFF_SILVERWOOD.get());
                output.accept(ModItems.ROD_STAFF_REED.get());
                output.accept(ModItems.ROD_STAFF_BLAZE.get());
                output.accept(ModItems.ROD_STAFF_ICE.get());
                output.accept(ModItems.ROD_STAFF_OBSIDIAN.get());
                output.accept(ModItems.ROD_STAFF_QUARTZ.get());
                output.accept(ModItems.ROD_STAFF_BONE.get());
                output.accept(ModItems.ROD_STAFF_PRIMAL.get());

                output.accept(ModItems.WAND_WOOD_IRON.get());
                output.accept(ModItems.WAND_WOOD_COPPER.get());

                output.accept(ModItems.GOLEMANCERS_BELL.get());
                output.accept(ModItems.GOLEM_CORE_BLANK.get());
                output.accept(ModItems.GOLEM_CORE_BUTCHER.get());
                output.accept(ModItems.GOLEM_CORE_EMPTY.get());
                output.accept(ModItems.GOLEM_CORE_ESSENTIA.get());
                output.accept(ModItems.GOLEM_CORE_FILL.get());
                output.accept(ModItems.GOLEM_CORE_FISH.get());
                output.accept(ModItems.GOLEM_CORE_GATHER.get());
                output.accept(ModItems.GOLEM_CORE_GUARD.get());
                output.accept(ModItems.GOLEM_CORE_HARVEST.get());
                output.accept(ModItems.GOLEM_CORE_LIQUID.get());
                output.accept(ModItems.GOLEM_CORE_LUMBER.get());
                output.accept(ModItems.GOLEM_CORE_SORTING.get());
                output.accept(ModItems.GOLEM_CORE_USE.get());
                output.accept(ModItems.GOLEM_UPGRADE_AER.get());
                output.accept(ModItems.GOLEM_UPGRADE_FIRE.get());
                output.accept(ModItems.GOLEM_UPGRADE_WATER.get());
                output.accept(ModItems.GOLEM_UPGRADE_EARTH.get());
                output.accept(ModItems.GOLEM_UPGRADE_ORDER.get());
                output.accept(ModItems.GOLEM_UPGRADE_ENTROPY.get());

                output.accept(ModItems.UNKNOWN.get());
                output.accept(ModItems.AIR.get());
                output.accept(ModItems.FIRE.get());
                output.accept(ModItems.WATER.get());
                output.accept(ModItems.EARTH.get());
                output.accept(ModItems.ORDER.get());
                output.accept(ModItems.ENTROPY.get());

                output.accept(ModItems.VOID.get());
                output.accept(ModItems.LIGHT.get());
                output.accept(ModItems.WEATHER.get());
                output.accept(ModItems.MOTION.get());
                output.accept(ModItems.COLD.get());
                output.accept(ModItems.CRYSTAL.get());
                output.accept(ModItems.LIFE.get());
                output.accept(ModItems.POISON.get());
                output.accept(ModItems.ENERGY.get());
                output.accept(ModItems.EXCHANGE.get());

                output.accept(ModItems.METAL.get());
                output.accept(ModItems.DEATH.get());
                output.accept(ModItems.FLIGHT.get());
                output.accept(ModItems.DARKNESS.get());
                output.accept(ModItems.SOUL.get());
                output.accept(ModItems.HEAL.get());
                output.accept(ModItems.TRAVEL.get());
                output.accept(ModItems.ELDRITCH.get());
                output.accept(ModItems.MAGIC.get());
                output.accept(ModItems.AURA.get());
                output.accept(ModItems.TAINT.get());
                output.accept(ModItems.SLIME.get());
                output.accept(ModItems.PLANT.get());
                output.accept(ModItems.TREE.get());
                output.accept(ModItems.BEAST.get());
                output.accept(ModItems.FLESH.get());
                output.accept(ModItems.UNDEAD.get());
                output.accept(ModItems.MIND.get());
                output.accept(ModItems.SENSES.get());
                output.accept(ModItems.HUMAN.get());
                output.accept(ModItems.CROP.get());
                output.accept(ModItems.MINE.get());
                output.accept(ModItems.TOOL.get());
                output.accept(ModItems.HARVEST.get());
                output.accept(ModItems.WEAPON.get());
                output.accept(ModItems.ARMOR.get());
                output.accept(ModItems.HUNGER.get());
                output.accept(ModItems.GREED.get());
                output.accept(ModItems.CRAFT.get());
                output.accept(ModItems.CLOTH.get());
                output.accept(ModItems.MECHANISM.get());
                output.accept(ModItems.TRAP.get());

                output.accept(ModFoods.ZOMBIE_BRAIN.get());
                output.accept(ModFoods.TRIPLE_MEAT_TREAT.get());

                output.accept(ModBlocks.GREAT_SAPLING.get());
                output.accept(ModBlocks.GREAT_LEAVES.get());
                output.accept(ModBlocks.GREAT_LOG.get());
                output.accept(ModBlocks.GREAT_WOOD.get());
                output.accept(ModBlocks.STRIPPED_GREAT_LOG.get());
                output.accept(ModBlocks.STRIPPED_GREAT_WOOD.get());
                output.accept(ModBlocks.GREAT_PLANKS.get());
                output.accept(ModBlocks.GREAT_STAIRS.get());
                output.accept(ModBlocks.GREAT_SLAB.get());
                output.accept(ModBlocks.GREAT_FENCE.get());
                output.accept(ModBlocks.GREAT_FENCE_GATE.get());
                output.accept(ModBlocks.GREAT_DOOR.get());
                output.accept(ModBlocks.GREAT_TRAPDOOR.get());
                output.accept(ModBlocks.GREAT_BUTTON.get());
                output.accept(ModBlocks.GREAT_PRESSURE_PLATE.get());
                output.accept(ModBlocks.GREAT_SIGN.get());
                output.accept(ModBlocks.GREAT_HANGING_SIGN.get());
                output.accept(ModBlocks.SILVER_SAPLING.get());
                output.accept(ModBlocks.SILVER_LEAVES.get());
                output.accept(ModBlocks.SILVER_LOG.get());
                output.accept(ModBlocks.SILVER_WOOD.get());
                output.accept(ModBlocks.STRIPPED_SILVER_LOG.get());
                output.accept(ModBlocks.STRIPPED_SILVER_WOOD.get());
                output.accept(ModBlocks.SILVER_PLANKS.get());
                output.accept(ModBlocks.SILVER_STAIRS.get());
                output.accept(ModBlocks.SILVER_SLAB.get());
                output.accept(ModBlocks.SILVER_FENCE.get());
                output.accept(ModBlocks.SILVER_FENCE_GATE.get());
                output.accept(ModBlocks.SILVER_DOOR.get());
                output.accept(ModBlocks.SILVER_TRAPDOOR.get());
                output.accept(ModBlocks.SILVER_BUTTON.get());
                output.accept(ModBlocks.SILVER_PRESSURE_PLATE.get());
                output.accept(ModBlocks.SILVER_SIGN.get());
                output.accept(ModBlocks.SILVER_HANGING_SIGN.get());

                output.accept(ModBlocks.ARCANE_STONE.get());
                output.accept(ModBlocks.ARCANE_STONE_STAIRS.get());
                output.accept(ModBlocks.ARCANE_STONE_SLAB.get());
                output.accept(ModBlocks.ARCANE_STONE_WALL.get());
                output.accept(ModBlocks.ARCANE_BLOCK.get());
                output.accept(ModBlocks.ARCANE_BLOCK_STAIRS.get());
                output.accept(ModBlocks.ARCANE_BLOCK_SLAB.get());
                output.accept(ModBlocks.ARCANE_BLOCK_WALL.get());
                output.accept(ModBlocks.ARCANE_DOOR.get());
                output.accept(ModBlocks.ARCANE_PRESSURE_PLATE.get());
                output.accept(ModBlocks.THAUMIUM_BLOCK.get());
                output.accept(ModBlocks.VOID_BLOCK.get());
                output.accept(ModBlocks.FLESH_BLOCK.get());
                output.accept(ModBlocks.TALLOW_BLOCK.get());
                output.accept(ModBlocks.TABLE.get());
                output.accept(ModBlocks.TABLE_CRAFT.get());
                output.accept(ModBlocks.TABLE_RESEARCH.get());
                output.accept(ModBlocks.ARCANE_LAMP.get());
                output.accept(ModBlocks.ARCANE_LAMP_GROWTH.get());
                output.accept(ModBlocks.ARCANE_LAMP_FERTILITY.get());
                output.accept(ModBlocks.ALCHEMICAL_FURNACE.get());
                
                output.accept(ModBlocks.ORE_AMBER.get());
                output.accept(ModBlocks.ORE_DEEPSLATE_AMBER.get());
                output.accept(ModBlocks.ORE_CINNIBAR.get());
                output.accept(ModBlocks.ORE_DEEPSLATE_CINNIBAR.get());
                output.accept(ModBlocks.ORE_SHARD_AER.get());
                output.accept(ModBlocks.ORE_SHARD_FIRE.get());
                output.accept(ModBlocks.ORE_SHARD_WATER.get());
                output.accept(ModBlocks.ORE_SHARD_EARTH.get());
                output.accept(ModBlocks.ORE_SHARD_ORDER.get());
                output.accept(ModBlocks.ORE_SHARD_ENTROPY.get());
            }).build());

    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
