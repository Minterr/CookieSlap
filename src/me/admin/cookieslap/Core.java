package me.admin.cookieslap;

import me.admin.cookieslap.commands.CommandInformation;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin{
	
	private static Plugin plugin;
	
	public void onEnable(){
		getLogger().info("CookieSlap minigame has been enabled!");
		
		getCommand("information").setExecutor(new CommandInformation());
		
		plugin = this;
	}

	
	public static Plugin getPlugin() {
		return plugin;
		
		
	}
}

