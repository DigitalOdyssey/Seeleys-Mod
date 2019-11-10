package com.thedigitalodyssey.seeleysmod.world.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.thedigitalodyssey.seeleysmod.init.ModBlocks;
import com.thedigitalodyssey.seeleysmod.world.biomes.BiomeTyline;
import com.thedigitalodyssey.seeleysmod.world.gen.generators.ModWorldGenStructure;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGenStructures {
	
	public static final ModWorldGenStructure TYLINE_HUT = new ModWorldGenStructure("tyline_hut");
	
	public static void generateStructures(Random random, int chunkX, int chunkZ, World world) {
		switch(world.provider.getDimension()) {
		case 1:
			break;
			
		case 0:
			generateStructure(TYLINE_HUT, world, random, chunkX, chunkZ, 120, ModBlocks.TYLINE, BiomeTyline.class);
		
		case -1:
			break;
		}
	}
	
	private static void generateStructure(WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ, int chance, Block topBlock, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = chunkX * 16 + rand.nextInt(15);
		int z = chunkZ * 16 + rand.nextInt(15);
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x, y, z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT) {
			if(classesList.contains(biome)) {
				if(rand.nextInt(chance) == 0) {
					generator.generate(world, rand, pos);
				}
			}
		}
	}
	
	private static int calculateGenerationHeight(World world, int x, int z, Block topBlock) {
		int y = world.getHeight();
		boolean foundGround = false;
		
		while(!foundGround && y-- >= 0) {
			Block block = world.getBlockState(new BlockPos(x, y, z)).getBlock();
			foundGround = block == topBlock;
		}
		
		return y;
	}
}
