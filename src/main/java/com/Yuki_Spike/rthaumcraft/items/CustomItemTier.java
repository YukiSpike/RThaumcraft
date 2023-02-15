package com.Yuki_Spike.rthaumcraft.items;

import java.util.function.Supplier;

import net.minecraft.util.LazyLoadedValue;
import com.Yuki_Spike.rthaumcraft.list.ItemList;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum CustomItemTier implements Tier{
	    
	    thaumiumitems(2, 250, 6.0F, 2.0F, 20,() -> {
	        return Ingredient.of(ItemList.THAUMIUM_INGOT.get());
	    }),
	    voiditems(4, 500, 9.0F, 4.0F, 15,() -> {
	        return Ingredient.of(ItemList.VOID_INGOT.get());
	    }),
		elementalitems(4, 1000, 9.0F, 4.0F, 20,() -> {
	        return Ingredient.of(ItemList.THAUMIUM_INGOT.get());
	    });

	   private final int level;
	   private final int uses;
	   private final float speed;
	   private final float damage;
	   private final int enchantmentValue;
	   private final LazyLoadedValue<Ingredient> repairIngredient;

	   private CustomItemTier(int p_43332_, int p_43333_, float p_43334_, float p_43335_, int p_43336_, Supplier<Ingredient> p_43337_) {
	      this.level = p_43332_;
	      this.uses = p_43333_;
	      this.speed = p_43334_;
	      this.damage = p_43335_;
	      this.enchantmentValue = p_43336_;
	      this.repairIngredient = new LazyLoadedValue<>(p_43337_);
	   }

	   public int getUses() {
	      return this.uses;
	   }

	   public float getSpeed() {
	      return this.speed;
	   }

	   public float getAttackDamageBonus() {
	      return this.damage;
	   }

	   public int getLevel() {
	      return this.level;
	   }

	   public int getEnchantmentValue() {
	      return this.enchantmentValue;
	   }

	   public Ingredient getRepairIngredient() {
	      return this.repairIngredient.get();
	   }
}
