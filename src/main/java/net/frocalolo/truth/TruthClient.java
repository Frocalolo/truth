package net.frocalolo.truth;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.frocalolo.truth.client.model.ShadowAssassinEntityModel;
import net.frocalolo.truth.client.renderer.ShadowAssassinEntityRenderer;
import net.frocalolo.truth.client.renderer.ShadowAssassinGuardEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class TruthClient implements ClientModInitializer {

    public static final EntityModelLayer MODEL_WIGGLEAR_LAYER = new EntityModelLayer(new Identifier("truth", "wigglear"), "main");
    public static final EntityModelLayer MODEL_WIGGLEARA_LAYER = new EntityModelLayer(new Identifier("truth", "wiggleara"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Truth.WIGGLEAR, (context) -> {
            return new ShadowAssassinEntityRenderer(context);
        });

        EntityRendererRegistry.register(Truth.WIGGLEARA, (context) -> {
            return new ShadowAssassinGuardEntityRenderer(context);
        });


        EntityModelLayerRegistry.registerModelLayer(MODEL_WIGGLEAR_LAYER, ShadowAssassinEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_WIGGLEARA_LAYER, ShadowAssassinEntityModel::getTexturedModelData);

    }
}
