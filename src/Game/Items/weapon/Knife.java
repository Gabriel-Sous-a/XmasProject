package Game.Items.weapon;

import Game.Items.items_text.Art;
import Game.Items.items_text.Description;

public class Knife extends Weapon{
    public Knife() {
        super("Knife", Art.knifeArt(), Description.knifeDescription(),3);
    }
}
