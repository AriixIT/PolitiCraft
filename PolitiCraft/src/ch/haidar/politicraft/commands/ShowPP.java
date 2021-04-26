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

        if (args.length > 1) {
            commandSender.sendMessage("§6/Political Power doesn't require that many arguments.");
            return false;
        }

        commandSender.sendMessage(playerName +
                "'s Political Power: §a" +
                PoliticalPower.getPlayers().get(playerName).getPoliticalPower() +
                " Ⴔ");

        return true;
    }
}
