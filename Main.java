package com.Yuki_Spike.rthaumcraft;

import com.Yuki_Spike.rthaumcraft.curios.CuriosSlotTypeHandler;
import com.Yuki_Spike.rthaumcraft.items.bonebow;
import com.Yuki_Spike.rthaumcraft.list.BlockList;
import com.Yuki_Spike.rthaumcraft.list.EntityList;
import com.Yuki_Spike.rthaumcraft.list.FoodList;
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
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;
//import top.theillusivec4.curios.api.SlotTypeMessage;

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
        ItemList.ITEMS.register(bus);
        FoodList.ITEMS.register(bus);
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

    public void enqueueIMC(final InterModEnqueueEvent event) {
    //    SlotTypePreset[] types = {SlotTypePreset.HEAD, SlotTypePreset.NECKLACE, SlotTypePreset.BELT};
    //    for (SlotTypePreset type : types) {
    //        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> type.getMessageBuilder().build());
    //   }
    //    InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> SlotTypePreset.HANDS.getMessageBuilder().size(2).build());
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLCommonSetupEvent event) {
        }
    }
}
