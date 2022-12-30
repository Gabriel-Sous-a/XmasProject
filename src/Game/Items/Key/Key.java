package Game.Items.Key;

import Game.Items.Item;
import Map.Node;
import Map.Rooms.Room;

import java.io.Serializable;

public abstract class Key extends Item implements Serializable {
    String code;

    public Key(String name, String asciiArt, String description, String code) {
        super(name, asciiArt, description);
        this.code = code;
    }
    public abstract boolean open(Node Locked);
}
