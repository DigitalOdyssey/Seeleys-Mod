package com.thedigitalodyssey.seeleysmod.world;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.thedigitalodyssey.seeleysmod.init.ModBlocks;
import com.thedigitalodyssey.seeleysmod.world.biomes.BiomeTyline;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {
	
	private  WorldGenTrees tyline_tree = new WorldGenTrees(false, 5, Blocks.LOG2.getDefaultState(), Blocks.LEAVES.getDefaultState(), false);
	
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.getDimension() == 0) {
			generateOverworld(rand, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(ModBlocks.PURPLE_QUARTZ_ORE.getDefaultState(), world, rand, chunkX*16, chunkZ*16, 5, 20, rand.nextInt(4) + 2, 8);
		generateTree(tyline_tree, world, rand, chunkX, chunkZ, 16, BiomeTyline.class);
	}
	
	private void generateOre(IBlockState ore, World world, Random rand, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY-minY;
		
		for(int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + rand.nextInt(16), minY + rand.nextInt(deltaY), z + rand.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, rand, pos);
		}
	}
	
	private void generateTree(WorldGenerator generator, World world, Random rand, int chunkX, int chunkZ, int amountPerChunk, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		for(int i = 0; i < amountPerChunk; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int z = chunkZ * 16 + rand.nextInt(16);
			int y = world.getChunkFromChunkCoords(x >> 4, z >> 4).getHeight(new BlockPos(x & 15, 0, z & 15));
			Class<?> biome = world.provider.getBiomeForCoords(new BlockPos(chunkX * 16, 70, chunkZ * 16)).getClass();
			if(classesList.contains(biome)) {
				generator.generate(world, rand, new BlockPos(x, y, z));
			}
		}
	}
}
