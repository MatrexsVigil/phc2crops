package pam.pamhc2crops.worldgen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import pam.pamhc2crops.config.EnableConfig;
import pam.pamhc2crops.init.FeatureRegistry;

public final class GardenGeneration {
    
    private GardenGeneration() {}

    public static void registerPlacements(RegistryEvent.Register<Placement<?>> event) {
    }
    

    public static void addFeaturesToBiomes(BiomeLoadingEvent biome) {
        
    	if (biome.getCategory() == Biome.Category.DESERT || biome.getCategory() == Biome.Category.MESA) {
    		if (EnableConfig.enable_aridgarden.get())
    		{
    			addAridGarden(biome);
    		}
    	}
    		
    	if (biome.getCategory() == Biome.Category.ICY || biome.getCategory() == Biome.Category.EXTREME_HILLS) {
        	if (EnableConfig.enable_frostgarden.get())
        	{
        		addFrostGarden(biome);
        	}
            
        }
    	
    	if (biome.getCategory() == Biome.Category.FOREST) {
    		if (EnableConfig.enable_shadedgarden.get())
    		{
    			addShadedGarden(biome);
    		}
            
        }
    	
    	if (biome.getCategory() == Biome.Category.SWAMP || biome.getCategory() == Biome.Category.RIVER) {
    		if (EnableConfig.enable_soggygarden.get())
    		{
    			addSoggyGarden(biome);
    		}
            
        }
    	
    	if (biome.getCategory() == Biome.Category.BEACH || biome.getCategory() == Biome.Category.OCEAN) {
    		if (EnableConfig.enable_tropicalgarden.get())
    		{
    			addTropicalGarden(biome);
    		}
            
        }
    	
    	if (biome.getCategory() == Biome.Category.PLAINS || biome.getCategory() == Biome.Category.SAVANNA) {
    		if (EnableConfig.enable_windygarden.get())
    		{
    			addWindyGarden(biome);
    		}
            
        }

    }

    private static void addAridGarden(BiomeLoadingEvent biome) {
        biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureRegistry.ARID_GARDEN);
    }
    
    private static void addFrostGarden(BiomeLoadingEvent biome) {
    	biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureRegistry.FROST_GARDEN);
    }
    
    private static void addShadedGarden(BiomeLoadingEvent biome) {
    	biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureRegistry.SHADED_GARDEN);
    }

    private static void addSoggyGarden(BiomeLoadingEvent biome) {
    	biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureRegistry.SOGGY_GARDEN);
    }

    private static void addTropicalGarden(BiomeLoadingEvent biome) {
    	biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureRegistry.TROPICAL_GARDEN);
    }
    
    private static void addWindyGarden(BiomeLoadingEvent biome) {
    	biome.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, FeatureRegistry.WINDY_GARDEN);
    }
}
