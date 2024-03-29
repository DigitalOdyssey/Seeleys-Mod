package com.thedigitalodyssey.seeleysmod.init;

import com.thedigitalodyssey.seeleysmod.world.biomes.BiomeInfernal;
import com.thedigitalodyssey.seeleysmod.world.biomes.BiomeTyline;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes {
	
	public static final Biome TYLINE = new BiomeTyline();
	public static final Biome INFERNAL_DIMENSION = new BiomeInfernal();
	
	public static void registerBiomes() {
		registerBiome(TYLINE, "Tyline", BiomeType.WARM, Type.WET, Type.MAGICAL, Type.LUSH);
		registerBiome(INFERNAL_DIMENSION, "Infernal", BiomeType.WARM, Type.SPOOKY, Type.MAGICAL, Type.DENSE);
	}
	
	private static Biome registerBiome(Biome biome, String name, BiomeType biomeType, Type... types) {
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		System.out.println("Biome Added");
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 50));
		BiomeManager.addSpawnBiome(biome);
		return biome;
	}
}
