package pam.pamhc2crops.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class FeatureConfig {
	public static ForgeConfigSpec.BooleanValue mod_harvest;
	public static ForgeConfigSpec.BooleanValue smart_harvest;

	public static void init(ForgeConfigSpec.Builder config) {
		
		mod_harvest = config.comment("Disable/enable right-click harvesting of crops")
				.define("Enable right-click harvesting for crops", true);

	}

}