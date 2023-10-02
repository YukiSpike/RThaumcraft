package com.Yuki_Spike.rthaumcraft.items.aspect;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class CompoundAspect extends Item {
    private static final List<CompoundAspect> COMPOUND_ASPECTS = new ArrayList<>();
    private final int color;
    private RegistryObject[] components;

    public CompoundAspect(Properties properties, int color, RegistryObject[] components) {
        super(properties);
        this.color = color;
        this.components = components;
        COMPOUND_ASPECTS.add(this);
    }

    @Mod.EventBusSubscriber(value = Dist.CLIENT, modid = RThaumcraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class ColorRegisterHandler
    {
        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public static void registerCompoundAspectColors(RegisterColorHandlersEvent.Item event)
        {
            COMPOUND_ASPECTS.forEach(aspects -> event.getItemColors().register((stack, color) -> aspects.getColor(), aspects));
        }
    }

    public int getColor() {
        return this.color;
    }
    public RegistryObject[] getComponents() {
        return components;
    }
    public void setComponents(RegistryObject[] components) {
        this.components = components;
    }

}