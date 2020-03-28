package pam.pamhc2crops.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import pam.pamhc2crops.Pamhc2crops;
import pam.pamhc2crops.config.EnableConfig;
import pam.pamhc2crops.worldgen.AridGardenFeature;
import pam.pamhc2crops.worldgen.FrostGardenFeature;
import pam.pamhc2crops.worldgen.ShadedGardenFeature;
import pam.pamhc2crops.worldgen.SoggyGardenFeature;
import pam.pamhc2crops.worldgen.TropicalGardenFeature;
import pam.pamhc2crops.worldgen.WindyGardenFeature;

public class WorldGenRegistry {
	public static Feature<NoFeatureConfig> arid_worldgen;
	public static Feature<NoFeatureConfig> frost_worldgen;
	public static Feature<NoFeatureConfig> shaded_worldgen;
	public static Feature<NoFeatureConfig> soggy_worldgen;
	public static Feature<NoFeatureConfig> tropical_worldgen;
	public static Feature<NoFeatureConfig> windy_worldgen;

	public static void registerAll(RegistryEvent.Register<Feature<?>> event) {
		if (!event.getName().equals(ForgeRegistries.FEATURES.getRegistryName()))
			return;
		IForgeRegistry<Feature<?>> r = event.getRegistry();

		if (EnableConfig.enable_aridgarden.get() == true)
			arid_worldgen = register(r, new AridGardenFeature(NoFeatureConfig::deserialize), "arid_worldgen");
		
		if (EnableConfig.enable_frostgarden.get() == true)
			frost_worldgen = register(r, new FrostGardenFeature(NoFeatureConfig::deserialize), "frost_worldgen");
		
		if (EnableConfig.enable_shadedgarden.get() == true)
			shaded_worldgen = register(r, new ShadedGardenFeature(NoFeatureConfig::deserialize), "shaded_worldgen");
		
		if (EnableConfig.enable_soggygarden.get() == true)
			soggy_worldgen = register(r, new SoggyGardenFeature(NoFeatureConfig::deserialize), "soggy_worldgen");
		
		if (EnableConfig.enable_tropicalgarden.get() == true)
			tropical_worldgen = register(r, new TropicalGardenFeature(NoFeatureConfig::deserialize), "tropical_worldgen");
		
		if (EnableConfig.enable_windygarden.get() == true)
			windy_worldgen = register(r, new WindyGardenFeature(NoFeatureConfig::deserialize), "windy_worldgen");
	}

	private static <V extends R, R extends IForgeRegistryEntry<R>> V register(IForgeRegistry<R> registry, V value,
			String name) {
		ResourceLocation id = Pamhc2crops.getId(name);
		value.setRegistryName(id);
		registry.register(value);
		return value;
	}
}
