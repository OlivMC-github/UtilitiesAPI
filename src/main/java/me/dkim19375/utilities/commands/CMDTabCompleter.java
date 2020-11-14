package me.dkim19375.utilities.commands;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CMDTabCompleter implements TabCompleter  {

    private final HashMultimap<String, String> completesListMap;

    public CMDTabCompleter() {
        completesListMap = HashMultimap.create();
        add("help", "dump");
    }

    private void add(String... args) {
        completesListMap.putAll("core", Arrays.asList(args));
    }

    private List<String> getPartial(String token, Iterable<String> collection) {
        return StringUtil.copyPartialMatches(token, collection, new ArrayList<>());
    }

    public
    List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        switch (args.length) {
            case 0: return Lists.newArrayList(completesListMap.get("core"));
            case 1: return getPartial(args[0], completesListMap.get("core"));
            default: return ImmutableList.of();
        }
    }
}