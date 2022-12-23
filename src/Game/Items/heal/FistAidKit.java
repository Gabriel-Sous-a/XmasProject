package Game.Items.heal;

import Game.Items.items_text.Art;
import Game.Items.items_text.Description;

public class FistAidKit extends Heal{
    public FistAidKit(String name, String asciiArt) {
        super(name, Art.fistAidKitArt(), Description.fistAidKitDescription(), 3);
    }
}
