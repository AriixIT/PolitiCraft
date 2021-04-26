package ch.haidar.politicraft.exceptions;

import org.bukkit.Bukkit;

public class PlayerNotFoundException extends RuntimeException{

    public PlayerNotFoundException(String playerName) {
        Bukkit.getServer().getLogger().info("Unknown player '" + playerName + "'.");
    }

}
