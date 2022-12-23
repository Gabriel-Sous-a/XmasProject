package Game.Items.heal;

import Game.Items.items_text.Art;
import Game.Items.items_text.Description;

public class Bandage extends Heal{
    public Bandage(String name,int amount) {
        super(name, Art.bandageArt(), Description.bandageDescription(), amount, 1);
    }
}
