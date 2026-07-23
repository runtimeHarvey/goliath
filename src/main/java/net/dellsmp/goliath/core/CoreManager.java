package net.dellsmp.goliath.core;

import net.dellsmp.goliath.Goliath;
import net.dellsmp.goliath.core.command.GMSPCommand;
import net.dellsmp.goliath.core.managers.DevModeManager;

public class CoreManager {

    private final Goliath plugin = Goliath.getInstance();
    private DevModeManager manager;

    public void initCore(){
        manager = new DevModeManager(plugin);

        plugin.getCommand("gmsp").setExecutor(new GMSPCommand(plugin));
    }

    public void disableCore(){

    }
}
