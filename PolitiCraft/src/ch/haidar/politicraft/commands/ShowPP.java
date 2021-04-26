package ch.haidar.politicraft.commands;

import ch.haidar.politicraft.PoliticalPower;
import ch.haidar.politicraft.exceptions.PlayerNotFoundException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ShowPP implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] args) {
        if (!PoliticalPower.getPlayers().containsKey(commandSender.getName())) {
            commandSender.sendMessage("§cAn error has occurred with the plugin. Please notify your server's admin.");
            throw new PlayerNotFoundException(commandSender.getName());
        }

        commandSender.sendMessage(commandSender.getName() +
                "'s Political Power: §a" +
                PoliticalPower.getPlayers().get(commandSender.getName()) +
                " pp");

        // Display warning if player provided arguments
        if (args.length > 0) {
            commandSender.sendMessage("§6/Political Power doesn't require any arguments.");
            return false;
        }
        return true;
    }
}
