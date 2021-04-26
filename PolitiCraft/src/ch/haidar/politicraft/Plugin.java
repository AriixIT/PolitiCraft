package ch.haidar.politicraft;

import ch.haidar.politicraft.commands.PPList;
import ch.haidar.politicraft.commands.ShowPP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    public void onEnable(){
        Bukkit.getServer().getLogger().info(ChatColor.GREEN + "PolitiCraft plugin is enabled!");
        this.getCommand("showPP").setExecutor(new ShowPP());
        this.getCommand("PPList").setExecutor(new PPList());
        registerEvents();
        PoliticalPower.initialize();
    }

    public void onDisable(){
        Bukkit.getServer().getLogger().info(ChatColor.RED + "PolitiCraft plugin is disabled!");
    }

    public void registerEvents(){
        PluginManager pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new ListenerClass(), this);
    }

    public static void main(String[] args){}
}
