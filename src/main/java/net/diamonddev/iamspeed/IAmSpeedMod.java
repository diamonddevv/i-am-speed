package net.diamonddev.iamspeed;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class IAmSpeedMod implements ModInitializer {
	public static final String modid = "iamspeed";
	public static final Logger LOGGER = LoggerFactory.getLogger("i am speed");

	@Override
	public void onInitialize() {
		Random r = new Random();
		String s = "r".repeat(Math.max(0, r.nextInt(1, 100)));
		LOGGER.info("neo" + s);
	}
}
