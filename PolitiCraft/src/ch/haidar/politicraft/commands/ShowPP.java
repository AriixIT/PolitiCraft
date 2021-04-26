package ch.haidar.politicraft.commands;

import ch.haidar.politicraft.PoliticalPower;
import ch.haidar.politicraft.exceptions.PlayerNotFoundException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ShowPP implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] args) {

        String playerName;
        if (args.length > 0) {
            playerName = args[0];
        } else {
            playerName = commandSender.getName();
        }

        if (!PoliticalPower.getPlayers().containsKey(playerName) || !PoliticalPower.getPlayers().get(playerName).getCountry().equals(PoliticalPower.getPlayers().get(commandSender.getName()).getCountry())) {
            commandSender.sendMessage("§cAn This player doesn't exist in this country");
            throw new PlayerNotFoundException(playerName);
        }

        if (args.length > 1) {
            commandSender.sendMessage("§6/Political Power doesn't require that many arguments.");
            return false;
        }

        commandSender.sendMessage(playerName +
                "'s Political Power: §a" +
                PoliticalPower.getPlayers().get(playerName).getPoliticalPower() +
                " pp");

        return true;
    }
}
