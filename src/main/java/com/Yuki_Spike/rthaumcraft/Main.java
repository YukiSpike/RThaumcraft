package com.Yuki_Spike.rthaumcraft;

import com.Yuki_Spike.rthaumcraft.curios.CuriosSlotTypeHandler;
import com.Yuki_Spike.rthaumcraft.entity.Cultistleader_Entity;
import com.Yuki_Spike.rthaumcraft.entity.render.Cultistleader_EntityRender;
import com.Yuki_Spike.rthaumcraft.items.Cultistleader_Armor;
import com.Yuki_Spike.rthaumcraft.items.Cultistplate_Armor;
import com.Yuki_Spike.rthaumcraft.items.Cultistrobe_Armor;
import com.Yuki_Spike.rthaumcraft.items.Thaumiumfortress_Armor;
import com.Yuki_Spike.rthaumcraft.items.Travelerboots_Armor;
import com.Yuki_Spike.rthaumcraft.items.bonebow;
import com.Yuki_Spike.rthaumcraft.items.render.Cultistleader_Render;
import com.Yuki_Spike.rthaumcraft.items.render.Cultistplate_Render;
import com.Yuki_Spike.rthaumcraft.items.render.Cultistrobe_Render;
import com.Yuki_Spike.rthaumcraft.items.render.Thaumiumfortress_Render;
import com.Yuki_Spike.rthaumcraft.items.render.Travelerboots_Render;
import com.Yuki_Spike.rthaumcraft.list.AspectList;
import com.Yuki_Spike.rthaumcraft.list.BlockEntityList;
import com.Yuki_Spike.rthaumcraft.list.BlockList;
import com.Yuki_Spike.rthaumcraft.list.EnchantmentList;
import com.Yuki_Spike.rthaumcraft.list.EntityList;
import com.Yuki_Spike.rthaumcraft.list.FluidList;
import com.Yuki_Spike.rthaumcraft.list.FluidTypeList;
import com.Yuki_Spike.rthaumcraft.list.FoodList;
import com.Yuki_Spike.rthaumcraft.list.ItemList;
import com.Yuki_Spike.rthaumcraft.list.MenuList;
import com.Yuki_Spike.rthaumcraft.screen.AlchemicalFurnace_Screen;
import com.Yuki_Spike.rthaumcraft.world.feature.ModConfiguredFeatures;
import com.Yuki_Spike.rthaumcraft.world.feature.ModPlacedFeatures;
import com.mojang.logging.LogUtils;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

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
        bus.addListener(CuriosSlotTypeHandler::onInterModEnqueueEvent);
        ItemList.register(bus);
        AspectList.register(bus);
        FoodList.register(bus);
        BlockList.register(bus);
        EntityList.register(bus);
        BlockEntityList.register(bus);
        EnchantmentList.register(bus);
        FluidList.register(bus);
        FluidTypeList.register(bus);
        MenuList.register(bus);
        GeckoLib.initialize();
        ModConfiguredFeatures.CONFIGURED_FEATURES.register(bus);
        ModPlacedFeatures.PLACED_FEATURES.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void setup(final FMLCommonSetupEvent event) {

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void clientSetup(final FMLClientSetupEvent event) {
        bonebow.addCustomItemProperties();
    }

    public void enqueueIMC(final InterModEnqueueEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLCommonSetupEvent event) {
            MenuScreens.register(MenuList.AF_MENU.get(), AlchemicalFurnace_Screen::new);
        }       
        @SubscribeEvent
        public static void registerArmorRenderer(final EntityRenderersEvent.AddLayers event) {
            GeoArmorRenderer.registerArmorRenderer(Thaumiumfortress_Armor.class, Thaumiumfortress_Render::new);
            GeoArmorRenderer.registerArmorRenderer(Cultistleader_Armor.class, Cultistleader_Render::new);
            GeoArmorRenderer.registerArmorRenderer(Cultistrobe_Armor.class, Cultistrobe_Render::new);
            GeoArmorRenderer.registerArmorRenderer(Cultistplate_Armor.class, Cultistplate_Render::new);
            GeoArmorRenderer.registerArmorRenderer(Travelerboots_Armor.class, Travelerboots_Render::new);
        }
        @SubscribeEvent
        public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(EntityList.CULTIST_LEADER.get(), Cultistleader_EntityRender::new);
    
        }
        @SubscribeEvent
        public static void onAttributeCreate(EntityAttributeCreationEvent event) {
            event.put(EntityList.CULTIST_LEADER.get(), Cultistleader_Entity.prepareAttributes().build());
    
        }
    }

}
