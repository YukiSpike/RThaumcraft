package com.Yuki_Spike.rthaumcraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class ModTable_Research extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    private static final VoxelShape SHAPE;

    static {
        VoxelShape base1 = Block.box(0, 12, 0, 16, 16, 16);
        VoxelShape base2 = Block.box(10, 0, 2, 14, 12, 6);
        VoxelShape base3 = Block.box(10, 0, 10, 14, 12, 14);
        VoxelShape base4 = Block.box(2, 0, 2, 6, 12, 6);
        VoxelShape base5 = Block.box(2, 0, 10, 6, 12, 14);
        VoxelShape base6 = Block.box(4, 16.1, 0, 12, 16.1, 8);
        SHAPE = Shapes.or(base1, base2, base3, base4, base5, base6);}

    public ModTable_Research(Properties builder) {
        super(builder);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState p_55200_, BlockGetter p_55201_, BlockPos p_55202_, CollisionContext p_55203_) {
        return SHAPE;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState blockState, Rotation rotation) {
        return blockState.setValue(FACING, rotation.rotate(blockState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState blockState, Mirror mirror) {
        return blockState.rotate(mirror.getRotation(blockState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}