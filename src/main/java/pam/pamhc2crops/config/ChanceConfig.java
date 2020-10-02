package pam.pamhc2crops.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ChanceConfig {
	public static ForgeConfigSpec.IntValue garden_chance;
	
	public static void init(ForgeConfigSpec.Builder config) {

		garden_chance = config.comment(
				"Chance of gardens generating in the world. Higher numbers indicate a lower probability; just 4 is very rare (Default: 2)")
				.defineInRange("Probability of gardens generating", 2, 1, 1000000000);


		

	}
}
