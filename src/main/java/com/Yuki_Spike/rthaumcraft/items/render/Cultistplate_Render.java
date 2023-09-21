package com.Yuki_Spike.rthaumcraft.items.render;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.items.armor.Cultistplate_Armor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class Cultistplate_Render extends GeoArmorRenderer<Cultistplate_Armor> {
	public Cultistplate_Render() {
		super(new DefaultedItemGeoModel<>(new ResourceLocation(RThaumcraft.MODID, "armor/cultistplate_armor")));

	}
}