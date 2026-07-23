package net.dellsmp.goliath;

import net.dellsmp.goliath.core.CoreManager;import org.bukkit.plugin.java.JavaPlugin;

public final class Goliath extends JavaPlugin {

    public static Goliath instance;
    private CoreManager coreManager;

    @Override
    public void onEnable() {
        instance = this;

        coreManager = new CoreManager();
        coreManager.initCore();
    }

    @Override
    public void onDisable() {
        coreManager.disableCore();
    }

    public static Goliath getInstance() {
        return instance;
    }
}
