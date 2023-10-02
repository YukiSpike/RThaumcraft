package com.Yuki_Spike.rthaumcraft.world.feature;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.init.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;


public class ModConfigureFeature {

        public static final ResourceKey<ConfiguredFeature<? ,?>> OVERWORLD_AMBER_ORE_KEY = registerKey("ore_amber");
        public static final ResourceKey<ConfiguredFeature<? ,?>> OVERWORLD_CINNIBAR_ORE_KEY = registerKey("ore_cinnibar");
        public static final ResourceKey<ConfiguredFeature<? ,?>> OVERWORLD_SHARD_AER_ORE_KEY = registerKey("ore_shard_aer");
        public static final ResourceKey<ConfiguredFeature<? ,?>> OVERWORLD_SHARD_FIRE_ORE_KEY = registerKey("ore_shard_fire");
        public static final ResourceKey<ConfiguredFeature<? ,?>> OVERWORLD_SHARD_WATER_ORE_KEY = registerKey("ore_shard_water");
        public static final ResourceKey<ConfiguredFeature<? ,?>> OVERWORLD_SHARD_EARTH_ORE_KEY = registerKey("ore_shard_earth");
        public static final ResourceKey<ConfiguredFeature<? ,?>> OVERWORLD_SHARD_ORDER_ORE_KEY = registerKey("ore_shard_order");
        public static final ResourceKey<ConfiguredFeature<? ,?>> OVERWORLD_SHARD_ENTROPY_ORE_KEY = registerKey("ore_shard_entropy");

        public static final ResourceKey<ConfiguredFeature<?, ?>> GREAT_TREE_KEY = registerKey("great_tree");
        public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
                RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
                RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
                RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
                RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

                List<OreConfiguration.TargetBlockState> OVERWORLD_AMBER_ORES = List.of(OreConfiguration.target(stoneReplaceables,
                                ModBlocks.ORE_AMBER.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.ORE_DEEPSLATE_AMBER.get().defaultBlockState()));
                List<OreConfiguration.TargetBlockState> OVERWORLD_CINNIBAR_ORES = List.of(OreConfiguration.target(stoneReplaceables,
                                ModBlocks.ORE_CINNIBAR.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.ORE_DEEPSLATE_CINNIBAR.get().defaultBlockState()));

                List<OreConfiguration.TargetBlockState> OVERWORLD_SHARD_AER_ORES = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_SHARD_AER.get().defaultBlockState()));
                List<OreConfiguration.TargetBlockState> OVERWORLD_SHARD_FIRE_ORES = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_SHARD_FIRE.get().defaultBlockState()));
                List<OreConfiguration.TargetBlockState> OVERWORLD_SHARD_WATER_ORES = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_SHARD_WATER.get().defaultBlockState()));
                List<OreConfiguration.TargetBlockState> OVERWORLD_SHARD_EARTH_ORES = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_SHARD_EARTH.get().defaultBlockState()));
                List<OreConfiguration.TargetBlockState> OVERWORLD_SHARD_ORDER_ORES = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_SHARD_ORDER.get().defaultBlockState()));
                List<OreConfiguration.TargetBlockState> OVERWORLD_SHARD_ENTROPY_ORES = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ORE_SHARD_ENTROPY.get().defaultBlockState()));

                register(context, OVERWORLD_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_AMBER_ORES, 1));
                register(context, OVERWORLD_CINNIBAR_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_CINNIBAR_ORES, 1));

                register(context, OVERWORLD_SHARD_AER_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_AER_ORES, 10));
                register(context, OVERWORLD_SHARD_FIRE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_FIRE_ORES, 10));
                register(context, OVERWORLD_SHARD_WATER_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_WATER_ORES, 10));
                register(context, OVERWORLD_SHARD_EARTH_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_EARTH_ORES, 10));
                register(context, OVERWORLD_SHARD_ORDER_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_ORDER_ORES, 10));
                register(context, OVERWORLD_SHARD_ENTROPY_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_ENTROPY_ORES, 10));

                register(context, GREAT_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(ModBlocks.GREAT_LOG.get()),
                        new StraightTrunkPlacer(5, 6, 3),
                        BlockStateProvider.simple(ModBlocks.GREAT_LEAVES.get()),
                        new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                        new TwoLayersFeatureSize(1, 0, 2)).build());
        }

        public static ResourceKey<ConfiguredFeature<? ,?>> registerKey(String name) {
                return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(RThaumcraft.MODID, name));
        }
        private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
                context.register(key, new ConfiguredFeature<>(feature, configuration));
        }
}