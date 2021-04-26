package ch.haidar.politicraft.commands;

import ch.haidar.politicraft.PoliticalPower;
import ch.haidar.politicraft.objects.Player;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PPList implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] args) {

        HashMap<String, Player> countryPlayers = new HashMap<>();

        for (Object player : PoliticalPower.getPlayers().values()) {
            if(((Player) player).getCountry().equals(PoliticalPower.getPlayers().get(commandSender.getName()).getCountry())) {
                countryPlayers.put(((Player) player).getName(), (Player) player);
            }
        }

        TreeMap<String, Player> sortedPlayers = new TreeMap<>(countryPlayers);

        String message = "Top Players: \n";

        int index = 1;
        for(Map.Entry<String, Player> entry : sortedPlayers.entrySet()) {
            if (index >= 5) {
                break;
            }
            message += "" + index + ". " + entry.getValue().getName() + " - " + entry.getValue().getPoliticalPower() + " pp \n";
            index++;
        }

        commandSender.sendMessage(message);

        return true;
    }
}
