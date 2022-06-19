package pam.pamhc2crops.events;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pam.pamhc2crops.entities.ai.MoreTemptation;
import pam.pamhc2crops.init.ItemRegistry;

public class TemptationTask {

	private static final Ingredient Chicken = Ingredient.of(
			ItemRegistry.agaveseeditem,
			ItemRegistry.amaranthseeditem,
			ItemRegistry.arrowrootseeditem,
			ItemRegistry.artichokeseeditem,
			ItemRegistry.asparagusseeditem,
			ItemRegistry.barleyseeditem,
			ItemRegistry.beanseeditem,
			ItemRegistry.bellpepperseeditem,
			ItemRegistry.blackberryseeditem,
			ItemRegistry.blueberryseeditem,
			ItemRegistry.broccoliseeditem,
			ItemRegistry.brusselsproutseeditem,
			ItemRegistry.cabbageseeditem,
			ItemRegistry.cactusfruitseeditem,
			ItemRegistry.candleberryseeditem,
			ItemRegistry.cantaloupeseeditem,
			ItemRegistry.cassavaseeditem,
			ItemRegistry.cauliflowerseeditem,
			ItemRegistry.celeryseeditem,
			ItemRegistry.chickpeaseeditem,
			ItemRegistry.chilipepperseeditem,
			ItemRegistry.coffeebeanseeditem,
			ItemRegistry.cornseeditem,
			ItemRegistry.cottonseeditem,
			ItemRegistry.cranberryseeditem,
			ItemRegistry.cucumberseeditem,
			ItemRegistry.curryleafseeditem,
			ItemRegistry.eggplantseeditem,
			ItemRegistry.elderberryseeditem,
			ItemRegistry.flaxseeditem,
			ItemRegistry.garlicseeditem,
			ItemRegistry.gingerseeditem,
			ItemRegistry.grapeseeditem,
			ItemRegistry.greengrapeseeditem,
			ItemRegistry.huckleberryseeditem,
			ItemRegistry.jicamaseeditem,
			ItemRegistry.juniperberryseeditem,
			ItemRegistry.juteseeditem,
			ItemRegistry.kaleseeditem,
			ItemRegistry.kenafseeditem,
			ItemRegistry.kiwiseeditem,
			ItemRegistry.kohlrabiseeditem,
			ItemRegistry.leekseeditem,
			ItemRegistry.lentilseeditem,
			ItemRegistry.lettuceseeditem,
			ItemRegistry.milletseeditem,
			ItemRegistry.mulberryseeditem,
			ItemRegistry.mustardseedsseeditem,
			ItemRegistry.oatsseeditem,
			ItemRegistry.okraseeditem,
			ItemRegistry.onionseeditem,
			ItemRegistry.parsnipseeditem,
			ItemRegistry.peanutseeditem,
			ItemRegistry.peasseeditem,
			ItemRegistry.pineappleseeditem,
			ItemRegistry.quinoaseeditem,
			ItemRegistry.radishseeditem,
			ItemRegistry.raspberryseeditem,
			ItemRegistry.rhubarbseeditem,
			ItemRegistry.riceseeditem,
			ItemRegistry.rutabagaseeditem,
			ItemRegistry.ryeseeditem,
			ItemRegistry.scallionseeditem,
			ItemRegistry.sesameseedsseeditem,
			ItemRegistry.sisalseeditem,
			ItemRegistry.soybeanseeditem,
			ItemRegistry.spiceleafseeditem,
			ItemRegistry.spinachseeditem,
			ItemRegistry.strawberryseeditem,
			ItemRegistry.sweetpotatoseeditem,
			ItemRegistry.taroseeditem,
			ItemRegistry.tealeafseeditem,
			ItemRegistry.tomatilloseeditem,
			ItemRegistry.tomatoseeditem,
			ItemRegistry.turnipseeditem,
			ItemRegistry.waterchestnutseeditem,
			ItemRegistry.whitemushroomseeditem,
			ItemRegistry.wintersquashseeditem,
			ItemRegistry.zucchiniseeditem
			);
		
	
	private static final Ingredient Grain = Ingredient.of(
			ItemRegistry.amaranthitem,
			ItemRegistry.barleyitem,
			ItemRegistry.beanitem,
			ItemRegistry.chickpeaitem,
			ItemRegistry.cornitem,
			ItemRegistry.lentilitem,
			ItemRegistry.mustardseedsitem,
			ItemRegistry.oatsitem,
			ItemRegistry.quinoaitem,
			ItemRegistry.riceitem,
			ItemRegistry.ryeitem,
			ItemRegistry.soybeanitem
			
			);

	private static final Ingredient Pig = Ingredient.of(
			ItemRegistry.arrowrootitem,
			ItemRegistry.artichokeitem,
			ItemRegistry.asparagusitem,
			ItemRegistry.bellpepperitem,
			ItemRegistry.broccoliitem,
			ItemRegistry.brusselsproutitem,
			ItemRegistry.cabbageitem,
			ItemRegistry.cassavaitem,
			ItemRegistry.caulifloweritem,
			ItemRegistry.celeryitem,
			ItemRegistry.chilipepperitem,
			ItemRegistry.cucumberitem,
			ItemRegistry.eggplantitem,
			ItemRegistry.garlicitem,
			ItemRegistry.jicamaitem,
			ItemRegistry.kaleitem,
			ItemRegistry.kohlrabiitem,
			ItemRegistry.leekitem,
			ItemRegistry.lettuceitem,
			ItemRegistry.okraitem,
			ItemRegistry.onionitem,
			ItemRegistry.parsnipitem,
			ItemRegistry.peanutitem,
			ItemRegistry.peasitem,
			ItemRegistry.radishitem,
			ItemRegistry.rhubarbitem,
			ItemRegistry.rutabagaitem,
			ItemRegistry.scallionitem,
			ItemRegistry.spinachitem,
			ItemRegistry.sweetpotatoitem,
			ItemRegistry.taroitem,
			ItemRegistry.tomatilloitem,
			ItemRegistry.tomatoitem,
			ItemRegistry.turnipitem,
			ItemRegistry.waterchestnutitem,
			ItemRegistry.wintersquashitem,
			ItemRegistry.zucchiniitem
			
			);

	private static final Ingredient Rabbit = Ingredient.of(
			ItemRegistry.blackberryitem,
			ItemRegistry.blueberryitem,
			ItemRegistry.cactusfruititem, 
			ItemRegistry.candleberryitem,
			ItemRegistry.cantaloupeitem, 
			ItemRegistry.cranberryitem,
			ItemRegistry.elderberryitem,
			ItemRegistry.grapeitem, 
			ItemRegistry.greengrapeitem, 
			ItemRegistry.huckleberryitem,
			ItemRegistry.juniperberryitem,
			ItemRegistry.kiwiitem,
			Items.MELON,
			ItemRegistry.mulberryitem,
			ItemRegistry.pineappleitem,
			ItemRegistry.raspberryitem,
			ItemRegistry.spiceleafitem,
			ItemRegistry.strawberryitem,
			Items.SWEET_BERRIES

			);
	
	@SubscribeEvent
	public void onEntitySpawn(EntityJoinWorldEvent event) {
		Entity entity = event.getEntity();

		if (entity instanceof Chicken) {
			Chicken chicken = (Chicken) entity;
			chicken.goalSelector.addGoal(3, new MoreTemptation(chicken, 1.0D, false, Chicken));
		}

		if (entity instanceof Cow) {
			Cow cow = (Cow) entity;
			cow.goalSelector.addGoal(3, new MoreTemptation(cow, 1.25D, false, Grain));
		}

		if (entity instanceof Sheep) {
			Sheep sheep = (Sheep) entity;
			sheep.goalSelector.addGoal(3, new MoreTemptation(sheep, 1.0D, false, Grain));
		}

		if (entity instanceof Pig) {
			Pig pig = (Pig) entity;
			pig.goalSelector.addGoal(4, new MoreTemptation(pig, 1.2D, false, Pig));
		}

		if (entity instanceof Rabbit) {
			Rabbit rabbit = (Rabbit) entity;
			rabbit.goalSelector.addGoal(4, new MoreTemptation(rabbit, 1.2D, false, Rabbit));
		}
	}
}