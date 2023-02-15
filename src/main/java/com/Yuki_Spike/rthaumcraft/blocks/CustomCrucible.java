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


public class CustomCrucible extends Block {

    private static final VoxelShape SHAPE;
    static {
        VoxelShape base1 = Block.box(2, 4, 14, 14, 16, 16);
        VoxelShape base2 = Block.box(2, 4, 0, 14, 16, 2);
        VoxelShape base3 = Block.box(14, 4, 0, 16, 16, 16);
        VoxelShape base4 = Block.box(0, 4, 0, 2, 16, 16);
        VoxelShape base5 = Block.box(0, 3, 0, 16, 4, 16);
        VoxelShape base6 = Block.box(12, 0, 13, 13, 2, 15);
        VoxelShape base7 = Block.box(13, 0, 12, 15, 2, 15);
        VoxelShape base8 = Block.box(12, 0, 1, 15, 2, 3);
        VoxelShape base9 = Block.box(12, 2, 0, 16, 3, 4);
        VoxelShape base10 = Block.box(13, 0, 3, 15, 2, 4);
        VoxelShape base11 = Block.box(3, 0, 13, 4, 2, 15);
        VoxelShape base12 = Block.box(1, 0, 12, 3, 2, 15);
        VoxelShape base13 = Block.box(3, 0, 1, 4, 2, 3);
        VoxelShape base14 = Block.box(1, 0, 1, 3, 2, 4);
        VoxelShape base15 = Block.box(12, 2, 12, 16, 3, 16);
        VoxelShape base16 = Block.box(0, 2, 0, 4, 3, 4);
        VoxelShape base17 = Block.box(0, 2, 12, 4, 3, 16);
        SHAPE = Shapes.or(base1, base2, base3, base4, base5, base6, base7, base8, base9, base10, base11, base12, base13, base14, base15, base16, base17);}

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public CustomCrucible(Properties builder) {
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
