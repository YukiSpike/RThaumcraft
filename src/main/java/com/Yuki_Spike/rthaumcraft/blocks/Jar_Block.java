package com.Yuki_Spike.rthaumcraft.blocks;

import com.Yuki_Spike.rthaumcraft.list.FluidList;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.templates.FluidTank;


public class Jar_Block extends Block {

    private static final VoxelShape SHAPE;
    static {
        VoxelShape base1 = Block.box(3, 0, 3, 13, 12, 13);
        VoxelShape base2 = Block.box(5, 12, 5, 11, 14, 11);
        SHAPE = Shapes.or(base1, base2);}

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public Jar_Block(Properties builder) {
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

    private final FluidTank FLUID_TANK = new FluidTank(64000) {
        @Override
        protected void onContentsChanged() {
            setChanged();
        }
        private void setChanged() {
        }
        @Override
        public boolean isFluidValid(FluidStack stack) {
            return stack.getFluid() == Fluids.WATER || stack.getFluid() == FluidList.SOURCE_DEATHWATER.get();
        }
    };
    public void setFluid(FluidStack stack) {
        this.FLUID_TANK.setFluid(stack);
    }
    public FluidStack geFluidStack() {
        return this.FLUID_TANK.getFluid();
    }
}
