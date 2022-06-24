package pam.pamhc2crops.worldgen;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import pam.pamhc2crops.config.EnableConfig;
import pam.pamhc2crops.init.PlacedFeatureRegistry;

import java.util.Set;

public final class GardenGeneration {

    private GardenGeneration() {}

    public static void addFeaturesToBiomes(BiomeLoadingEvent biome) {
		ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, biome.getName());
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);


    	if (biome.getCategory() == Biome.BiomeCategory.DESERT || biome.getCategory() == Biome.BiomeCategory.MESA) {
    		if (EnableConfig.enable_aridgarden.get())
    		{
    			addAridGarden(biome);
    		}
    	}

    	if (biome.getCategory() == Biome.BiomeCategory.ICY || biome.getCategory() == Biome.BiomeCategory.EXTREME_HILLS) {
        	if (EnableConfig.enable_frostgarden.get())
        	{
        		addFrostGarden(biome);
        	}

        }

    	if (biome.getCategory() == Biome.BiomeCategory.FOREST) {
    		if (EnableConfig.enable_shadedgarden.get())
    		{
    			addShadedGarden(biome);
    		}

        }

    	if (biome.getCategory() == Biome.BiomeCategory.SWAMP || biome.getCategory() == Biome.BiomeCategory.RIVER) {
    		if (EnableConfig.enable_soggygarden.get())
    		{
    			addSoggyGarden(biome);
    		}

        }

    	if (biome.getCategory() == Biome.BiomeCategory.BEACH || biome.getCategory() == Biome.BiomeCategory.OCEAN) {
    		if (EnableConfig.enable_tropicalgarden.get())
    		{
    			addTropicalGarden(biome);
    		}

        }

    	if (biome.getCategory() == Biome.BiomeCategory.PLAINS || biome.getCategory() == Biome.BiomeCategory.SAVANNA) {
    		if (EnableConfig.enable_windygarden.get())
    		{
    			addWindyGarden(biome);
    		}

        }

    }

    private static void addAridGarden(BiomeLoadingEvent biome) {
        biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacedFeatureRegistry.ARID_GARDEN);
    }

    private static void addFrostGarden(BiomeLoadingEvent biome) {
    	biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacedFeatureRegistry.FROST_GARDEN);
    }

    private static void addShadedGarden(BiomeLoadingEvent biome) {
    	biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacedFeatureRegistry.SHADED_GARDEN);
    }

    private static void addSoggyGarden(BiomeLoadingEvent biome) {
    	biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacedFeatureRegistry.SOGGY_GARDEN);
    }

    private static void addTropicalGarden(BiomeLoadingEvent biome) {
    	biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacedFeatureRegistry.TROPICAL_GARDEN);
    }

    private static void addWindyGarden(BiomeLoadingEvent biome) {
    	biome.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacedFeatureRegistry.WINDY_GARDEN);
    }
}
