package com.thedigitalodyssey.seeleysmod.init;

import com.thedigitalodyssey.seeleysmod.world.dimension.infernal.InfernalDimension;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class ModDimensions {
	
	public static final DimensionType INFERNAL = DimensionType.register("Infernal", "_infernal", 2, InfernalDimension.class, false);
	
	public static void registerDimensions() {
		DimensionManager.registerDimension(2, INFERNAL);
	}
}
