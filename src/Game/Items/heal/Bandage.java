package Game.Items.heal;

import Game.Items.items_text.Art;
import Game.Items.items_text.Description;

public class Bandage extends Heal{
    public Bandage() {
        super("Bandage", Art.bandageArt(), Description.bandageDescription(), 1);
    }
}
