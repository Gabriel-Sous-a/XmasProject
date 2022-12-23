package Game.Items.weapon;

import Game.Items.items_text.Art;
import Game.Items.items_text.Description;

public class Knife extends Weapon{
    public Knife(String name, int amount) {
        super(name, Art.knifeArt(), Description.knifeDescription(), amount, 2);
    }
}
