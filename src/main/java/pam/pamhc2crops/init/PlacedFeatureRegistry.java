package pam.pamhc2crops.init;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import pam.pamhc2crops.config.ChanceConfig;

public class PlacedFeatureRegistry {

    public static final Holder<PlacedFeature> ARID_GARDEN = registerGarden("arid_garden", FeatureRegistry.ARID_GARDEN);
    public static final Holder<PlacedFeature> FROST_GARDEN = registerGarden("frost_garden", FeatureRegistry.FROST_GARDEN);
    public static final Holder<PlacedFeature> SHADED_GARDEN = registerGarden("shaded_garden", FeatureRegistry.SHADED_GARDEN);
    public static final Holder<PlacedFeature> SOGGY_GARDEN = registerGarden("soggy_garden", FeatureRegistry.SOGGY_GARDEN);
    public static final Holder<PlacedFeature> TROPICAL_GARDEN = registerGarden("tropical_garden", FeatureRegistry.TROPICAL_GARDEN);
    public static final Holder<PlacedFeature> WINDY_GARDEN = registerGarden("windy_garden", FeatureRegistry.WINDY_GARDEN);

    private static Holder<PlacedFeature> registerGarden(String name, Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> garden) {
        return PlacementUtils.register(name, garden, PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                RarityFilter.onAverageOnceEvery(ChanceConfig.garden_chance.get()));
    }

}
