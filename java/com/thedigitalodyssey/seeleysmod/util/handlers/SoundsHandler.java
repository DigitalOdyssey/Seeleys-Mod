package com.thedigitalodyssey.seeleysmod.util.handlers;

import com.thedigitalodyssey.seeleysmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
	
	public static SoundEvent ENTITY_TYLIN_AMBIENT;
	public static SoundEvent ENTITY_TYLIN_HURT;
	public static SoundEvent ENTITY_TYLIN_DEATH;
	
	public static void registerSounds() {
		ENTITY_TYLIN_AMBIENT = registerSound("entity.tylin.ambient");
		ENTITY_TYLIN_HURT = registerSound("entity.tylin.hurt");
		ENTITY_TYLIN_DEATH = registerSound("entity.tylin.death");
	}
	
	private static SoundEvent registerSound(String name) {
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
