package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FluidList {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Main.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_DEATHWATER = FLUIDS.register("deathwater_fluid", 
    () -> new ForgeFlowingFluid.Source(FluidList.DEATHWATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DEATHWATER = FLUIDS.register("flowing_deathwater_fluid", 
    () -> new ForgeFlowingFluid.Flowing(FluidList.DEATHWATER_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties DEATHWATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeList.DEATHWATER_FLUID_TYPE, SOURCE_DEATHWATER, FLOWING_DEATHWATER)
    .slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockList.DEATHWATER_BLOCK).bucket(ItemList.DEATHWATER_BUCKET);

    public static final RegistryObject<FlowingFluid> SOURCE_WARDED_TERRA = FLUIDS.register("warded_terra_fluid", 
    () -> new ForgeFlowingFluid.Source(FluidList.WARDED_TERRA_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_WARDED_TERRA = FLUIDS.register("flowing_warded_terra_fluid", 
    () -> new ForgeFlowingFluid.Flowing(FluidList.WARDED_TERRA_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties WARDED_TERRA_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypeList.WARDED_TERRA_FLUID_TYPE, SOURCE_WARDED_TERRA, FLOWING_WARDED_TERRA)
    .slopeFindDistance(2).levelDecreasePerBlock(2).block(BlockList.WARDED_TERRA_BLOCK).bucket(ItemList.WARDED_TERRA_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}
