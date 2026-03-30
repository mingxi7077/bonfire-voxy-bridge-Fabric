package com.bonfiremc.voxybridge.mixin.client;

import com.bonfiremc.voxybridge.BonfireVoxyBridgeClient;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.nio.file.Path;

@Pseudo
@Mixin(targets = "me.cortex.voxy.client.VoxyClientInstance", remap = false)
public abstract class VoxyClientInstanceMixin {
	@Inject(method = "getBasePath()Ljava/nio/file/Path;", at = @At("HEAD"), cancellable = true, remap = false)
	private static void bonfire$forceSharedMultiplayerRoot(CallbackInfoReturnable<Path> cir) {
		Minecraft minecraft = Minecraft.getInstance();
		if (minecraft.getSingleplayerServer() != null) {
			return;
		}

		Path sharedPath = minecraft.gameDirectory.toPath()
			.resolve(".voxy")
			.resolve("saves")
			.resolve(BonfireVoxyBridgeClient.FIXED_MULTIPLAYER_FOLDER)
			.toAbsolutePath();

		BonfireVoxyBridgeClient.LOGGER.info("Redirecting Voxy multiplayer save root to {}", sharedPath);
		cir.setReturnValue(sharedPath);
	}
}
