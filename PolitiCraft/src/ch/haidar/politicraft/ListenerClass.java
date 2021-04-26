package ch.haidar.politicraft;

import ch.haidar.politicraft.objects.Player;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class ListenerClass implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        PoliticalPower.addPlayer(event.getPlayer().getName());
    }

    @EventHandler
    public void onEntityDeathEvent(EntityDeathEvent event) {
        if (event.getEntity().getKiller() instanceof org.bukkit.entity.Player && event.getEntity() instanceof org.bukkit.entity.Player) {
            Player player = PoliticalPower.getPlayers().get(event.getEntity().getKiller().getName());
            player.setPoliticalPower(player.getPoliticalPower() + (PoliticalPower.getPlayers().get(event.getEntity().getName()).getPoliticalPower() - 100));
        }

    }

}