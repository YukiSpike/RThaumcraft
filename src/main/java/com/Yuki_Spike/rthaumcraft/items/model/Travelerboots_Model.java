package com.Yuki_Spike.rthaumcraft.items.model;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.items.Travelerboots_Armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class Travelerboots_Model extends AnimatedGeoModel<Travelerboots_Armor> {
	
	@Override
	public ResourceLocation getModelResource(Travelerboots_Armor object) {
		return new ResourceLocation(Main.MOD_ID, "geo/travelerboots_armor.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureResource(Travelerboots_Armor object) {
		return new ResourceLocation(Main.MOD_ID, "textures/models/armor/travelerboots_armor.png");
	}

	@Override
	public ResourceLocation getAnimationResource(Travelerboots_Armor animatable) {
		return new ResourceLocation(Main.MOD_ID, "animations/model.animation.json");
	}
}
