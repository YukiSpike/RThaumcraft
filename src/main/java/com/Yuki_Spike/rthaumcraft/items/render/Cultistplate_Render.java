package com.Yuki_Spike.rthaumcraft.items.render;

import com.Yuki_Spike.rthaumcraft.items.Cultistplate_Armor;
import com.Yuki_Spike.rthaumcraft.items.model.Cultistplate_Model;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;


public class Cultistplate_Render extends GeoArmorRenderer<Cultistplate_Armor> {
	public Cultistplate_Render() {
		super(new Cultistplate_Model());

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
