package ch.haidar.politicraft;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    public void onEnable(){
        Bukkit.getServer().getLogger().info(ChatColor.GREEN + "PolitiCraft plugin is enabled!");
        registerEvents();
    }

    public void onDisable(){
        Bukkit.getServer().getLogger().info(ChatColor.RED + "PolitiCraft plugin is disabled!");
    }

    public void registerEvents(){
        PluginManager pm = Bukkit.getServer().getPluginManager();
    }

    public static void main(String[] args){}
}
