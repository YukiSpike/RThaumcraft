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


public class CustomRunicMatrix extends Block {

    private static final VoxelShape SHAPE;
    static {
        VoxelShape base1 = Block.box(8.5, 0.5, 0.5, 15.5, 7.5, 7.5);
        VoxelShape base2 = Block.box(8.5, 8.5, 8.5, 15.5, 15.5, 15.5);
        VoxelShape base3 = Block.box(8.5, 0.5, 8.5, 15.5, 7.5, 15.5);
        VoxelShape base4 = Block.box(0.5, 0.5, 0.5, 7.5, 7.5, 7.5);
        VoxelShape base5 = Block.box(0.5, 0.5, 8.5, 7.5, 7.5, 15.5);
        VoxelShape base6 = Block.box(8.5, 8.5, 0.5, 15.5, 15.5, 7.5);
        VoxelShape base7 = Block.box(0.5, 8.5, 8.5, 7.5, 15.5, 15.5);
        VoxelShape base8 = Block.box(0.5, 8.5, 0.5, 7.5, 15.5, 7.5);
        SHAPE = Shapes.or(base1, base2, base3, base4, base5, base6, base7, base8);}

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public CustomRunicMatrix(Properties builder) {
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