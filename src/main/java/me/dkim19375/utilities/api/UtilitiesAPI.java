package me.dkim19375.utilities.api;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.HashMap;

public class UtilitiesAPI {
    public static Player getPlayerFromAll(String uuidOrPlayer)  {
        return lgetPlayer.getFromAll(uuidOrPlayer);
    }

    public static String getInputType(String uuidOrPlayer) {
        return lgetPlayer.getInputType(uuidOrPlayer);
    }

    public static Player getPlayerFromUsername(String username) {
        return lgetPlayer.getPlayerFromUsername(username);
    }

    public static Player getPlayerFromUUID(String uuid) {
        return lgetPlayer.getPlayerFromUUID(uuid);
    }

    public static boolean reloadConfig(String file, String pluginName, File configFile, FileConfiguration dataConfig) { return YMLApi.nreloadConfig(file, pluginName, configFile, dataConfig); }

    public static FileConfiguration getConfig(FileConfiguration dataConfig) { return YMLApi.ngetConfig(dataConfig); }

    public static boolean saveConfig(String file, String pluginName, File configFile, FileConfiguration dataConfig) { return YMLApi.nsaveConfig(file, pluginName, configFile, dataConfig); }

    public static boolean saveDefaultConfig(String file, String pluginName, File configFile, HashMap<String, String> defaultConfig) { return YMLApi.nsaveDefaultConfig(file, pluginName, configFile, defaultConfig); }
}
