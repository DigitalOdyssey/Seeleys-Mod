package com.thedigitalodyssey.seeleysmod.world.dimension.infernal;

import com.thedigitalodyssey.seeleysmod.init.ModBiomes;
import com.thedigitalodyssey.seeleysmod.init.ModDimensions;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class InfernalDimension  extends WorldProvider {
	
	public InfernalDimension() {
		this.biomeProvider = new BiomeProviderSingle(ModBiomes.INFERNAL_DIMENSION);
	}
	
	@Override
	public DimensionType getDimensionType() {
		return ModDimensions.INFERNAL;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorInfernal(world, true, world.getSeed());
	}
	
	@Override
	public boolean canRespawnHere() {
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() {
		return false;
	}
}
