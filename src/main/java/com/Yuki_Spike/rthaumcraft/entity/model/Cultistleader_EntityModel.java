package com.Yuki_Spike.rthaumcraft.entity.model;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.entity.Cultistleader_Entity;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class Cultistleader_EntityModel extends AnimatedGeoModel<Cultistleader_Entity>{
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Main.MOD_ID, "cultistleader"), "main");

    @Override
    public ResourceLocation getModelResource(Cultistleader_Entity object) {
        return new ResourceLocation(Main.MOD_ID, "geo/cultist_leader.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Cultistleader_Entity object) {
        return new ResourceLocation(Main.MOD_ID, "textures/entity/cultist_leader.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Cultistleader_Entity animatable) {
        return new ResourceLocation(Main.MOD_ID, "animations/model.animation.json");
    }
}
