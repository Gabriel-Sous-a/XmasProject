package Map;

import Game.Items.Bag;
import Game.Player.Player;

public class TestMap {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Player player = new Player(3,bag);
        bag.setPlayer(player);
        System.out.println(bag.getKeys().size());
        RunMap.run(player);
    }
}
