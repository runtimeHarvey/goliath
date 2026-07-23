package net.dellsmp.goliath.core;

import net.dellsmp.goliath.Goliath;
import net.dellsmp.goliath.core.command.GMSPCommand;

public class CoreManager {

    private final Goliath plugin = Goliath.getInstance();

    public void initCore(){

        plugin.getCommand("gmsp").setExecutor(new GMSPCommand(plugin));
    }

    public void disableCore(){

    }
}
