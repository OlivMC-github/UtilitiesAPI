package me.dkim19375.utilities.utils;

import me.dkim19375.utilities.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class ShowHelpDump {
    public ShowHelpDump() {
    }

    public void showHelp(CommandSender sender, String label) {
        sender.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "UtilitiesAPI Commands");
        sender.sendMessage(ChatColor.AQUA + "- /" + label + " help: Help");
        sender.sendMessage(ChatColor.AQUA + "- /" + label + " dump: Give information useful for support");
    }
    public void ShowDump(CommandSender sender, Main main) {
        sender.sendMessage(ChatColor.GOLD + "Server info:");
        sender.sendMessage(ChatColor.BLUE + "Type: " + ChatColor.WHITE + main.getServer().getVersion());
        sender.sendMessage(ChatColor.BLUE + "Version: " + ChatColor.WHITE + main.getServer().getBukkitVersion());
        sender.sendMessage(ChatColor.BLUE + "Plugins: " + ChatColor.WHITE + Arrays.toString(main.getServer().getPluginManager().getPlugins()));
        sender.sendMessage("");
        sender.sendMessage(ChatColor.GOLD + "Plugin info:");
        sender.sendMessage(ChatColor.BLUE + "Version: " + ChatColor.WHITE + main.getDescription().getVersion());
    }
}