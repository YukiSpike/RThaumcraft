package com.Yuki_Spike.rthaumcraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class Researchtable_Block extends Block {

    private static final VoxelShape SHAPE;
    static {
        VoxelShape base1 = Block.box(0, 12, 0, 32, 16, 16);
        VoxelShape base2 = Block.box(2, 0, 10, 6, 12, 14);
        VoxelShape base3 = Block.box(2, 16, 2, 5, 18, 5);
        VoxelShape base4 = Block.box(2, 0, 2, 6, 12, 6);
        VoxelShape base5 = Block.box(4.5, 18, 1.5, 4.5, 22, 5.5);
        VoxelShape base6 = Block.box(26, 0, 10, 30, 12, 14);
        VoxelShape base7 = Block.box(26, 0, 2, 30, 12, 6);
        VoxelShape base8 = Block.box(10, 16.1, 0, 18, 16.1, 8);
        VoxelShape base9 = Block.box(8, 16.2, -1, 16, 16.2, 7);
        VoxelShape base10 = Block.box(4, 3, 6, 28, 7, 10);
        SHAPE = Shapes.or(base1, base2, base3, base4, base5, base6, base7, base8, base9, base10);}

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public Researchtable_Block(Properties builder) {
        super(builder);
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
    public BlockState rotate(BlockState blockstate, Rotation rot) {
        return blockstate.setValue(FACING, rot.rotate(blockstate.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState blockstate, Mirror mirror) {
        return blockstate.rotate(mirror.getRotation(blockstate.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}