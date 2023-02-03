package com.Yuki_Spike.rthaumcraft.list;

import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.fluid.BaseFluidType;
import com.mojang.math.Vector3f;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FluidTypeList {
    public static final ResourceLocation WATER_STILL_RESOURCE_LOCATION = new ResourceLocation("rthaumcraft:block/death_water");
    public static final ResourceLocation WATER_FLOWING_RESOURCE_LOCATION = new ResourceLocation("rthaumcraft:block/death_water");
    public static final ResourceLocation DEATH_OVERLAY_RESOURCE_LOCATION = new ResourceLocation(Main.MOD_ID, "rthaumcraft/death_water"); 
    
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Main.MOD_ID);

    public static final RegistryObject<FluidType> DEATH_WATER_FLUID_TYPE = register("death_water_fluid", FluidType.Properties.create().lightLevel(2).density(15).viscosity(5));



    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RESOURCE_LOCATION, WATER_FLOWING_RESOURCE_LOCATION, DEATH_OVERLAY_RESOURCE_LOCATION,
        0xA1E038D0, new Vector3f(224f/225f, 56f/255f, 209f/255f), properties));
    }



    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
