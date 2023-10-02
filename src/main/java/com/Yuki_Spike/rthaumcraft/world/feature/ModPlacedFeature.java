package com.Yuki_Spike.rthaumcraft.world.feature;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeature {
        public static final ResourceKey<PlacedFeature> AMBER_ORE_PLACED_KEY = createKey("amber_placed");
        public static final ResourceKey<PlacedFeature> CINNIBAR_ORE_PLACED_KEY = createKey("cinnibar_placed");
        public static final ResourceKey<PlacedFeature> SHARD_AER_ORE_PLACED_KEY = createKey("shard_aer_placed");
        public static final ResourceKey<PlacedFeature> SHARD_FIRE_ORE_PLACED_KEY = createKey("shard_fire_placed");
        public static final ResourceKey<PlacedFeature> SHARD_WATER_ORE_PLACED_KEY = createKey("shard_water_placed");
        public static final ResourceKey<PlacedFeature> SHARD_EARTH_ORE_PLACED_KEY = createKey("shard_earth_placed");
        public static final ResourceKey<PlacedFeature> SHARD_ORDER_ORE_PLACED_KEY = createKey("shard_order_placed");
        public static final ResourceKey<PlacedFeature> SHARD_ENTROPY_ORE_PLACED_KEY = createKey("shard_entropy_placed");

        public static void bootstrap(BootstapContext<PlacedFeature> context) {
                HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

                register(context, AMBER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfigureFeature.OVERWORLD_AMBER_ORE_KEY),
                        ModOrePlacement.commonOrePlacement(18, // veins per chunk
                                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(255))));
                register(context, CINNIBAR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfigureFeature.OVERWORLD_CINNIBAR_ORE_KEY),
                        ModOrePlacement.commonOrePlacement(18, // veins per chunk
                                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(55))));

                register(context, SHARD_AER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfigureFeature.OVERWORLD_SHARD_AER_ORE_KEY),
                        ModOrePlacement.commonOrePlacement(6, // veins per chunk
                                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(25), VerticalAnchor.absolute(65))));
                register(context, SHARD_FIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfigureFeature.OVERWORLD_SHARD_FIRE_ORE_KEY),
                        ModOrePlacement.commonOrePlacement(6, // veins per chunk
                                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(25), VerticalAnchor.absolute(65))));
                register(context, SHARD_WATER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfigureFeature.OVERWORLD_SHARD_WATER_ORE_KEY),
                        ModOrePlacement.commonOrePlacement(6, // veins per chunk
                                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(25), VerticalAnchor.absolute(65))));
                register(context, SHARD_EARTH_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfigureFeature.OVERWORLD_SHARD_EARTH_ORE_KEY),
                        ModOrePlacement.commonOrePlacement(6, // veins per chunk
                                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(25), VerticalAnchor.absolute(65))));
                register(context, SHARD_ORDER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfigureFeature.OVERWORLD_SHARD_ORDER_ORE_KEY),
                        ModOrePlacement.commonOrePlacement(6, // veins per chunk
                                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(25), VerticalAnchor.absolute(65))));
                register(context, SHARD_ENTROPY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfigureFeature.OVERWORLD_SHARD_ENTROPY_ORE_KEY),
                        ModOrePlacement.commonOrePlacement(6, // veins per chunk
                                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(25), VerticalAnchor.absolute(65))));
        }

        private static ResourceKey<PlacedFeature> createKey(String name) {
                return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RThaumcraft.MODID, name));
        }
        private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                     List<PlacementModifier> modifiers) {
                context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
        }
        private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                     PlacementModifier... modifiers) {
                register(context, key, configuration, List.of(modifiers));
        }
}
