package com.thedigitalodyssey.seeleysmod.world.gen;

import java.util.Random;

import com.thedigitalodyssey.seeleysmod.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class ModWorldGenOres {
	
	public static void generateOres(World world, Random rand, int chunkX, int chunkZ) {
		generateOre(ModBlocks.PURPLE_QUARTZ_ORE.getDefaultState(), world, rand, chunkX*16, chunkZ*16, 5, 20, rand.nextInt(4) + 2, 8);
	}
	
	private static void generateOre(IBlockState ore, World world, Random rand, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY-minY;
		
		for(int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + rand.nextInt(16), minY + rand.nextInt(deltaY), z + rand.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, rand, pos);
		}
	}
}
