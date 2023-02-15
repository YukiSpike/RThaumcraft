package com.Yuki_Spike.rthaumcraft.items.model;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.items.Cultistleader_Armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class Cultistleader_Model extends AnimatedGeoModel<Cultistleader_Armor> {
	
	@Override
	public ResourceLocation getModelResource(Cultistleader_Armor object) {
		return new ResourceLocation(Main.MOD_ID, "geo/cultistleader_armor.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureResource(Cultistleader_Armor object) {
		return new ResourceLocation(Main.MOD_ID, "textures/models/armor/cultistleader_armor.png");
	}

	@Override
	public ResourceLocation getAnimationResource(Cultistleader_Armor animatable) {
		return new ResourceLocation(Main.MOD_ID, "animations/cultist_leader.json");
	}
}
