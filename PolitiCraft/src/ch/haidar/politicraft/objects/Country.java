package ch.haidar.politicraft.objects;

import java.util.ArrayList;
import java.util.HashMap;

public class Country {

    private String name;

    private HashMap<String, Player> citizens;

    public Country(String name, ArrayList<Player> citizens) {
        this.name = name;
        this.citizens = new HashMap<>();

        for (Player citizen : citizens) {
            this.citizens.put(citizen.getName(), citizen);
        }
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
