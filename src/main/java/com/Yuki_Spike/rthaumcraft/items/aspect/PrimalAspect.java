package com.Yuki_Spike.rthaumcraft.items.aspect;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import java.util.ArrayList;
import java.util.List;


public class PrimalAspect extends Item {
    private static final List<PrimalAspect> PRIMAL_ASPECTS = new ArrayList<>();
    private final int color;
    private int blend;

    public PrimalAspect(Properties properties, int color, int blend) {
        super(properties);
        this.color = color;
        this.blend = blend;
        PRIMAL_ASPECTS.add(this);
    }

    @Mod.EventBusSubscriber(value = Dist.CLIENT, modid = RThaumcraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class ColorRegisterHandler
    {
        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public static void registerPrimalAspectColors(RegisterColorHandlersEvent.Item event)
        {
            PRIMAL_ASPECTS.forEach(aspects -> event.getItemColors().register((stack, color) -> aspects.getColor(), aspects));
        }
    }

    public int getColor() {
        return this.color;
    }
    public int getBlend() {
        return blend;
    }
    public void setBlend(int blend) {
        this.blend = blend;
    }

}
