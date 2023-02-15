package com.Yuki_Spike.rthaumcraft.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.Yuki_Spike.rthaumcraft.Main;
import com.Yuki_Spike.rthaumcraft.list.ItemList;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;
import software.bernie.geckolib3.util.GeckoLibUtil;


public class Cultistplate_Armor extends GeoArmorItem implements IAnimatable{

	private AnimationFactory factory = GeckoLibUtil.createFactory(this);

	public Cultistplate_Armor(ArmorMaterial materialIn, EquipmentSlot slot, Properties builder) {
		super(materialIn, slot, builder.tab(Main.MAIN_TAB));
	}
	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController<Cultistplate_Armor>(this, "controller", 20, this::predicate));
	}
	
	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}
    
    @SuppressWarnings({ "unused" })
	private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
		List<EquipmentSlot> slotData = event.getExtraDataOfType(EquipmentSlot.class);
		List<ItemStack> stackData = event.getExtraDataOfType(ItemStack.class);
		LivingEntity livingEntity = event.getExtraDataOfType(LivingEntity.class).get(0);

		if(!event.isMoving())
		{
			event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", ILoopType.EDefaultLoopTypes.LOOP));
		}

		if (livingEntity instanceof ArmorStand) {
			return PlayState.CONTINUE;
		}

		else if (livingEntity instanceof Player) {
			Player player = (Player) livingEntity;

			List<Item> equipmentList = new ArrayList<>();
			player.getAllSlots().forEach((x) -> equipmentList.add(x.getItem()));

			List<Item> armorList = equipmentList.subList(3, 6);

			boolean isWearingAll = armorList
					.containsAll(Arrays.asList( ItemList.CULTISTPLATE_LEGGINGS.get(),
					                            ItemList.CULTISTPLATE_CHESTPLATE.get(),
						                        ItemList.CULTISTPLATE_HELM.get()));
			return isWearingAll ? PlayState.CONTINUE : PlayState.STOP;
		}
		return PlayState.STOP;
	}
	
	

}