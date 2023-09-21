package com.Yuki_Spike.rthaumcraft.items.render;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.items.armor.Cultistleader_Armor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class Cultistleader_Render extends GeoArmorRenderer<Cultistleader_Armor> {
	public Cultistleader_Render() {
		super(new DefaultedItemGeoModel<>(new ResourceLocation(RThaumcraft.MODID, "armor/cultistleader_armor")));

	}
}