package com.Yuki_Spike.rthaumcraft.items.render;

import com.Yuki_Spike.rthaumcraft.items.Thaumiumfortress_Armor;
import com.Yuki_Spike.rthaumcraft.items.model.Thaumiumfortress_Model;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;


public class Thaumiumfortress_Render extends GeoArmorRenderer<Thaumiumfortress_Armor> {
	public Thaumiumfortress_Render() {
		super(new Thaumiumfortress_Model());

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
