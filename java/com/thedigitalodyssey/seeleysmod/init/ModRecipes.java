package com.thedigitalodyssey.seeleysmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.PURPLE_QUARTZ_BLOCK, new ItemStack(ModBlocks.MOLTEN_PURPLE_QUARTZ, 1), 1.5F);
	}
	
}
