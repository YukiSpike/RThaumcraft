package com.Yuki_Spike.rthaumcraft.world.feature;

import com.Yuki_Spike.rthaumcraft.Main;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.Yuki_Spike.rthaumcraft.world.feature.ModOrePlacement.commonOrePlacement;

public class ModPlacedFeatures {
        public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Main.MOD_ID);


//        public static final Holder<PlacedFeature> GREAT_PLACED = PlacementUtils.register("great_placed", ModConfiguredFeatures.GREAT_SPAWN, VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2)));

        public static final RegistryObject<PlacedFeature> AMBER_ORE_PLACED = PLACED_FEATURES.register("amber_ore_placed",
                () -> new PlacedFeature(ModConfiguredFeatures.AMBER_ORES.getHolder().get(),
                        commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-60), VerticalAnchor.belowTop(60)))));

        public static final RegistryObject<PlacedFeature> CINNIBAR_ORE_PLACED = PLACED_FEATURES.register("cinnibar_ore_placed",
                () -> new PlacedFeature(ModConfiguredFeatures.CINNIBAR_ORES.getHolder().get(),
                        commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-60), VerticalAnchor.belowTop(60)))));

        public static final RegistryObject<PlacedFeature> SHARD_AER_ORE_PLACED = PLACED_FEATURES.register("shard_aer_ore_placed",
                () -> new PlacedFeature(ModConfiguredFeatures.SHARD_AER_ORES.getHolder().get(),
                        commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(120)))));

        public static final RegistryObject<PlacedFeature> SHARD_FIRE_ORE_PLACED = PLACED_FEATURES.register("shard_fire_ore_placed",
                () -> new PlacedFeature(ModConfiguredFeatures.SHARD_FIRE_ORES.getHolder().get(),
                        commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(120)))));

        public static final RegistryObject<PlacedFeature> SHARD_WATER_ORE_PLACED = PLACED_FEATURES.register("shard_water_ore_placed",
                () -> new PlacedFeature(ModConfiguredFeatures.SHARD_WATER_ORES.getHolder().get(),
                        commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(120)))));
 
        public static final RegistryObject<PlacedFeature> SHARD_EARTH_ORE_PLACED = PLACED_FEATURES.register("shard_earth_ore_placed",
                () -> new PlacedFeature(ModConfiguredFeatures.SHARD_EARTH_ORES.getHolder().get(),
                        commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(120)))));

        public static final RegistryObject<PlacedFeature> SHARD_ORDER_ORE_PLACED = PLACED_FEATURES.register("shard_order_ore_placed",
                () -> new PlacedFeature(ModConfiguredFeatures.SHARD_ORDER_ORES.getHolder().get(),
                        commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(120)))));

        public static final RegistryObject<PlacedFeature> SHARD_ENTROPY_ORE_PLACED = PLACED_FEATURES.register("shard_entropy_ore_placed",
                () -> new PlacedFeature(ModConfiguredFeatures.SHARD_ENTROPY_ORES.getHolder().get(),
                        commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(120)))));

}
