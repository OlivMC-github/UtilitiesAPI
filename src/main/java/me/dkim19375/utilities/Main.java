package me.dkim19375.utilities;

import me.dkim19375.utilities.commands.CMDTabCompleter;
import me.dkim19375.utilities.commands.CommandClass;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        for (String s : Arrays.asList("olivmcutilities", "oUtilities", "oUtils")) {
            this.getCommand(s).setExecutor(new CommandClass(this));
            this.getCommand(s).setTabCompleter(new CMDTabCompleter());
        }
        printToConsole("Enabled OlivMC Utilities! Enjoy the plugin!");
    }
    @Override
    public void onDisable() {
        printToConsole("Disabling OlivMC Utilities");
        printToConsole("Disabled OlivMC Utilities! Have a great day!");
    }

    public void printToConsole(String msg) {
        this.getServer().getConsoleSender().sendMessage("[" + this.getDescription().getName() + "] " + msg);
    }
}
