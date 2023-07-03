package com.Yuki_Spike.rthaumcraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModCeilingHangingSignBlock extends CeilingHangingSignBlock
{
    public ModCeilingHangingSignBlock(Properties properties, WoodType type)
    {
        super(properties, type);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state)
    {
        return new ModHangingSignBlockEntity(pos, state);
    }
}
