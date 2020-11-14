package me.dkim19375.utilities.commands;

import me.dkim19375.utilities.Main;
import me.dkim19375.utilities.utils.ShowHelpDump;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandClass implements CommandExecutor {
    final private Main main;

    public CommandClass(Main main) {
        this.main = main;
    }

    ShowHelpDump showHelpDump = new ShowHelpDump();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!label.equalsIgnoreCase("outilities") && !label.equalsIgnoreCase("olivmcutilities") && !label.equalsIgnoreCase("outils")) {
            return false;
        }
        if (!sender.hasPermission("outilities.use")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4You do not have access to that command."));
            return true;
        }
        if (args.length < 1) {
            showHelpDump.showHelp(sender, label);
            return true;
        }
        switch (args[0].toLowerCase()) {
            case "help":
                showHelpDump.showHelp(sender, label);
                return true;
            case "dump":
                showHelpDump.ShowDump(sender, main);
                return true;
            default:
                sender.sendMessage(ChatColor.RED + "Invalid argument");
                showHelpDump.showHelp(sender, label);
                return true;
        }
    }
}