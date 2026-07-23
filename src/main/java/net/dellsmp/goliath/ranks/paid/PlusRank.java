package net.dellsmp.goliath.ranks.paid;

import net.dellsmp.goliath.Goliath;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class PlusRank implements CommandExecutor, TabCompleter {

    private final Goliath plugin = Goliath.getInstance();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(!sender.hasPermission("swedo.group.manager")) return true;

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args){
        if(args.length != 1){
            return List.of();
        }

        List<String> playerNames = new ArrayList<>();
        String input = args[0].toLowerCase();

        for(OfflinePlayer p : Bukkit.getOfflinePlayers()){
            
        }

        return playerNames;
    }
}
