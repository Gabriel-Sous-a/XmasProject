package Game.Items.Key;

import Game.Items.items_text.Art;
import Game.Items.items_text.Description;
import Map.Node;

public class Uselesskey extends Key{

    public Uselesskey(String name) {
        super(name, Art.uselessKeyArt(), Description.uselessKeyDescription(), null);
    }

    @Override
    public boolean open(Node locked) {
        System.out.println("this is a useless key");
        return false;
    }
}
