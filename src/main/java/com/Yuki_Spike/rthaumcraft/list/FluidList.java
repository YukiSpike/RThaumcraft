package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FluidList {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_DEATH_WATER = FLUIDS.register("death_water_fluid", 
    () -> new ForgeFlowingFluid.Source(FluidList.DEATH_WATER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_DEATH_WATER = FLUIDS.register("flowing_water_fluid", 
    () -> new ForgeFlowingFluid.Flowing(FluidList.DEATH_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties DEATH_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeList.DEATH_WATER_FLUID_TYPE, SOURCE_DEATH_WATER, FLOWING_DEATH_WATER)
    .slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockList.DEATH_WATER_BLOCK).bucket(ItemList.DEATH_WATER_BUCKET);
}
