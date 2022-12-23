package Game.Items.Key;

import Map.Node;
import Map.Rooms.Room;

public class Uselesskey extends Key{

    public Uselesskey(String name, String asciiArt, String description, int amount) {
        super(name, asciiArt, description, null ,amount);
    }

    @Override
    public void open(Node locked) {
        System.out.println("this is a useless key");
    }
}
