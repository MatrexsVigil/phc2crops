package pam.pamhc2crops.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ClusterConfig {
	public static ForgeConfigSpec.IntValue garden_cluster_amount;
	
	public static void init(ForgeConfigSpec.Builder config) {

		garden_cluster_amount = config.comment(
				"Amount of gardens that spawn together. Higher numbers indicate larger clusters; 32 is about 3-7ish (Default: 32)")
				.defineInRange("Probability of gardens generating", 32, 1, 1000000000);


		

	}
}
