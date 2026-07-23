package net.dellsmp.goliath;

import org.bukkit.plugin.java.JavaPlugin;

public final class Goliath extends JavaPlugin {

    public static Goliath instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Goliath getInstance() {
        return instance;
    }
}
