package com.Yuki_Spike.rthaumcraft.entity;

import java.util.EnumSet;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Vex;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class Cultistleader_Entity extends Vex implements IAnimatable{

	private AnimationFactory factory = new AnimationFactory(this);

	public Cultistleader_Entity(EntityType<? extends Vex> type, Level worldIn) {
        super(type, worldIn);
        this.xpReward = 20;
    }

	public static AttributeSupplier.Builder prepareAttributes() {
		return Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, 35.0D).
				add(Attributes.ATTACK_DAMAGE, 8.5D).
		    	add(Attributes.MOVEMENT_SPEED, 0.28D).
		        add(Attributes.KNOCKBACK_RESISTANCE, 0.15D);
	}

	protected void registerGoals() {
		      super.registerGoals();
		      this.goalSelector.addGoal(0, new FloatGoal(this));
		      this.goalSelector.addGoal(4, new ChargeAttackGoal());
		      this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, Player.class, 3.0F, 1.0F));
		      this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Mob.class, 8.0F));
		      this.targetSelector.addGoal(1, (new HurtByTargetGoal(this, Raider.class)).setAlertOthers());
		      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Player.class, true));
		      //this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, EntityEthan.class, true));
		      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));

	}
	
    //我们生物的AI，决定使用哪种攻击方式
    class ChargeAttackGoal extends Goal {
        public ChargeAttackGoal() {
            this.setFlags(EnumSet.of(Flag.MOVE));
        }

        public boolean canUse() {
            if (Cultistleader_Entity.this.getTarget() != null && !Cultistleader_Entity.this.getMoveControl().hasWanted() && Cultistleader_Entity.this.random.nextInt(7) == 0) {
                return Cultistleader_Entity.this.distanceToSqr(Cultistleader_Entity.this.getTarget()) > 4.0D;
            } else {
                return false;
            }
        }

        public boolean canContinueToUse() {
            return Cultistleader_Entity.this.getMoveControl().hasWanted() && Cultistleader_Entity.this.isCharging() && Cultistleader_Entity.this.getTarget() != null && Cultistleader_Entity.this.getTarget().isAlive();
        }

        public void start() {
            LivingEntity livingentity = Cultistleader_Entity.this.getTarget();
            Vec3 vector3d = livingentity.getEyePosition(1.0F);
            Cultistleader_Entity.this.moveControl.setWantedPosition(vector3d.x, vector3d.y, vector3d.z, 1.0D);
            Cultistleader_Entity.this.setIsCharging(true);
            Cultistleader_Entity.this.playSound(SoundEvents.VEX_CHARGE, 1.0F, 1.0F);
        }

        public void stop() {
            Cultistleader_Entity.this.setIsCharging(false);
        }

        public void tick() {
            LivingEntity livingentity = Cultistleader_Entity.this.getTarget();
            if (Cultistleader_Entity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
                Cultistleader_Entity.this.doHurtTarget(livingentity);
                Cultistleader_Entity.this.setIsCharging(false);
            } else {
                double d0 = Cultistleader_Entity.this.distanceToSqr(livingentity);
                if (d0 < 9.0D) {
                    Vec3 vector3d = livingentity.getEyePosition(1.0F);
                    Cultistleader_Entity.this.moveControl.setWantedPosition(vector3d.x, vector3d.y, vector3d.z, 1.0D);
                }
            }

        }
    }
    
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {

        //攻击动画
    	if (this.isCharging()) {
            event.getController().setAnimation(new AnimationBuilder().playOnce("attack"));
            this.attackAnim=1;
            return PlayState.CONTINUE;
        }
        
        //平时动画
        event.getController().setAnimation(new AnimationBuilder().addAnimation("walk", ILoopType.EDefaultLoopTypes.LOOP));
        return PlayState.CONTINUE;
    }
    
	@Override
	public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
	}

	@Override
	public AnimationFactory getFactory() {
		return this.factory;
	}

}
