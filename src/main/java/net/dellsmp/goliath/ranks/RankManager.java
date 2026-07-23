package net.dellsmp.goliath.ranks;

import net.dellsmp.goliath.Goliath;
import net.dellsmp.goliath.ranks.paid.PlusRank;

public class RankManager {

    private final Goliath plugin = Goliath.getInstance();

    public void init(){
        plugin.getCommand("giveplus").setExecutor(new PlusRank());
    }
}
