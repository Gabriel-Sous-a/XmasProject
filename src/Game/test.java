package Game;

import Game.Items.Bag;
import Game.Items.Key.ShiningKey;
import Game.Items.Key.Uselesskey;
import Game.Items.heal.Bandage;
import Game.Items.heal.FistAidKit;
import Game.Items.items_text.Art;
import Game.Items.weapon.Knife;
import Game.Items.weapon.MetalBar;
import Game.Npc.Peaceful.Casper;
import Game.Npc.Peaceful.ElderGhost;
import Game.Npc.Violent.CrazyMan;
import Game.Npc.Violent.Demon;
import Game.Player.Player;
import Map.Node;
import Map.Rooms.AA;
import Map.Rooms.ABBA;
import Map.Rooms.C;
import Map.Rooms.Room;

public class test {
    public static void main(String[] args) {

        Node node = new Node(new C("ABCD"),false);

        ShiningKey key = new ShiningKey("ABCD");
        ShiningKey key1 = new ShiningKey("ABC0");
        Uselesskey key2 = new Uselesskey("key");
        Player player = new Player("Adan",5,5,new Bag());
        player.getBag().addItem(key);
        player.getBag().addItem(key1);
        player.getBag().addItem(key2);
        player.getBag().addItem(new MetalBar());
        player.getBag().addItem(new Knife());
        player.getBag().addItem(new FistAidKit());
        player.getBag().addItem(new Bandage());
        Demon demon = new Demon();
        CrazyMan crazyMan = new CrazyMan();
        ElderGhost elderGhost = new ElderGhost();
        Casper casper = new Casper();
        player.openPlayerBag();
        demon.event(player);





    }
}
