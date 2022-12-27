package Game.Npc;

import Game.Items.Item;
import Game.Player.Player;

public abstract class Npc {
    protected String name;
    protected String asciiArt;

    public Npc(String name, String asciiArt) {
        this.name = name;
        this.asciiArt = asciiArt;
    }
    public abstract void event(Player player);

}
