package ch.haidar.politicraft.objects;

public class Player implements Comparable {

    private String name;

    private int politicalPower;

    private String country;

    public Player(String name, int politicalPower, String country) {
        this.name = name;
        this.politicalPower = politicalPower;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoliticalPower() {
        return politicalPower;
    }

    public void setPoliticalPower(int politicalPower) {
        this.politicalPower = politicalPower;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int compareTo(Object player) {
        if (player instanceof Player) {
            return this.politicalPower - ((Player) player).politicalPower;
        }

        return 0;
    }
}
