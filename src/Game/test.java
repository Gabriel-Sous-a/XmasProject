package Game;

import Game.Items.Bag;
import Game.Items.Key.ShiningKey;
import Game.Items.Key.Uselesskey;
import Game.Items.heal.Bandage;
import Game.Items.items_text.Art;
import Game.Items.weapon.Knife;
import Game.Player.Player;
import Map.Node;
import Map.Rooms.ABBA;
import Map.Rooms.Room;

public class test {
    public static void main(String[] args) {

        Node node = new Node(new ABBA("ABCD"),false);
        ShiningKey key = new ShiningKey("ABCD Key","ABCD");
        ShiningKey key1 = new ShiningKey("ABC0 Key","ABC0");
        Uselesskey key2 = new Uselesskey("key");
        Player player = new Player(3,new Bag());
        player.getBag().addItem(key);
        player.getBag().addItem(key1);
        player.getBag().addItem(key2);
        player.getBag().openDoorBagAction(node);
        System.out.println(node.isLock());





    }
}
