package com.Yuki_Spike.rthaumcraft.items;

import java.util.function.Supplier;

import com.Yuki_Spike.rthaumcraft.init.ModItems;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModItemTier implements Tier{
	    
	    thaumiumitems(2, 250, 6.0F, 2.0F, 20,() -> {
	        return Ingredient.of(ModItems.THAUMIUM_INGOT.get());
	    }),
	    voiditems(4, 500, 9.0F, 4.0F, 15,() -> {
	        return Ingredient.of(ModItems.VOID_INGOT.get());
	    });

	   private final int level;
	   private final int uses;
	   private final float speed;
	   private final float damage;
	   private final int enchantmentValue;
	   private final LazyLoadedValue<Ingredient> repairIngredient;

	   private ModItemTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
	      this.level = level;
	      this.uses = uses;
	      this.speed = speed;
	      this.damage = damage;
	      this.enchantmentValue = enchantmentValue;
	      this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
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
