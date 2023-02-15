package com.Yuki_Spike.rthaumcraft.items.model;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.items.Cultistplate_Armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class Cultistplate_Model extends AnimatedGeoModel<Cultistplate_Armor> {
	
	@Override
	public ResourceLocation getModelResource(Cultistplate_Armor object) {
		return new ResourceLocation(Main.MOD_ID, "geo/cultistplate_armor.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureResource(Cultistplate_Armor object) {
		return new ResourceLocation(Main.MOD_ID, "textures/models/armor/cultistplate_armor.png");
	}

	@Override
	public ResourceLocation getAnimationResource(Cultistplate_Armor animatable) {
		return new ResourceLocation(Main.MOD_ID, "animations/model.animation.json");
	}
}
