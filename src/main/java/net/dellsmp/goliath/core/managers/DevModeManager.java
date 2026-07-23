package net.dellsmp.goliath.core.managers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DevModeManager {

    private final Map<UUID, Long> devModes = new HashMap<>();

    public void toggle(UUID uuid){
        if(devModes.containsKey(uuid)){
            devModes.remove(uuid);
            return;
        }
        devModes.put(uuid, System.currentTimeMillis());
    }

    public void clear(){
        devModes.clear();
    }
}
