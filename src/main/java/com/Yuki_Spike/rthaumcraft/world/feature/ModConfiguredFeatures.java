package com.Yuki_Spike.rthaumcraft.world.feature;

import com.google.common.base.Suppliers;
import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.list.BlockList;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;


public class ModConfiguredFeatures {

        public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
                DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Main.MOD_ID);

//        public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> GREAT_TREE = FeatureUtils.register("great_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
//                BlockStateProvider.simple(BlockList.WOOD_GREAT.get()),
//                new StraightTrunkPlacer(5, 6, 3),
//                BlockStateProvider.simple(BlockList.WOOD_GREAT_LEAVES.get()),
//                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(8), 4),
//                new TwoLayersFeatureSize(1, 0, 2)).build());

//        public static final Holder<PlacedFeature> GREAT_CHECKED = PlacementUtils.register("great_checked", GREAT_TREE, PlacementUtils.filteredByBlockSurvival(BlockList.WOOD_GREAT_SAPLING.get()));

//        public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> GREAT_SPAWN = FeatureUtils.register("great_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(GREAT_CHECKED, 0.5F)), GREAT_CHECKED));


        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_AMBER_ORES = Suppliers.memoize(() -> List.of(
                OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.AMBER_ORE.get().defaultBlockState()),
                OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.DEEPSLATE_AMBER_ORE.get().defaultBlockState())));

        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CINNIBAR_ORES = Suppliers.memoize(() -> List.of(           
                OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.CINNIBAR_ORE.get().defaultBlockState()),
                OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockList.DEEPSLATE_CINNIBAR_ORE.get().defaultBlockState())));

        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SHARD_AER_ORES = Suppliers.memoize(() -> List.of(   
                OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.SHARD_AER_ORE.get().defaultBlockState())));
                
        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SHARD_FIRE_ORES = Suppliers.memoize(() -> List.of(  
                OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.SHARD_FIRE_ORE.get().defaultBlockState())));
                
        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SHARD_WATER_ORES = Suppliers.memoize(() -> List.of(  
                OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.SHARD_WATER_ORE.get().defaultBlockState())));

        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SHARD_EARTH_ORES = Suppliers.memoize(() -> List.of(  
                OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.SHARD_EARTH_ORE.get().defaultBlockState())));

        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SHARD_ORDER_ORES = Suppliers.memoize(() -> List.of(  
                OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.SHARD_ORDER_ORE.get().defaultBlockState())));

        public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SHARD_ENTROPY_ORES = Suppliers.memoize(() -> List.of(  
                OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockList.SHARD_ENTROPY_ORE.get().defaultBlockState())));

        public static final RegistryObject<ConfiguredFeature<?, ?>> AMBER_ORES = CONFIGURED_FEATURES.register("amber_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_AMBER_ORES.get(),3)));

        public static final RegistryObject<ConfiguredFeature<?, ?>> CINNIBAR_ORES = CONFIGURED_FEATURES.register("cinnibar_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CINNIBAR_ORES.get(),12)));

        public static final RegistryObject<ConfiguredFeature<?, ?>> SHARD_AER_ORES = CONFIGURED_FEATURES.register("shard_aer_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_AER_ORES.get(),12)));

        public static final RegistryObject<ConfiguredFeature<?, ?>> SHARD_FIRE_ORES = CONFIGURED_FEATURES.register("shard_fire_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_FIRE_ORES.get(),12)));

        public static final RegistryObject<ConfiguredFeature<?, ?>> SHARD_WATER_ORES = CONFIGURED_FEATURES.register("shard_water_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_WATER_ORES.get(),12)));

        public static final RegistryObject<ConfiguredFeature<?, ?>> SHARD_EARTH_ORES = CONFIGURED_FEATURES.register("shard_earth_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_EARTH_ORES.get(),12)));

        public static final RegistryObject<ConfiguredFeature<?, ?>> SHARD_ORDER_ORES = CONFIGURED_FEATURES.register("shard_order_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_ORDER_ORES.get(),12)));

        public static final RegistryObject<ConfiguredFeature<?, ?>> SHARD_ENTROPY_ORES = CONFIGURED_FEATURES.register("shard_entropy_ore",
                () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SHARD_ENTROPY_ORES.get(),12)));


}