package Game.Items.Key;

import Game.Items.Item;
import Map.Node;
import Map.Rooms.Room;

public abstract class Key extends Item {
    String code;

    public Key(String name, String asciiArt, String description, String code, int amount) {
        super(name, asciiArt, description, amount);
        this.code = code;
    }
    public abstract void open(Node Locked);
}
