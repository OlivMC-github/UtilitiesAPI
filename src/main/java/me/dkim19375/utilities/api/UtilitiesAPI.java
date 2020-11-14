package me.dkim19375.utilities.api;

import org.bukkit.entity.Player;

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
}
