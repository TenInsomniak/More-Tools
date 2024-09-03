package net.teninsomniak.moretools;

import net.fabricmc.api.ModInitializer;
import net.teninsomniak.moretools.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreTools implements ModInitializer {
	public static final String MOD_ID = "moretools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
