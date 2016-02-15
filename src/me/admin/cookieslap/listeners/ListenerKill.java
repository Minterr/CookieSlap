package me.admin.cookieslap.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ListenerKill implements Listener{
	
	public void onPlayerDeath(PlayerDeathEvent event){
		if(!(event.getEntity().getKiller().getName().equals(EntityType.PLAYER))){
			event.getEntity().kickPlayer(ChatColor.RED + "You have been killed by a non player entity, we have kicked you to prevent any memory leaks.");
		}
		
		if(event.getEntity().getKiller().equals(EntityType.PLAYER)){
			event.setDeathMessage(null);
			event.setDeathMessage(ChatColor.DARK_GREEN + "Player, " + event.getEntity().getKiller() + ChatColor.GREEN + " has killed" + ChatColor.DARK_GREEN + "player, " + event.getEntity().getName());
		}
	}

}
