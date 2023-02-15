package com.Yuki_Spike.rthaumcraft.items.model;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.items.Cultistrobe_Armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class Cultistrobe_Model extends AnimatedGeoModel<Cultistrobe_Armor> {
	
	@Override
	public ResourceLocation getModelResource(Cultistrobe_Armor object) {
		return new ResourceLocation(Main.MOD_ID, "geo/cultistrobe_armor.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureResource(Cultistrobe_Armor object) {
		return new ResourceLocation(Main.MOD_ID, "textures/models/armor/cultistrobe_armor.png");
	}

	@Override
	public ResourceLocation getAnimationResource(Cultistrobe_Armor animatable) {
		return new ResourceLocation(Main.MOD_ID, "animations/model.animation.json");
	}
}
