package net.frocalolo.truth.client.model;

import net.frocalolo.truth.entity.ShadowAssassinEntity;
import net.frocalolo.truth.entity.ShadowAssassinGuardEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public class ShadowAssassinGuardEntityModel extends EntityModel<ShadowAssassinGuardEntity> {
    private final ModelPart head;
    private final ModelPart body;
    private final ModelPart rightArm;
    private final ModelPart leftArm;
    private final ModelPart rightLeg;
    private final ModelPart leftLeg;

    public ShadowAssassinGuardEntityModel(ModelPart modelPart) {
        this.head = modelPart.getChild(EntityModelPartNames.HEAD);
        this.body = modelPart.getChild(EntityModelPartNames.BODY);
        this.rightArm = modelPart.getChild(EntityModelPartNames.RIGHT_ARM);
        this.leftArm = modelPart.getChild(EntityModelPartNames.LEFT_ARM);
        this.rightLeg = modelPart.getChild(EntityModelPartNames.RIGHT_LEG);
        this.leftLeg = modelPart.getChild(EntityModelPartNames.LEFT_LEG);
    }

    public static TexturedModelData getTexturedModelData() {



        ModelData modelData= new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create()
                .uv(0, 0)
                .cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), ModelTransform.pivot(0F, 0F, 0F));
        modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create()
                .uv(32, 0)
                .cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), ModelTransform.pivot(0F, 0F, 0F));

        modelPartData.addChild(EntityModelPartNames.BODY, ModelPartBuilder.create()
                .uv(16, 16)
                .cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), ModelTransform.pivot(0F, 0F, 0F));
        modelPartData.addChild(EntityModelPartNames.BODY, ModelPartBuilder.create()
                .uv(28, 16)
                .cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), ModelTransform.pivot(0F, 0F, 0F));


        modelPartData.addChild(EntityModelPartNames.RIGHT_ARM, ModelPartBuilder.create()
                .uv(40, 16)
                .cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));



        modelPartData.addChild(EntityModelPartNames.LEFT_ARM, ModelPartBuilder.create()
                .uv(32, 48)
                .cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), ModelTransform.pivot(5.0F, 2.0F, 0.0F));


        modelPartData.addChild(EntityModelPartNames.RIGHT_LEG, ModelPartBuilder.create()
                .uv(0, 16)
                .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ModelTransform.pivot(-1.9F, 12.0F, 0.0F));



        modelPartData.addChild(EntityModelPartNames.LEFT_LEG, ModelPartBuilder.create()
                .uv(16, 48)
                .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ModelTransform.pivot(1.9F, 12.0F, 0.0F));

            return TexturedModelData.of(modelData, 64, 64);

    }
    @Override
    public void setAngles(ShadowAssassinGuardEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }


    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha){

        ImmutableList.of(this.head).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.body).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.rightArm).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.leftArm).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.rightLeg).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
        ImmutableList.of(this.leftLeg).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });


    }



}