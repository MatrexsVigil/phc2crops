package pam.pamhc2crops.events;

import net.minecraftforge.common.MinecraftForge;
import pam.pamhc2crops.config.FeatureConfig;
import pam.pamhc2crops.config.RightClickConfig;
import pam.pamhc2crops.events.harvest.CropHarvest;

public class EventSetup {
	public static void setupEvents() {
	MinecraftForge.EVENT_BUS.register(new TemptationTask());

	if (FeatureConfig.rightclick_harvest.get()) {
		if (RightClickConfig.crop_right_click.get())
			MinecraftForge.EVENT_BUS.register(new CropHarvest());
	}
	
	if (FeatureConfig.grass_drop_seeds.get()) {
			MinecraftForge.EVENT_BUS.register(new GrassLootHandler());
	}
	
	if (FeatureConfig.tallgrass_drop_seeds.get()) {
			MinecraftForge.EVENT_BUS.register(new TallGrassLootHandler());
	}
	
	if (FeatureConfig.fern_drop_seeds.get()) {
			MinecraftForge.EVENT_BUS.register(new FernLootHandler());
	}

}
}
