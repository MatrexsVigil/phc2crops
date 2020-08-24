package pam.pamhc2crops.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class RightClickConfig {
	public static ForgeConfigSpec.BooleanValue crop_right_click;

	public static void init(ForgeConfigSpec.Builder config) {

		crop_right_click = config.comment("Disable/enable right-click harvesting of crops")
				.define("Enable right-click harvesting for crops", true);


	}

}