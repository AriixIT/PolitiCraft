package ch.haidar.politicraft;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ListenerClass implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        PoliticalPower.addPlayer(event.getPlayer().getName());
    }

}
