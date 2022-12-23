package Game.Items.heal;

import Game.Items.items_text.Art;
import Game.Items.items_text.Description;

public class FistAidKit extends Heal{
    public FistAidKit(String name, String asciiArt, int amount) {
        super(name, Art.fistAidKitArt(), Description.fistAidKitDescription(), amount, 3);
    }


}
