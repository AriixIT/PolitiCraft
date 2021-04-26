package ch.haidar.politicraft.commands;

import ch.haidar.politicraft.PoliticalPower;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CreateCountry implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (args.length > 0) {
            PoliticalPower.addCountry(args[0], commandSender.getName());
        } else {
            commandSender.sendMessage("§6/Please specify the country name");
            return false;
        }

        PoliticalPower.getPlayers().get(commandSender.getName()).setPoliticalPower(500);
        Bukkit.getPlayer(commandSender.getName()).setDisplayName("[" + args[0] + "] " + commandSender.getName());
        Bukkit.getPlayer(commandSender.getName()).setPlayerListName("[" + args[0] + "] " + commandSender.getName());

        return true;
    }
}
