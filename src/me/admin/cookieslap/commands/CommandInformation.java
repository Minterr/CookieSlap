package me.admin.cookieslap.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandInformation implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]){
		if(commandLabel.equalsIgnoreCase("information")){
			if(!(sender instanceof Player)){
				sender.sendMessage("** You do not have the rights to execute that command if you are not a player");
				return true;
			}
			Player p = (Player) sender;
			
			if(args.length == 0){
				p.sendMessage(ChatColor.DARK_RED + "** " + ChatColor.RED + "You have not added the required arguments use '/information help' to see the arguments!");
				return true;
			}
			
			if(args[0].equalsIgnoreCase("help")){
				p.sendMessage(ChatColor.GREEN + "" + ChatColor.STRIKETHROUGH + "-----------" + ChatColor.RESET + ChatColor.GREEN + "< " + ChatColor.WHITE + "Command Help" + ChatColor.GREEN + ">" + ChatColor.GREEN + ChatColor.STRIKETHROUGH + "-----------");
				p.sendMessage(ChatColor.WHITE + "Help" + ChatColor.GRAY + " - " + ChatColor.GREEN + "Shows this message");
				p.sendMessage(ChatColor.WHITE + "Contact" + ChatColor.GRAY + " - " + ChatColor.GREEN + "Use this subcommand to contact our team");
				p.sendMessage(ChatColor.WHITE + "Developer" + ChatColor.GRAY + " - " + ChatColor.GREEN + "Use this subcommand to see who developed the plugin");
				p.sendMessage(ChatColor.GREEN + "" + ChatColor.STRIKETHROUGH + "----------------------------------");
			}
		}
		return true;
	}

}
