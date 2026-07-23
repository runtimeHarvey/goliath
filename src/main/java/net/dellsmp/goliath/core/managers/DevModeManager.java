package net.dellsmp.goliath.core.managers;

import net.dellsmp.goliath.Goliath;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DevModeManager {

    private final Map<UUID, Long> devModes = new HashMap<>();
    private final Goliath plugin;

    public DevModeManager(Goliath plugin){
        this.plugin = plugin;
    }

    public void toggle(Player player, UUID uuid){
        if(devModes.containsKey(uuid)){
            devModes.remove(uuid);
            handleChatClear(player);
            player.getScheduler().run(plugin, task -> {
                player.sendActionBar("You disabled dev mode, all functions have been revoked.");
            }, null);
            return;
        }
        devModes.put(uuid, System.currentTimeMillis());
        handleChatClear(player);
        player.sendActionBar("You enabled dev mode, all functions have been restored.");
    }

    public void handleChatClear(Player player){
        player.getScheduler().runDelayed(plugin, task -> {
            for(int i = 0; i <= 150; i++){
                player.sendMessage(" ");
            }
        }, null, 1L);
    }

    public void clear(){
        devModes.clear();
    }
}
