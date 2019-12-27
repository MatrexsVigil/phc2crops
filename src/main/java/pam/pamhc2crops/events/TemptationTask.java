package pam.pamhc2crops.events;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pam.pamhc2crops.entities.ai.MoreTemptation;
import pam.pamhc2crops.init.ItemRegistry;

public class TemptationTask {

	private static final Ingredient Seeds = Ingredient.fromItems(ItemRegistry.barleyseeditem, ItemRegistry.tomatoseeditem

	);

	private static final Ingredient Grain = Ingredient.fromItems(ItemRegistry.barleyitem);

	private static final Ingredient Pig = Ingredient.fromItems(ItemRegistry.tomatoitem);

	@SubscribeEvent
	public void onEntitySpawn(EntityJoinWorldEvent event) {
		Entity entity = event.getEntity();

		if (entity instanceof ChickenEntity) {
			ChickenEntity chicken = (ChickenEntity) entity;
			chicken.goalSelector.addGoal(3, new MoreTemptation(chicken, 1.0D, false, Seeds));
		}

		if (entity instanceof CowEntity) {
			CowEntity cow = (CowEntity) entity;
			cow.goalSelector.addGoal(3, new MoreTemptation(cow, 1.25D, false, Grain));
		}

		if (entity instanceof SheepEntity) {
			SheepEntity sheep = (SheepEntity) entity;
			sheep.goalSelector.addGoal(3, new MoreTemptation(sheep, 1.0D, false, Grain));
		}

		if (entity instanceof PigEntity) {
			PigEntity pig = (PigEntity) entity;
			pig.goalSelector.addGoal(4, new MoreTemptation(pig, 1.2D, false, Pig));
		}

	}
}
