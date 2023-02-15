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
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Main.MOD_ID);

    public static final ResourceLocation DEATHWATER_STILL_RESOURCE_LOCATION = new ResourceLocation("rthaumcraft:block/deathwater");
    public static final ResourceLocation DEATHWATER_FLOWING_RESOURCE_LOCATION = new ResourceLocation("rthaumcraft:block/deathwater");
    
    public static final RegistryObject<FluidType> DEATHWATER_FLUID_TYPE = register("deathwater_fluid_type", FluidType.Properties.create().lightLevel(2).density(15).viscosity(5));

    public static final RegistryObject<FluidType> WARDED_TERRA_FLUID_TYPE = register("warded_terra_fluid_type", FluidType.Properties.create().lightLevel(2).density(15).viscosity(5));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(DEATHWATER_STILL_RESOURCE_LOCATION, DEATHWATER_FLOWING_RESOURCE_LOCATION,
        0xA1E038D0, new Vector3f(224f/225f, 56f/255f, 209f/255f), properties));

    }
    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }

}
