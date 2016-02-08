package me.admin.cookieslap;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin{
	
	private static Plugin plugin;
	
	public void onEnable(){
		getLogger().info("CookieSlap minigame has been enabled!");
		
		plugin = this;
	}

	
	public static Plugin getPlugin() {
		return plugin;
	}
}

