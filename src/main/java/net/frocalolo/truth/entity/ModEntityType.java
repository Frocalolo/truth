package net.frocalolo.truth.entity;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

public class ModEntityType extends EntityType {

    public static EntityType<ShadowAssassinEntity> WIGGLEAR;
    public static EntityType<ShadowAssassinGuardEntity> WIGGLEARA;

    public ModEntityType(EntityFactory factory, SpawnGroup spawnGroup, boolean saveable, boolean summonable, boolean fireImmune, boolean spawnableFarFromPlayer, ImmutableSet canSpawnInside, EntityDimensions dimensions, int maxTrackDistance, int trackTickInterval) {


        super(factory, spawnGroup, saveable, summonable, fireImmune, spawnableFarFromPlayer, canSpawnInside, dimensions, maxTrackDistance, trackTickInterval);


    }
}
