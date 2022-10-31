package net.diamonddev.iamspeed;

import net.diamonddev.iamspeed.mixin.BooleanRuleInvoker;
import net.diamonddev.iamspeed.mixin.GameRuleInvoker;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class IAmSpeedMod implements ModInitializer {
	public static final String modid = "iamspeed";
	public static final Logger LOGGER = LoggerFactory.getLogger("i am speed");

	public static GameRules.Key<GameRules.BooleanRule> NO_DRAG;
	public static boolean DRAG;
	@Override
	public void onInitialize() {
		Random r = new Random();
		String s = "r".repeat(Math.max(0, r.nextInt(1, 100)));
		LOGGER.info("neo" + s);

		NO_DRAG = GameRuleInvoker.invokeRegister("noDrag", GameRules.Category.MOBS,
				BooleanRuleInvoker.invokeCreate(false, (server, rule) -> DRAG = rule.get()));
	}
}
