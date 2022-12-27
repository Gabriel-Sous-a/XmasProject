package Map;

import Game.Items.Bag;
import Game.Items.Key.Key;
import Game.Items.Key.ShiningKey;
import Game.Player.Player;

public class TestMap {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Player player = new Player(3,bag);
        bag.setPlayer(player);
        bag.addItem(new ShiningKey("C000"));
        bag.addItem(new ShiningKey("F000"));
        System.out.println(bag.getKeys().size());
        RunMap.run(player);
    }
}
