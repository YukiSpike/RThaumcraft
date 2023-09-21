package com.Yuki_Spike.rthaumcraft.items.render;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.items.armor.Cultistrobe_Armor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class Cultistrobe_Render extends GeoArmorRenderer<Cultistrobe_Armor> {
	public Cultistrobe_Render() {
		super(new DefaultedItemGeoModel<>(new ResourceLocation(RThaumcraft.MODID, "armor/cultistrobe_armor")));

	}
}