package me.dkim19375.utilities.api;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class lgetPlayer {

    protected static Player getFromAll(String uuidOrPlayer) {
        if (uuidOrPlayer.matches("^\\w{3,16}$")) {

            return Bukkit.getPlayer(uuidOrPlayer);
        }
        if (uuidOrPlayer.matches("[0-9a-fA-F]{8}(?:-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12}")) {
            UUID uuid = UUID.fromString(uuidOrPlayer);
            return Bukkit.getPlayer(uuid);
        }
        return null;
    }

    protected static String getInputType(String uuidOrPlayer) {
        if (uuidOrPlayer.matches("^\\w{3,16}$")) {
            Player player = Bukkit.getPlayer(uuidOrPlayer);
            if (player != null) {
                return "valid-username";
            }
        }
        if (uuidOrPlayer.matches("[0-9a-fA-F]{8}(?:-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12}")) {
            UUID uuid = UUID.fromString(uuidOrPlayer);
            Player player = Bukkit.getPlayer(uuid);
            if (player != null) {
                return "valid-uuid";
            }
        }
        if (uuidOrPlayer.matches("[0-9a-fA-F]{32}")) {
            return "invalid-uuid";
        }
        return "invalid";
    }

    protected static Player getPlayerFromUsername(String username) {
        if (username.matches("^\\w{3,16}$")) {
            return Bukkit.getPlayer(username);
        }
        return null;
    }
    protected static Player getPlayerFromUUID(String StringUUID) {
        UUID uuid = UUID.fromString(StringUUID);
        return Bukkit.getPlayer(uuid);
    }
}
