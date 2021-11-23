package net.frocalolo.truth.client.renderer;

import net.frocalolo.truth.TruthClient;
import net.frocalolo.truth.client.model.ShadowAssassinGuardEntityModel;
import net.frocalolo.truth.entity.ShadowAssassinGuardEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ShadowAssassinGuardEntityRenderer extends MobEntityRenderer<ShadowAssassinGuardEntity, ShadowAssassinGuardEntityModel> {
    public ShadowAssassinGuardEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ShadowAssassinGuardEntityModel(context.getPart(TruthClient.MODEL_WIGGLEARA_LAYER)), 0.5f);
    }
    @Override
    public Identifier getTexture(ShadowAssassinGuardEntity entity) {
        return new Identifier("truth", "textures/entity/wigglear/wiggleara.png");
    }
}
