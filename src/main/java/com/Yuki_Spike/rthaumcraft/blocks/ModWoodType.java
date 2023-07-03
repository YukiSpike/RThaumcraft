package com.Yuki_Spike.rthaumcraft.blocks;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodType {
    public static final WoodType GREAT = WoodType.register(new WoodType(RThaumcraft.MODID + ":great", ModBlockSetType.GREAT));
    public static final WoodType SILVER = WoodType.register(new WoodType(RThaumcraft.MODID + ":silver", ModBlockSetType.SILVER));

}
