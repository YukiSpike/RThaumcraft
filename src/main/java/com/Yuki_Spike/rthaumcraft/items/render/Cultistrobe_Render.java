package com.Yuki_Spike.rthaumcraft.items.render;

import com.Yuki_Spike.rthaumcraft.items.Cultistrobe_Armor;
import com.Yuki_Spike.rthaumcraft.items.model.Cultistrobe_Model;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;


public class Cultistrobe_Render extends GeoArmorRenderer<Cultistrobe_Armor> {
	public Cultistrobe_Render() {
		super(new Cultistrobe_Model());

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
