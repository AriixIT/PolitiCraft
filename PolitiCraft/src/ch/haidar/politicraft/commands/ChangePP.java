package ch.haidar.politicraft.commands;

import ch.haidar.politicraft.PoliticalPower;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ChangePP implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (commandSender.isOp()) {
            String playerName;

            if (args.length > 0) {

                try {
                    int pp = Integer.parseInt(args[0]);

                    if (args.length > 1) {
                        playerName = args[1];
                    } else {
                        playerName = commandSender.getName();
                    }

                    PoliticalPower.getPlayers().get(playerName).setPoliticalPower(PoliticalPower.getPlayers().get(playerName).getPoliticalPower() + pp);
                } catch (NumberFormatException e) {
                    commandSender.sendMessage("Bruh that pp ain't a number idiot");
                    return false;
                }

            }
        } else {
            commandSender.sendMessage("Bitch, you don't have enough rights to call this command");
            return false;
        }
        return false;
    }
}
