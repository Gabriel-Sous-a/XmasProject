package Game.Npc.Peaceful;

import Game.Npc.Npc;
import Game.Player.Player;

public abstract class Peaceful extends Npc {
    public Peaceful(String name, String asciiArt) {
        super(name, asciiArt);
    }

    @Override
    public abstract void event(Player player);
}
