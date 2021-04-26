package ch.haidar.politicraft.objects;

import java.util.HashMap;

public class Country {

    private String name;

    private String creator;

    private HashMap<String, Player> citizens;

    public Country(String name, String creator, HashMap<String, Player> citizens) {
        this.name = name;
        this.creator = creator;
        this.citizens = citizens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public HashMap<String, Player> getCitizens() {
        return citizens;
    }

    public void setCitizens(HashMap<String, Player> citizens) {
        this.citizens = citizens;
    }
}
