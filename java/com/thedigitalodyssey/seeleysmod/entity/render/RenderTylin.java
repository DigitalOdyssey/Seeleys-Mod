package com.thedigitalodyssey.seeleysmod.entity.render;

import com.thedigitalodyssey.seeleysmod.entity.EntityTylin;
import com.thedigitalodyssey.seeleysmod.entity.model.ModelTylin;
import com.thedigitalodyssey.seeleysmod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTylin extends RenderLiving<EntityTylin> {
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID+":textures/entity/tylin.png");
	
	public RenderTylin(RenderManager manager) {
		super(manager, new ModelTylin(), 0.5F);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityTylin entity) {
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityTylin entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
