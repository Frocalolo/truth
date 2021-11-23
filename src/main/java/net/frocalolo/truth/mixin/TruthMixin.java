package net.frocalolo.truth.mixin;

import net.frocalolo.truth.Truth;
import net.frocalolo.truth.datagen.ModelGenerator;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TitleScreen.class)
public class TruthMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Truth.LOGGER.info("This line is printed by an example mod mixin!");
	}


}
