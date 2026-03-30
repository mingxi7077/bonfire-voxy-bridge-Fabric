package com.bonfiremc.voxybridge;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BonfireVoxyBridgeClient implements ClientModInitializer {
	public static final String MOD_ID = "bonfire_voxy_bridge";
	public static final String FIXED_MULTIPLAYER_FOLDER = "bonfire";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Bonfire Voxy Bridge loaded. Multiplayer Voxy root is forced to [{}].", FIXED_MULTIPLAYER_FOLDER);
	}
}
