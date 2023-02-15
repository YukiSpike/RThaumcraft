package com.Yuki_Spike.rthaumcraft.items.render;

import com.Yuki_Spike.rthaumcraft.items.Cultistleader_Armor;
import com.Yuki_Spike.rthaumcraft.items.model.Cultistleader_Model;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;


public class Cultistleader_Render extends GeoArmorRenderer<Cultistleader_Armor> {
	public Cultistleader_Render() {
		super(new Cultistleader_Model());

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
