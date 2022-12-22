package Game.Items.heal;

import Game.Items.Item;
import Game.Player.Player;

public abstract class Heal extends Item {
    protected int healPower;
    public Heal(String name, String asciiArt, String description, int amount, int healPower) {
        super(name, asciiArt, description, amount);
        this.healPower = healPower;
    }

    void heal(Player player) {
        player.heal(healPower);
        amount -= 1;
    }
}
