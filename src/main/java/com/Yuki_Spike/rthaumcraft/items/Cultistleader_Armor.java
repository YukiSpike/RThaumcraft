package com.Yuki_Spike.rthaumcraft.items;

import java.util.List;
import com.Yuki_Spike.rthaumcraft.Main;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
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


public class Cultistleader_Armor extends GeoArmorItem implements IAnimatable{

	private AnimationFactory factory = GeckoLibUtil.createFactory(this);

	public Cultistleader_Armor(ArmorMaterial materialIn, EquipmentSlot slot, Properties builder) {
		super(materialIn, slot, builder.tab(Main.MAIN_TAB));
	}
	@Override
	public void registerControllers(AnimationData data) {
		data.addAnimationController(new AnimationController<Cultistleader_Armor>(this, "controller", 20, this::predicate));
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

		if(event.isMoving())
		{
			event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", ILoopType.EDefaultLoopTypes.LOOP));
			return PlayState.CONTINUE;
		}

		if (!event.isMoving()) {
			event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", ILoopType.EDefaultLoopTypes.LOOP));
			return PlayState.STOP;
		}
		return PlayState.STOP;
	}
	
	

}