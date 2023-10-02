package com.Yuki_Spike.rthaumcraft.event;

import com.Yuki_Spike.rthaumcraft.RThaumcraft;
import com.Yuki_Spike.rthaumcraft.init.ModItems;
import com.Yuki_Spike.rthaumcraft.init.ModVillagers;
import com.Yuki_Spike.rthaumcraft.tag.PlayerAspect;
import com.Yuki_Spike.rthaumcraft.tag.PlayerAspectProvider;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = RThaumcraft.MODID)
public class ModEvents {
    @SubscribeEvent
    public static void addModTrades(VillagerTradesEvent event) {
        if(event.getType() == ModVillagers.UNDEFINED.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.COIN.get(), 24);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    stack,10,8,0.02F));
        }
    }

    //给玩家添加能力
    @SubscribeEvent
    public static void onAttachCapabilitiesPlayer(AttachCapabilitiesEvent<Entity> event) {
        if(event.getObject() instanceof Player) {
            if(!event.getObject().getCapability(PlayerAspectProvider.PLAYER_ASPECT).isPresent()) {
                event.addCapability(new ResourceLocation(RThaumcraft.MODID, "properties"), new PlayerAspectProvider());
            }
        }
    }

    //死亡或传送继承原状态
    @SubscribeEvent
    public static void onPlayerCloned(PlayerEvent.Clone event) {
        if(event.isWasDeath()) {
            event.getOriginal().getCapability(PlayerAspectProvider.PLAYER_ASPECT).ifPresent(oldStore -> {
                event.getOriginal().getCapability(PlayerAspectProvider.PLAYER_ASPECT).ifPresent(newStore -> {
                    newStore.copyFrom(oldStore);
                });
            });
        }
    }

    //注册
    @SubscribeEvent
    public static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
        event.register(PlayerAspect.class);
    }
}
