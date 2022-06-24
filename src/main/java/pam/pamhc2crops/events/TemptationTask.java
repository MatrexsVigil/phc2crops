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
			ItemRegistry.agaveseeditem.get(),
			ItemRegistry.amaranthseeditem.get(),
			ItemRegistry.arrowrootseeditem.get(),
			ItemRegistry.artichokeseeditem.get(),
			ItemRegistry.asparagusseeditem.get(),
			ItemRegistry.barleyseeditem.get(),
			ItemRegistry.beanseeditem.get(),
			ItemRegistry.bellpepperseeditem.get(),
			ItemRegistry.blackberryseeditem.get(),
			ItemRegistry.blueberryseeditem.get(),
			ItemRegistry.broccoliseeditem.get(),
			ItemRegistry.brusselsproutseeditem.get(),
			ItemRegistry.cabbageseeditem.get(),
			ItemRegistry.cactusfruitseeditem.get(),
			ItemRegistry.candleberryseeditem.get(),
			ItemRegistry.cantaloupeseeditem.get(),
			ItemRegistry.cassavaseeditem.get(),
			ItemRegistry.cauliflowerseeditem.get(),
			ItemRegistry.celeryseeditem.get(),
			ItemRegistry.chickpeaseeditem.get(),
			ItemRegistry.chilipepperseeditem.get(),
			ItemRegistry.coffeebeanseeditem.get(),
			ItemRegistry.cornseeditem.get(),
			ItemRegistry.cottonseeditem.get(),
			ItemRegistry.cranberryseeditem.get(),
			ItemRegistry.cucumberseeditem.get(),
			ItemRegistry.eggplantseeditem.get(),
			ItemRegistry.elderberryseeditem.get(),
			ItemRegistry.flaxseeditem.get(),
			ItemRegistry.garlicseeditem.get(),
			ItemRegistry.gingerseeditem.get(),
			ItemRegistry.grapeseeditem.get(),
			ItemRegistry.greengrapeseeditem.get(),
			ItemRegistry.huckleberryseeditem.get(),
			ItemRegistry.jicamaseeditem.get(),
			ItemRegistry.juniperberryseeditem.get(),
			ItemRegistry.juteseeditem.get(),
			ItemRegistry.kaleseeditem.get(),
			ItemRegistry.kenafseeditem.get(),
			ItemRegistry.kiwiseeditem.get(),
			ItemRegistry.kohlrabiseeditem.get(),
			ItemRegistry.leekseeditem.get(),
			ItemRegistry.lentilseeditem.get(),
			ItemRegistry.lettuceseeditem.get(),
			ItemRegistry.milletseeditem.get(),
			ItemRegistry.mulberryseeditem.get(),
			ItemRegistry.mustardseedsseeditem.get(),
			ItemRegistry.oatsseeditem.get(),
			ItemRegistry.okraseeditem.get(),
			ItemRegistry.onionseeditem.get(),
			ItemRegistry.parsnipseeditem.get(),
			ItemRegistry.peanutseeditem.get(),
			ItemRegistry.peasseeditem.get(),
			ItemRegistry.pineappleseeditem.get(),
			ItemRegistry.quinoaseeditem.get(),
			ItemRegistry.radishseeditem.get(),
			ItemRegistry.raspberryseeditem.get(),
			ItemRegistry.rhubarbseeditem.get(),
			ItemRegistry.riceseeditem.get(),
			ItemRegistry.rutabagaseeditem.get(),
			ItemRegistry.ryeseeditem.get(),
			ItemRegistry.scallionseeditem.get(),
			ItemRegistry.sesameseedsseeditem.get(),
			ItemRegistry.sisalseeditem.get(),
			ItemRegistry.soybeanseeditem.get(),
			ItemRegistry.spiceleafseeditem.get(),
			ItemRegistry.spinachseeditem.get(),
			ItemRegistry.strawberryseeditem.get(),
			ItemRegistry.sweetpotatoseeditem.get(),
			ItemRegistry.taroseeditem.get(),
			ItemRegistry.tealeafseeditem.get(),
			ItemRegistry.tomatilloseeditem.get(),
			ItemRegistry.tomatoseeditem.get(),
			ItemRegistry.turnipseeditem.get(),
			ItemRegistry.waterchestnutseeditem.get(),
			ItemRegistry.whitemushroomseeditem.get(),
			ItemRegistry.wintersquashseeditem.get(),
			ItemRegistry.zucchiniseeditem.get()
			);
		
	
	private static final Ingredient Grain = Ingredient.of(
			ItemRegistry.amaranthitem.get(),
			ItemRegistry.barleyitem.get(),
			ItemRegistry.beanitem.get(),
			ItemRegistry.chickpeaitem.get(),
			ItemRegistry.cornitem.get(),
			ItemRegistry.lentilitem.get(),
			ItemRegistry.mustardseedsitem.get(),
			ItemRegistry.oatsitem.get(),
			ItemRegistry.quinoaitem.get(),
			ItemRegistry.riceitem.get(),
			ItemRegistry.ryeitem.get(),
			ItemRegistry.soybeanitem.get()
			
			);

	private static final Ingredient Pig = Ingredient.of(
			ItemRegistry.arrowrootitem.get(),
			ItemRegistry.artichokeitem.get(),
			ItemRegistry.asparagusitem.get(),
			ItemRegistry.bellpepperitem.get(),
			ItemRegistry.broccoliitem.get(),
			ItemRegistry.brusselsproutitem.get(),
			ItemRegistry.cabbageitem.get(),
			ItemRegistry.cassavaitem.get(),
			ItemRegistry.caulifloweritem.get(),
			ItemRegistry.celeryitem.get(),
			ItemRegistry.chilipepperitem.get(),
			ItemRegistry.cucumberitem.get(),
			ItemRegistry.eggplantitem.get(),
			ItemRegistry.garlicitem.get(),
			ItemRegistry.jicamaitem.get(),
			ItemRegistry.kaleitem.get(),
			ItemRegistry.kohlrabiitem.get(),
			ItemRegistry.leekitem.get(),
			ItemRegistry.lettuceitem.get(),
			ItemRegistry.okraitem.get(),
			ItemRegistry.onionitem.get(),
			ItemRegistry.parsnipitem.get(),
			ItemRegistry.peanutitem.get(),
			ItemRegistry.peasitem.get(),
			ItemRegistry.radishitem.get(),
			ItemRegistry.rhubarbitem.get(),
			ItemRegistry.rutabagaitem.get(),
			ItemRegistry.scallionitem.get(),
			ItemRegistry.spinachitem.get(),
			ItemRegistry.sweetpotatoitem.get(),
			ItemRegistry.taroitem.get(),
			ItemRegistry.tomatilloitem.get(),
			ItemRegistry.tomatoitem.get(),
			ItemRegistry.turnipitem.get(),
			ItemRegistry.waterchestnutitem.get(),
			ItemRegistry.wintersquashitem.get(),
			ItemRegistry.zucchiniitem.get()
			
			);

	private static final Ingredient Rabbit = Ingredient.of(
			ItemRegistry.blackberryitem.get(),
			ItemRegistry.blueberryitem.get(),
			ItemRegistry.cactusfruititem.get(),
			ItemRegistry.candleberryitem.get(),
			ItemRegistry.cantaloupeitem.get(),
			ItemRegistry.cranberryitem.get(),
			ItemRegistry.elderberryitem.get(),
			ItemRegistry.grapeitem.get(),
			ItemRegistry.greengrapeitem.get(),
			ItemRegistry.huckleberryitem.get(),
			ItemRegistry.juniperberryitem.get(),
			ItemRegistry.kiwiitem.get(),
			Items.MELON,
			ItemRegistry.mulberryitem.get(),
			ItemRegistry.pineappleitem.get(),
			ItemRegistry.raspberryitem.get(),
			ItemRegistry.spiceleafitem.get(),
			ItemRegistry.strawberryitem.get(),
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