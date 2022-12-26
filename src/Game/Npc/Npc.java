package Game.Npc;

import Game.Items.Item;
import Game.Player.Player;

public abstract class Npc {
    String name;
    String AsciiArt;

    public Npc(String name, String asciiArt) {
        this.name = name;
        AsciiArt = asciiArt;
    }
    public abstract void event(Player player);

}
