package Game.Items.heal;

import Game.Items.Item;
import Game.Player.Player;

import java.io.Serializable;

public abstract class Heal extends Item implements Serializable {
    protected int healPower;
    public Heal(String name, String asciiArt, String description, int healPower) {
        super(name, asciiArt, description);
        this.healPower = healPower;
    }

    public void heal(Player player) {
        player.heal(healPower);
    }
}
