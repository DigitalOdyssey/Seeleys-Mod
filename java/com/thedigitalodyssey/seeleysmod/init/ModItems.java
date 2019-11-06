package com.thedigitalodyssey.seeleysmod.init;

import java.util.ArrayList;
import java.util.List;

import com.thedigitalodyssey.seeleysmod.armor.ArmorBase;
import com.thedigitalodyssey.seeleysmod.items.ItemBase;
import com.thedigitalodyssey.seeleysmod.tools.ToolAxe;
import com.thedigitalodyssey.seeleysmod.tools.ToolHoe;
import com.thedigitalodyssey.seeleysmod.tools.ToolPickaxe;
import com.thedigitalodyssey.seeleysmod.tools.ToolShovel;
import com.thedigitalodyssey.seeleysmod.tools.ToolSword;
import com.thedigitalodyssey.seeleysmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_PURPLE_QUARTZ = EnumHelper.addToolMaterial("tool_purple_quartz", 3, 1800, 10.0F, 3.0F, 10);
	public static final ArmorMaterial ARMOR_PURPLE_QUARTZ = EnumHelper.addArmorMaterial("armor_purple_quartz", Reference.MOD_ID+":purple_quartz", 35, new int[] {4,7,9,3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
	
	//Items
	public static final Item PURPLE_QUARTZ = new ItemBase("purple_quartz");
	public static final Item TYLINE_ORE = new ItemBase("tyline_ore");
	public static final Item INFERNAL_ORE = new ItemBase("infernal_ore");
	
	//Tools
	public static final Item PURPLE_QUARTZ_AXE = new ToolAxe("purple_quartz_axe", TOOL_PURPLE_QUARTZ);
	public static final Item PURPLE_QUARTZ_HOE = new ToolHoe("purple_quartz_hoe", TOOL_PURPLE_QUARTZ);
	public static final Item PURPLE_QUARTZ_PICKAXE = new ToolPickaxe("purple_quartz_pickaxe", TOOL_PURPLE_QUARTZ);
	public static final Item PURPLE_QUARTZ_SHOVEL = new ToolShovel("purple_quartz_shovel", TOOL_PURPLE_QUARTZ);
	public static final Item PURPLE_QUARTZ_SWORD = new ToolSword("purple_quartz_sword", TOOL_PURPLE_QUARTZ);
	
	//Armor
	public static final Item PURPLE_QUARTZ_HELMET = new ArmorBase("purple_quartz_helmet", ARMOR_PURPLE_QUARTZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item PURPLE_QUARTZ_CHESTPLATE = new ArmorBase("purple_quartz_chestplate", ARMOR_PURPLE_QUARTZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item PURPLE_QUARTZ_LEGGINGS = new ArmorBase("purple_quartz_leggings", ARMOR_PURPLE_QUARTZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item PURPLE_QUARTZ_BOOTS = new ArmorBase("purple_quartz_boots", ARMOR_PURPLE_QUARTZ, 1, EntityEquipmentSlot.FEET);
	
}
