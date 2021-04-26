package ch.haidar.politicraft;

import java.util.HashMap;

public class PoliticalPower {
    private static HashMap<String, Integer> players;

    public static HashMap<String, Integer> getPlayers() {
        return players;
    }

    public static void initialize() {
        players = new HashMap<>();
    }

    public static void addPlayer (String playerName) {
        if (players.containsKey(playerName)) return;
        players.put(playerName, 100);
    }
}
