package com.thedigitalodyssey.seeleysmod;

import com.thedigitalodyssey.seeleysmod.init.ModRecipes;
import com.thedigitalodyssey.seeleysmod.proxy.CommonProxy;
import com.thedigitalodyssey.seeleysmod.tabs.SeeleysTab;
import com.thedigitalodyssey.seeleysmod.util.Reference;
import com.thedigitalodyssey.seeleysmod.util.handlers.RegistryHandler;
import com.thedigitalodyssey.seeleysmod.world.gen.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version =  Reference.VERSION)
public class Main {
	
	public static final CreativeTabs seeleys_tab = new SeeleysTab("Seeley's Tab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		RegistryHandler.preInitRegistries(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
		RegistryHandler.initRegistries(event);
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void ServerInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}
}
