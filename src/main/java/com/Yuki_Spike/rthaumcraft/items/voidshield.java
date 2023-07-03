package com.Yuki_Spike.rthaumcraft.items;

import com.Yuki_Spike.rthaumcraft.init.ModItems;
import net.minecraft.world.item.ShieldItem;
import java.util.UUID; 
import javax.annotation.Nullable; 
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;   
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
    
    public class voidshield extends ShieldItem{
        protected static final UUID OFF_HAND_MODIFIER = UUID.fromString("9271eeea-5f74-4e12-97b6-7cf3c60ef7a0");
        protected static final UUID MAIN_HAND_MODIFIER = UUID.fromString("7d766720-0695-46c6-b320-44529f3da63f");
    
        public voidshield() {
            super(new Properties().stacksTo(1));
    
        }
        
        public boolean isShield(ItemStack stack, @Nullable LivingEntity entity) {
            return true;
        }

        public UseAnim getUseAnimation(ItemStack p_40678_) {
            return UseAnim.BLOCK;
         }

        public int getMaxItemUseDuration(ItemStack stack) {
            return 72000;
        }
    
        @Override
        public InteractionResultHolder<ItemStack> use(Level p_77659_1_, Player playerIn, InteractionHand handIn) {
            ItemStack itemstack = playerIn.getItemInHand(handIn);
            playerIn.startUsingItem(handIn);
            return InteractionResultHolder.consume(itemstack);
        }
        
        //盾牌耐久值
        @Override
        public int getMaxDamage(ItemStack stack) {
            return 768;
        }
    
        //修理
        public boolean isValidRepairItem(ItemStack p_43091_, ItemStack p_43092_) {
            return p_43092_.is(ModItems.VOID_INGOT.get()) || super.isValidRepairItem(p_43091_, p_43092_);
         }
        
        //盾牌装备的属性
        public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack)
        {
            Multimap<Attribute, AttributeModifier> multimap = HashMultimap.<Attribute, AttributeModifier>create();
            //装备在副手，增加3点护甲值和20%抗击退
            if (equipmentSlot == EquipmentSlot.OFFHAND )
            {
                multimap.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(OFF_HAND_MODIFIER, "Weapon modifier", (double)0.2, AttributeModifier.Operation.fromValue(0)));
                multimap.put(Attributes.ARMOR, new AttributeModifier(MAIN_HAND_MODIFIER, "Weapon modifier", (double)3, AttributeModifier.Operation.fromValue(0)));
            }
            
            //装备在主手，增加3点护甲值
            if (equipmentSlot == EquipmentSlot.MAINHAND)
            {
                multimap.put(Attributes.ARMOR, new AttributeModifier(MAIN_HAND_MODIFIER, "Weapon modifier", (double)3, AttributeModifier.Operation.fromValue(0)));
            }
            return multimap;
        }
  
}