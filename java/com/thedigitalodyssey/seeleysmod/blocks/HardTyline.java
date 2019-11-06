package com.thedigitalodyssey.seeleysmod.blocks;

import java.util.Random;

import com.thedigitalodyssey.seeleysmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class HardTyline extends BlockBase {

	public HardTyline(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(2.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(0.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.TYLINE_ORE;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 6;
		int min = 2;
		return rand.nextInt(max) + min;
	}
}
