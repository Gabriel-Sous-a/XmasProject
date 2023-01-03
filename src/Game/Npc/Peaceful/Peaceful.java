package Game.Npc.Peaceful;

import Game.Items.weapon.Knife;
import Game.Items.weapon.Weapon;
import Game.Npc.Npc;
import Game.Player.Player;

import java.io.Serializable;

public abstract class Peaceful extends Npc implements Serializable {
    protected Knife knife;
    public Peaceful(String name, String asciiArt) {
        super(name, asciiArt);
    }

    @Override
    public abstract void event(Player player);
}
