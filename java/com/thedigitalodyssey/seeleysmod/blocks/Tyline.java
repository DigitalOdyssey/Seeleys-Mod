package com.thedigitalodyssey.seeleysmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Tyline extends BlockBase {

	public Tyline(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.SAND);
		setHardness(0.5F);
		setResistance(1.0F);
		setHarvestLevel("shovel", 0);
		setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
	
}
