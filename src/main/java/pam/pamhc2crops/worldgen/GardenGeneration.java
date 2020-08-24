package pam.pamhc2crops.worldgen;

import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import pam.pamhc2crops.init.WorldGenRegistry;

public class GardenGeneration {

	public static void registerWorldGen() {

		//Arid
		if (WorldGenRegistry.arid_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SANDY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.arid_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		if (WorldGenRegistry.arid_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.MESA).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.arid_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		//Frost
		if (WorldGenRegistry.frost_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SNOWY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.frost_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		if (WorldGenRegistry.frost_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.frost_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		//Shaded
		if (WorldGenRegistry.shaded_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.shaded_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		if (WorldGenRegistry.shaded_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.shaded_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		if (WorldGenRegistry.shaded_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.shaded_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		//Soggy
		if (WorldGenRegistry.soggy_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.soggy_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		if (WorldGenRegistry.soggy_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.RIVER).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.soggy_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		//Windy
		if (WorldGenRegistry.windy_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.windy_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		if (WorldGenRegistry.windy_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.windy_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		//Tropical
		if (WorldGenRegistry.tropical_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.tropical_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
		if (WorldGenRegistry.tropical_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.tropical_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});

		}
	
	}
	}