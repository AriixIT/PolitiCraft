package ch.haidar.politicraft;

import ch.haidar.politicraft.objects.Player;

import java.util.HashMap;

public class PoliticalPower {
    private static HashMap<String, Player> players;

    public static HashMap<String, Player> getPlayers() {
        return players;
    }

    public static void initialize() {
        players = new HashMap<>();
    }

    public static void addPlayer (String playerName) {
        if (players.containsKey(playerName)) return;
        players.put(playerName, new Player(playerName, 100, ""));
    }

}
