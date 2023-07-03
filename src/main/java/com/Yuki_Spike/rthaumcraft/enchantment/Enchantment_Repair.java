package com.Yuki_Spike.rthaumcraft.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class Enchantment_Repair extends Enchantment {

    public Enchantment_Repair(Rarity Rarity, EnchantmentCategory CateGory, EquipmentSlot... ApplicableSlots) {
        super(Rarity, CateGory, ApplicableSlots);
    }
    
//    @Override
//    public void doPostAttack(LivingEntity Attacker, Entity Target, int Level) {
//        if(!Attacker.level.isClientSide()) {
//            ServerLevel world = ((ServerLevel) Attacker.level);
//            BlockPos position = Target.blockPosition();
//
//            if(Level == 1) {
//                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position, MobSpawnType.TRIGGERED, isCurse(), isAllowedOnBooks());
//            }
//
//            if(Level == 2) {
//                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position, MobSpawnType.TRIGGERED, isCurse(), isAllowedOnBooks());
//                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position, MobSpawnType.TRIGGERED, isCurse(), isAllowedOnBooks());
//            }
//        }
//        super.doPostAttack(Attacker, Target, Level);
//    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
}
