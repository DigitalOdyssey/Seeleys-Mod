package com.thedigitalodyssey.seeleysmod.init;

import java.util.ArrayList;
import java.util.List;

import com.thedigitalodyssey.seeleysmod.blocks.BlockBase;
import com.thedigitalodyssey.seeleysmod.blocks.HardTyline;
import com.thedigitalodyssey.seeleysmod.blocks.PurpleQuartzBlock;
import com.thedigitalodyssey.seeleysmod.blocks.PurpleQuartzOre;
import com.thedigitalodyssey.seeleysmod.blocks.Tyline;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block PURPLE_QUARTZ_BLOCK = new PurpleQuartzBlock("purple_quartz_block", Material.IRON);
	public static final Block MOLTEN_PURPLE_QUARTZ = new PurpleQuartzBlock("molten_purple_quartz", Material.IRON);
	public static final Block TYLINE = new Tyline("tyline", Material.SAND);
	public static final Block HARD_TYLINE = new HardTyline("hard_tyline", Material.SAND);
	
	public static final Block PURPLE_QUARTZ_ORE = new PurpleQuartzOre("purple_quartz_ore", Material.ROCK);
}