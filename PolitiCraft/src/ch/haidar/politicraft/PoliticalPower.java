package ch.haidar.politicraft;

import ch.haidar.politicraft.objects.Country;
import ch.haidar.politicraft.objects.Player;

import java.util.HashMap;

public class PoliticalPower {
    private static HashMap<String, Player> players;
    private static HashMap<String, Country> countries;

    public static HashMap<String, Player> getPlayers() {
        return players;
    }
    public static HashMap<String, Country> getCountries() {
        return countries;
    }

    public static void initialize() {
        players = new HashMap<>();
        countries = new HashMap<>();
    }

    public static void addPlayer (String playerName) {
        if (players.containsKey(playerName)) return;
        players.put(playerName, new Player(playerName, 100, ""));
    }

    public static void addCountry (String countryName, String playerName) {
        if (countries.containsKey(countryName)) return;
        countries.put(countryName, new Country(countryName, playerName));
    }

}
