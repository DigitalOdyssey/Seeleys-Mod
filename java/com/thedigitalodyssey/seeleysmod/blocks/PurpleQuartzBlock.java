package com.thedigitalodyssey.seeleysmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PurpleQuartzBlock extends BlockBase {

	public PurpleQuartzBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
