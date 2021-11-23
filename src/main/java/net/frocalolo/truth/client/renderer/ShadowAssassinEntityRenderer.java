package net.frocalolo.truth.client.renderer;

import net.frocalolo.truth.TruthClient;
import net.frocalolo.truth.client.model.ShadowAssassinEntityModel;
import net.frocalolo.truth.entity.ShadowAssassinEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ShadowAssassinEntityRenderer extends MobEntityRenderer<ShadowAssassinEntity, ShadowAssassinEntityModel> {
    public ShadowAssassinEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ShadowAssassinEntityModel(context.getPart(TruthClient.MODEL_WIGGLEAR_LAYER)), 0.5f);
    }
    @Override
    public Identifier getTexture(ShadowAssassinEntity entity) {
        return new Identifier("truth", "textures/entity/wigglear/wigglear.png");
    }
}
