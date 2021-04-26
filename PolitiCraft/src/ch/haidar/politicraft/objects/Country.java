package ch.haidar.politicraft.objects;

import ch.haidar.politicraft.PoliticalPower;

import java.util.HashMap;

public class Country {

    private String name;

    private HashMap<String, Player> citizens;

    public Country(String name, String creator) {
        this.name = name;
        this.citizens = new HashMap<>();
        this.citizens.put(creator, PoliticalPower.getPlayers().get(creator));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Player> getCitizens() {
        return citizens;
    }

    public void setCitizens(HashMap<String, Player> citizens) {
        this.citizens = citizens;
    }
}
