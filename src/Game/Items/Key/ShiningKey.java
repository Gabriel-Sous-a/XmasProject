package Game.Items.Key;

import Map.Rooms.Room;

public class ShiningKey extends Key{
    public ShiningKey(String name, String asciiArt, String description, int amount) {
        super(name, asciiArt, description, amount);
    }

    @Override
    void open(Room room) {

    }
}
