package com.Yuki_Spike.rthaumcraft.items.render;

import com.Yuki_Spike.rthaumcraft.items.Travelerboots_Armor;
import com.Yuki_Spike.rthaumcraft.items.model.Travelerboots_Model;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;


public class Travelerboots_Render extends GeoArmorRenderer<Travelerboots_Armor> {
	public Travelerboots_Render() {
		super(new Travelerboots_Model());

		this.headBone = "armorHead";
		this.bodyBone = "armorBody";
		this.rightArmBone = "armorRightArm";
		this.leftArmBone = "armorLeftArm";
		this.rightLegBone = "armorRightLeg";
		this.leftLegBone = "armorLeftLeg";
		this.rightBootBone = "armorRightBoot";
		this.leftBootBone = "armorLeftBoot";
        
	}
}
