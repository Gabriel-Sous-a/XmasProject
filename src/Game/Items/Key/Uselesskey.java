package Game.Items.Key;

import Map.Rooms.Room;

public class Uselesskey extends Key{

    public Uselesskey(String name, String asciiArt, String description, int amount) {
        super(name, asciiArt, description, amount);
    }

    @Override
    void open(Room room) {
        System.out.println("this is a useless key");
    }
}
