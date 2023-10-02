package com.Yuki_Spike.rthaumcraft.init;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.fluid.Death_Water;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, RThaumcraft.MODID);

    public static final RegistryObject<FlowingFluid> SOURCE_DEATHWATER = FLUIDS.register("source_deathwater",
            () -> new ForgeFlowingFluid.Source(ModFluids.DEATHWATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DEATHWATER = FLUIDS.register("flowing_deathwater",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DEATHWATER_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties DEATHWATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(Death_Water.DEATHWATER_FLUIDTYPE, SOURCE_DEATHWATER, FLOWING_DEATHWATER)
            .slopeFindDistance(2).levelDecreasePerBlock(1)
            .block(ModBlocks.DEATHWATER_BLOCK).bucket(ModItems.DEATHWATER_BUCKET);

/*
    public static final RegistryObject<FlowingFluid> SOURCE_ESSENTIA_AER = FLUIDS.register("source_essentia_aer",
            () -> new ForgeFlowingFluid.Source(ModFluids.ESSENTIA_AER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_ESSENTIA_AER = FLUIDS.register("flowing_essentia_aer",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DEATHWATER_FLUID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties ESSENTIA_AER_PROPERTIES = new ForgeFlowingFluid.Properties(ModFluidTypes.ESSENTIA_AER_FLUIDTYPE, SOURCE_ESSENTIA_AER, FLOWING_ESSENTIA_AER)
            .slopeFindDistance(0).levelDecreasePerBlock(0).block(ModBlocks.ESSENTIA_AER_BLOCK);
*/


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}