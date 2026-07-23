package net.dellsmp.goliath.core.command;

import net.dellsmp.goliath.Goliath;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.List;

public class GMSPCommand implements CommandExecutor, TabCompleter {

    private final Goliath plugin;

    public GMSPCommand(Goliath plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(!(sender instanceof Player player)) return true;
        if(!player.hasPermission("swedo.gmsp")) return true;
        player.getScheduler().runDelayed(plugin, task -> {
            if(player.getGameMode().equals(GameMode.SPECTATOR)){
                player.setGameMode(GameMode.SURVIVAL);
                return;
            } else {
                player.setGameMode(GameMode.SPECTATOR);
            }
        }, null, 5L);
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args){
        return List.of();
    }
}
