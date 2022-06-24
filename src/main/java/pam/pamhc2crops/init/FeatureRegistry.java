package pam.pamhc2crops.init;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.registries.RegistryObject;
import pam.pamhc2crops.config.ClusterConfig;

public class FeatureRegistry {

	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> ARID_GARDEN = newConfiguredFeature("arid_garden", BlockRegistry.aridgarden);

	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FROST_GARDEN = newConfiguredFeature("frost_garden", BlockRegistry.frostgarden);

	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> SHADED_GARDEN = newConfiguredFeature("shaded_garden", BlockRegistry.shadedgarden);

	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> SOGGY_GARDEN = newConfiguredFeature("soggy_garden", BlockRegistry.soggygarden);

	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> TROPICAL_GARDEN = newConfiguredFeature("tropical_garden", BlockRegistry.tropicalgarden);

	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> WINDY_GARDEN = newConfiguredFeature("windy_garden", BlockRegistry.windygarden);

	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> newConfiguredFeature(String registryName, RegistryObject<Block> garden) {
		SimpleBlockConfiguration blockConfig = new SimpleBlockConfiguration(BlockStateProvider.simple(garden.get()));
		Holder<PlacedFeature> onlyWhenEmptyHolder = PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, blockConfig);
		RandomPatchConfiguration patchConfig = FeatureUtils.simpleRandomPatchConfiguration(ClusterConfig.garden_cluster_amount.get(), onlyWhenEmptyHolder);

        return FeatureUtils.register(registryName, Feature.RANDOM_PATCH, patchConfig);
    }
}
