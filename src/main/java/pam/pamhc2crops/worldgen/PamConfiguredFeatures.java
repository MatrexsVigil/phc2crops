package pam.pamhc2crops.worldgen;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.config.ChanceConfig;
import pam.pamhc2crops.worldgen.configs.FeatureConfigs;

public final class PamConfiguredFeatures {

    public static ConfiguredFeature<?, ?> ARID_GARDEN;
    public static ConfiguredFeature<?, ?> FROST_GARDEN;
    public static ConfiguredFeature<?, ?> SHADED_GARDEN;
    public static ConfiguredFeature<?, ?> SOGGY_GARDEN;
    public static ConfiguredFeature<?, ?> TROPICAL_GARDEN;
    public static ConfiguredFeature<?, ?> WINDY_GARDEN;

    // Done in FMLCommonSetupEvent so the config is ready to go.
    public static void registerConfiguredFeatures(FMLCommonSetupEvent event){

        Registry<ConfiguredFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_FEATURE;

        ARID_GARDEN = Registry.register(registry, Pamhc2crops.getId("arid_garden"),
                Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.ARID_GARDEN_CONFIG)
                .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT)
                        .func_242729_a(ChanceConfig.garden_chance.get()));

        FROST_GARDEN = Registry.register(registry, Pamhc2crops.getId("frost_garden"),
                Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.FROST_GARDEN_CONFIG)
                .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT)
                        .func_242729_a(ChanceConfig.garden_chance.get()));

        SHADED_GARDEN = Registry.register(registry, Pamhc2crops.getId("shaded_garden"),
                Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SHADED_GARDEN_CONFIG)
                .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT)
                        .func_242729_a(ChanceConfig.garden_chance.get()));

        SOGGY_GARDEN = Registry.register(registry, Pamhc2crops.getId("soggy_garden"),
                Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SOGGY_GARDEN_CONFIG)
                .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT)
                        .func_242729_a(ChanceConfig.garden_chance.get()));

        TROPICAL_GARDEN = Registry.register(registry, Pamhc2crops.getId("tropical_garden"),
                Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.TROPICAL_GARDEN_CONFIG)
                .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT)
                        .func_242729_a(ChanceConfig.garden_chance.get()));

        WINDY_GARDEN = Registry.register(registry, Pamhc2crops.getId("windy_garden"),
                Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WINDY_GARDEN_CONFIG)
                .withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT)
                        .func_242729_a(ChanceConfig.garden_chance.get()));
    }
}
