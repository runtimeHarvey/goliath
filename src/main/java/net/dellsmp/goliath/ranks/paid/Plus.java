package net.dellsmp.goliath.ranks.paid;

import org.bukkit.entity.Player;

import java.util.UUID;

public record Plus(UUID uuid, Long expires, Long awarded) {
    public long remaining(){
        return expires - System.currentTimeMillis();
    }

    public long duration(){
        return expires - awarded;
    }
}