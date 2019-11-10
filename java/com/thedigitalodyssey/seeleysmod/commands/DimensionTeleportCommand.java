package com.thedigitalodyssey.seeleysmod.commands;

import java.util.List;

import com.google.common.collect.Lists;
import com.thedigitalodyssey.seeleysmod.commands.util.Teleport;
import com.thedigitalodyssey.seeleysmod.util.Reference;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class DimensionTeleportCommand extends CommandBase {
	
	private final List<String> aliases = Lists.newArrayList(Reference.MOD_ID, "tp", "tpdim", "tpdimension", "teleportdimension", "teleport", "dimension", "dim");
	
	@Override
	public String getName() {
		return "tpdimension";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "tpdimension <id>";
	}
	
	@Override
	public List<String> getAliases() {
		return aliases;
	}
	
	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		return true;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if(args.length < 1) return;
		
		String s = args[0];
		int dimensionID = 0;
		
		try {
			dimensionID = Integer.parseInt(s);
		} catch(NumberFormatException e) {
			sender.sendMessage(new TextComponentString(TextFormatting.RED + "Dimension ID Invalid"));
			return;
		}
		
		if(sender instanceof EntityPlayer) {
			if(dimensionID == 1) {
				Teleport.teleportToDimension((EntityPlayer)sender, dimensionID, 0, 55, 0);
			} else {
				Teleport.teleportToDimension((EntityPlayer)sender, dimensionID, sender.getPosition().getX(), sender.getPosition().getY() + 5, sender.getPosition().getZ());
			}
		}
	}
}
