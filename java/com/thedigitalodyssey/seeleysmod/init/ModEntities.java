package com.thedigitalodyssey.seeleysmod.init;

import com.thedigitalodyssey.seeleysmod.Main;
import com.thedigitalodyssey.seeleysmod.entity.EntityTylin;
import com.thedigitalodyssey.seeleysmod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static void registerEntities() {
		registerEntity("tylin", EntityTylin.class, Reference.ENTITY_TYLIN, 50, 14400512, 0);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID+":"+name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
