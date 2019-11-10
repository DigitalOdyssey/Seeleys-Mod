package com.thedigitalodyssey.seeleysmod.entity;

import com.thedigitalodyssey.seeleysmod.init.ModItems;
import com.thedigitalodyssey.seeleysmod.util.handlers.LootTableHandler;
import com.thedigitalodyssey.seeleysmod.util.handlers.SoundsHandler;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityTylin extends EntityCow {

	public EntityTylin(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 1.4F);
	}
	
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, ModItems.TYLINE_ORE, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2F);
	}
	
	@Override
	public EntityCow createChild(EntityAgeable ageable) {
		return new EntityTylin(world);
	}
	
	@Override
	protected ResourceLocation getLootTable() {
		return LootTableHandler.TYLIN;
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsHandler.ENTITY_TYLIN_AMBIENT;
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsHandler.ENTITY_TYLIN_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsHandler.ENTITY_TYLIN_DEATH;
	}
}
