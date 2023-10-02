package com.Yuki_Spike.rthaumcraft.fluid;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.fluid.ModFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class Death_Water {
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, RThaumcraft.MODID);

    public static final ResourceLocation DEATHWATER_STILL = new ResourceLocation(RThaumcraft.MODID, "block/deathwater");
    public static final ResourceLocation DEATHWATER_FLOWING = new ResourceLocation(RThaumcraft.MODID, "block/deathwater");
    public static final ResourceLocation DEATHWATER_OVERLAY = new ResourceLocation(RThaumcraft.MODID, "block/deathwater");

    public static final RegistryObject<FluidType> DEATHWATER_FLUIDTYPE = register("deathwater_fluidtype",
            FluidType.Properties.create().lightLevel(2).density(10).viscosity(10));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new ModFluidType(DEATHWATER_STILL, DEATHWATER_FLOWING, DEATHWATER_OVERLAY,
                0xA1E038D0, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));

    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }

}