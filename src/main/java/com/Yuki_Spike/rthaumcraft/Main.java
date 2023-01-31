package com.Yuki_Spike.rthaumcraft;

import org.slf4j.Logger;

import com.Yuki_Spike.rthaumcraft.items.bonebow;
import com.Yuki_Spike.rthaumcraft.list.BlockList;
import com.Yuki_Spike.rthaumcraft.list.EntityList;
import com.Yuki_Spike.rthaumcraft.list.ItemList;
import com.Yuki_Spike.rthaumcraft.world.feature.ModConfiguredFeatures;
import com.Yuki_Spike.rthaumcraft.world.feature.ModPlacedFeatures;
import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

@Mod(Main.MOD_ID)
public class Main {

    public static final String MOD_ID = "rthaumcraft";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final CreativeModeTab MAIN_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemList.THAUMONOMICON.get());
        }
    };

    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);
        bus.addListener(this::setup); 
        bus.addListener(this::clientSetup);
        ItemList.ITEMS.register(bus);
        BlockList.BLOCKS.register(bus);
        EntityList.ENTITY_TYPES.register(bus);
        ModConfiguredFeatures.register(bus);
        ModPlacedFeatures.register(bus);
        GeckoLib.initialize();
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void setup(final FMLCommonSetupEvent event) {

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void clientSetup(final FMLClientSetupEvent event) {
        bonebow.addCustomItemProperties();
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLCommonSetupEvent event) {
        }
    }
}
