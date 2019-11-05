package com.thedigitalodyssey.seeleysmod.tabs;

import com.thedigitalodyssey.seeleysmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SeeleysTab extends CreativeTabs {

	public SeeleysTab(String label) { 
		super(label);
		this.setBackgroundImageName("seeleys.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.INFERNAL_ORE);
	}
	
}
