package ch.haidar.politicraft.commands;

import ch.haidar.politicraft.PoliticalPower;
import ch.haidar.politicraft.objects.Country;
import ch.haidar.politicraft.objects.Player;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;

public class CreateCountry implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        String countryName;
        Player creator = PoliticalPower.getPlayers().get(commandSender.getName());
        ArrayList<Player> citizens = new ArrayList<>();
        citizens.add(creator);

        if (args.length > 0) {
            countryName = args[0];
        } else {
            commandSender.sendMessage("§6/Please specify the country name");
            return false;
        }

        for (int i = 0; i < args.length; i++) {
            if (i >= 1) {
                if (PoliticalPower.getPlayers().containsKey(args[i])) {
                    citizens.add(PoliticalPower.getPlayers().get(args[i]));
                } else {
                    commandSender.sendMessage(args[i] + " is not a valid player");
                    return false;
                }
            }
        }

        int ppOfCitizens = 0;

        for (Player citizen : citizens) {
            ppOfCitizens += citizen.getPoliticalPower();
        }

        if (ppOfCitizens >= 300) {
            PoliticalPower.getCountries().put(countryName, new Country(countryName, citizens));
        }
        Bukkit.getPlayer(commandSender.getName()).setDisplayName("[" + args[0] + "] " + commandSender.getName());
        Bukkit.getPlayer(commandSender.getName()).setPlayerListName("[" + args[0] + "] " + commandSender.getName());

        return true;
    }
}
