package com.Yuki_Spike.rthaumcraft.items.model;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.items.Thaumiumfortress_Armor;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class Thaumiumfortress_Model extends AnimatedGeoModel<Thaumiumfortress_Armor> {
	
	//盔甲模型文件地址
	@Override
	public ResourceLocation getModelResource(Thaumiumfortress_Armor object) {
		return new ResourceLocation(Main.MOD_ID, "geo/thaumiumfortress_armor.geo.json");
	}
	
	//盔甲材质文件地址
	@Override
	public ResourceLocation getTextureResource(Thaumiumfortress_Armor object) {
		return new ResourceLocation(Main.MOD_ID, "textures/models/armor/thaumiumfortress_armor.png");
	}

	//盔甲动画文件地址
	@Override
	public ResourceLocation getAnimationResource(Thaumiumfortress_Armor animatable) {
		return new ResourceLocation(Main.MOD_ID, "animations/model.animation.json");
	}
}
