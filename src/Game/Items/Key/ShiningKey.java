package Game.Items.Key;

import Game.Items.items_text.Art;
import Game.Items.items_text.Description;
import Map.Node;
import Map.Rooms.Room;

public class ShiningKey extends Key{
    public ShiningKey(String name, String code ,int amount) {
        super(name, Art.shiningKeyArt(code), Description.shiningKeyDescription(code), code , amount);
    }

    @Override
    public void open(Node locked) {

    }
}
