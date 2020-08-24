package pam.pamhc2crops.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class FeatureConfig {
	public static ForgeConfigSpec.BooleanValue rightclick_harvest;
	public static ForgeConfigSpec.BooleanValue grass_drop_seeds;
	public static ForgeConfigSpec.BooleanValue tallgrass_drop_seeds;
	public static ForgeConfigSpec.BooleanValue fern_drop_seeds;
	

	public static void init(ForgeConfigSpec.Builder config) {
		
		rightclick_harvest = config.comment("Disable/enable right-click harvesting of crops.")
				.define("Enable right-click harvesting for crops", true);
		
		grass_drop_seeds = config.comment("Disable/enable grass blocks dropping seeds.")
				.define("Enable grass blocks dropping seeds", false);
		
		tallgrass_drop_seeds = config.comment("Disable/enable tall grass blocks dropping seeds.")
				.define("Enable tall grass blocks dropping seeds", false);
		
		fern_drop_seeds = config.comment("Disable/enable fern blocks dropping seeds.")
				.define("Enable fern blocks dropping seeds", false);

	}

}