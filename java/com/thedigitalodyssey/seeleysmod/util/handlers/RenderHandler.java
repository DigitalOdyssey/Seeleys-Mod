package com.thedigitalodyssey.seeleysmod.util.handlers;

import com.thedigitalodyssey.seeleysmod.entity.EntityTylin;
import com.thedigitalodyssey.seeleysmod.entity.render.RenderTylin;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityTylin.class, new IRenderFactory<EntityTylin>() {
			@Override
			public Render<? super EntityTylin> createRenderFor(RenderManager manager) {
				return new RenderTylin(manager);
			}
		});
	}
}
