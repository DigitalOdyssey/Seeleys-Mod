package com.thedigitalodyssey.seeleysmod.world.gen.generators;

import java.util.Random;

import com.thedigitalodyssey.seeleysmod.util.IStructure;
import com.thedigitalodyssey.seeleysmod.util.Reference;

import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class ModWorldGenStructure extends WorldGenerator implements IStructure {
	
	public static String structureName;
	
	public ModWorldGenStructure(String name) {
		this.structureName = name;
	}
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		this.generateStructure(world, pos);
		return false;
	}
	
	public static void generateStructure(World world, BlockPos pos) {
		MinecraftServer mcServer = world.getMinecraftServer();
		TemplateManager manager = worldServer.getStructureTemplateManager();
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, structureName);
		Template template = manager.get(mcServer, location);
		
		if(template != null) {
			IBlockState state = world.getBlockState(pos);
			world.notifyBlockUpdate(pos, state, state, 3);
			template.addBlocksToWorldChunk(world, pos, settings);
		}
	}
	
	
}
