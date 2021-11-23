package net.frocalolo.truth.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class ShadowAssassinGuardEntity extends HostileEntity{
    public ShadowAssassinGuardEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createShadowAttributes() {
        return HostileEntity.createHostileAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 60)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.0D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 30.0D)
                .add(EntityAttributes.GENERIC_ARMOR, 2.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.5D)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 1.0D);
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(1, new MeleeAttackGoal(this, 1, true));
        this.goalSelector.add(1, new RevengeGoal(this, new Class[0]));
        this.goalSelector.add(2, new WanderAroundGoal(this, 0.5));
        this.goalSelector.add(2, new LookAroundGoal(this));
        this.goalSelector.add(2, new GoToWalkTargetGoal(this, 0.5));
        this.goalSelector.add(2, new TrackTargetGoal(this, true) {
            @Override
            public boolean canStart() {
                return false;
            }
        });

    }
}
