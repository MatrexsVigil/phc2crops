package pam.pamhc2crops.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class EnableConfig {
	public static ForgeConfigSpec.BooleanValue enable_aridgarden;
	public static ForgeConfigSpec.BooleanValue enable_frostgarden;
	public static ForgeConfigSpec.BooleanValue enable_tropicalgarden;
	public static ForgeConfigSpec.BooleanValue enable_windygarden;
	public static ForgeConfigSpec.BooleanValue enable_shadedgarden;
	public static ForgeConfigSpec.BooleanValue enable_soggygarden;

	public static void init(ForgeConfigSpec.Builder config) {
		enable_aridgarden = config.comment("Should arid gardens should generate in world").define("Generate arid gardens",
				true);
		
		enable_frostgarden = config.comment("Should frost gardens should generate in world").define("Generate frost gardens",
				true);
		
		enable_tropicalgarden = config.comment("Should tropical gardens should generate in world").define("Generate tropical gardens",
				true);
		
		enable_windygarden = config.comment("Should windy gardens should generate in world").define("Generate windy gardens",
				true);
		
		enable_shadedgarden = config.comment("Should shaded gardens should generate in world").define("Generate shaded gardens",
				true);
		
		enable_soggygarden = config.comment("Should soggy gardens should generate in world").define("Generate soggy gardens",
				true);

	}

}
