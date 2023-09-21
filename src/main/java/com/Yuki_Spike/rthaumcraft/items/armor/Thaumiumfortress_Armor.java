package com.Yuki_Spike.rthaumcraft.items.armor;

import com.Yuki_Spike.rthaumcraft.init.ModItems;
import com.Yuki_Spike.rthaumcraft.items.render.Thaumiumfortress_Render;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.Set;
import java.util.function.Consumer;


public final class Thaumiumfortress_Armor extends ArmorItem implements GeoItem {
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	public Thaumiumfortress_Armor(ArmorMaterial armorMaterial, Type type, Properties properties) {
		super(armorMaterial, type, properties);
	}
	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		consumer.accept(new IClientItemExtensions() {
			private GeoArmorRenderer<?> renderer;

			@Override
			public  @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
				if (this.renderer == null)
					this.renderer = new Thaumiumfortress_Render();
				this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

				return this.renderer;
			}
		});
	}
	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
		controllers.add(new AnimationController<>(this, 20, state -> {
			// 空闲动画
			state.setAnimation(DefaultAnimations.IDLE);

			// 让我们从状态收集一些数据以在下面使用
			// 这是当前佩戴/持有物品的实体
			Entity entity = state.getData(DataTickets.ENTITY);

			// 我们只会让盔甲支架始终动画化，所以我们可以回到这里
			if (entity instanceof ArmorStand)
				return PlayState.CONTINUE;

			// 对于此示例，我们只希望在实体穿着所有盔甲时播放动画
			// 让我们收集实体当前穿着的盔甲碎片
			Set<Item> wornArmor = new ObjectOpenHashSet<>();

			for (ItemStack stack : entity.getArmorSlots()) {
				// 如果任何插槽为空，我们可以立即停止
				if (stack.isEmpty())
					return PlayState.STOP;

				wornArmor.add(stack.getItem());
			}

			// 检查每件作品是否与我们的套装相匹配
			boolean isFullSet = wornArmor.containsAll(ObjectArrayList.of(
					ModItems.THAUMIUMFORTRESS_LEGGINGS.get(),
					ModItems.THAUMIUMFORTRESS_CHESTPLATE.get(),
					ModItems.THAUMIUMFORTRESS_HELMET.get()));

			// 如果正在穿戴全套动画，则播放动画，否则停止
			return isFullSet ? PlayState.CONTINUE : PlayState.STOP;
		}));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}
}