package com.thedigitalodyssey.seeleysmod.world.biomes;

import com.thedigitalodyssey.seeleysmod.entity.EntityTylin;
import com.thedigitalodyssey.seeleysmod.init.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeTyline extends Biome {
	
	public BiomeTyline() {
		super(new BiomeProperties("Tyline").setBaseHeight(0.0F).setHeightVariation(0.8F).setTemperature(0.95F).setRainDisabled().setWaterColor(54783));
		
		topBlock = ModBlocks.TYLINE.getDefaultState();
		fillerBlock = ModBlocks.HARD_TYLINE.getDefaultState();
		
		this.decorator.waterlilyPerChunk = 0;
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityTylin.class, 20, 10, 15));
	}
}
