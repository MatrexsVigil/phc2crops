package pam.pamhc2crops.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.config.ChanceConfig;
import pam.pamhc2crops.worldgen.configs.FeatureConfigs;

public class FeatureRegistry {

	public static ConfiguredFeature<?, ?> ARID_GARDEN = newConfiguredFeature("arid_garden", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.ARID_GARDEN_CONFIG)
    		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
	
	public static ConfiguredFeature<?, ?> FROST_GARDEN = newConfiguredFeature("frost_garden", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.FROST_GARDEN_CONFIG)
    		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
	
	public static ConfiguredFeature<?, ?> SHADED_GARDEN = newConfiguredFeature("shaded_garden", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SHADED_GARDEN_CONFIG)
    		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
	
	public static ConfiguredFeature<?, ?> SOGGY_GARDEN = newConfiguredFeature("soggy_garden", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.SOGGY_GARDEN_CONFIG)
    		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
	
	public static ConfiguredFeature<?, ?> TROPICAL_GARDEN = newConfiguredFeature("tropical_garden", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.TROPICAL_GARDEN_CONFIG)
    		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
	
	public static ConfiguredFeature<?, ?> WINDY_GARDEN = newConfiguredFeature("windy_garden", Feature.RANDOM_PATCH.withConfiguration(FeatureConfigs.WINDY_GARDEN_CONFIG)
    		.withPlacement(Features.Placements.HEIGHTMAP_SPREAD_DOUBLE_PLACEMENT).func_242729_a(ChanceConfig.garden_chance.get()));
	
	public static ConfiguredFeature<?, ?> newConfiguredFeature(String registryName, ConfiguredFeature<?, ?> configuredFeature) {
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(Pamhc2crops.MOD_ID, registryName), configuredFeature);
        return configuredFeature;
    }
	
	public static void registerConfiguredFeatures() {
        MutableRegistry<ConfiguredFeature<?, ?>> registry = (MutableRegistry<ConfiguredFeature<?, ?>>) WorldGenRegistries.CONFIGURED_FEATURE;
        
        Registry.register(registry, new ResourceLocation(Pamhc2crops.MOD_ID, "arid_garden"), ARID_GARDEN);
        
        Registry.register(registry, new ResourceLocation(Pamhc2crops.MOD_ID, "frost_garden"), FROST_GARDEN);
        Registry.register(registry, new ResourceLocation(Pamhc2crops.MOD_ID, "shaded_garden"), SHADED_GARDEN);
        Registry.register(registry, new ResourceLocation(Pamhc2crops.MOD_ID, "soggy_garden"), SOGGY_GARDEN);
        Registry.register(registry, new ResourceLocation(Pamhc2crops.MOD_ID, "tropical_garden"), TROPICAL_GARDEN);
        Registry.register(registry, new ResourceLocation(Pamhc2crops.MOD_ID, "windy_garden"), WINDY_GARDEN);
        
        
	}
}
