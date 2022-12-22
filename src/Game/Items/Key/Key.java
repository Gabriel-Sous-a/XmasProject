package Game.Items.Key;

import Game.Items.Item;
import Map.Rooms.Room;

public abstract class Key extends Item {

    public Key(String name, String asciiArt, String description, int amount) {
        super(name, asciiArt, description, amount);
    }
    abstract void open(Room room);
}
