package com.Yuki_Spike.rthaumcraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CustomLamp extends Block {
    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public CustomLamp(Properties properties) {
        super(properties);
    }
    private static final VoxelShape SHAPE = Block.box(4, 0, 4, 12, 12, 12);
    
    @Override
    public InteractionResult use(BlockState state,Level level,BlockPos blockPos,Player player,InteractionHand hand,BlockHitResult result) {

        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            level.setBlock(blockPos, state.cycle(LIT), UPDATE_ALL);
        }
        return super.use(state, level, blockPos, player, hand, result);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);

    }
    @Override
    public VoxelShape getShape(BlockState p_55200_, BlockGetter p_55201_, BlockPos p_55202_, CollisionContext p_55203_) {
        return SHAPE;
    }

}
