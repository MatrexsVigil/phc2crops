package pam.pamhc2crops.entities.ai;

import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.item.crafting.Ingredient;

public class MoreTemptation extends TemptGoal {
	public MoreTemptation(PathfinderMob creatureIn, double speedIn, boolean p_i47823_4_, Ingredient temptItemsIn) {
		super(creatureIn, speedIn, temptItemsIn, p_i47823_4_);
	}

}
