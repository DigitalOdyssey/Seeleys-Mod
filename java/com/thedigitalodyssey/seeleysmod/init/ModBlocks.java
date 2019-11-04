package com.thedigitalodyssey.seeleysmod.init;

import java.util.ArrayList;
import java.util.List;

import com.thedigitalodyssey.seeleysmod.blocks.BlockBase;
import com.thedigitalodyssey.seeleysmod.blocks.PurpleQuartzBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block PURPLE_QUARTZ_BLOCK = new PurpleQuartzBlock("purple_quartz_block", Material.IRON);
	public static final Block MOLTEN_PURPLE_QUARTZ = new PurpleQuartzBlock("molten_purple_quartz", Material.IRON);
	
}