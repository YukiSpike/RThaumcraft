package com.Yuki_Spike.rthaumcraft.items.render;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.items.armor.Thaumiumfortress_Armor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class Thaumiumfortress_Render extends GeoArmorRenderer<Thaumiumfortress_Armor> {
	public Thaumiumfortress_Render() {
		super(new DefaultedItemGeoModel<>(new ResourceLocation(RThaumcraft.MODID, "armor/thaumiumfortress_armor")));

	}
}