package Game.Items.weapon;

import Game.Items.items_text.Art;
import Game.Items.items_text.Description;

public class MetalBar extends Weapon{
    public MetalBar(String name, int amount) {
        super(name, Art.metalBarArt(), Description.metalBarDescription(), 1);
    }
}
