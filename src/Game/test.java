package Game;

import Game.Items.Bag;
import Game.Pause.PauseMenu;
import Game.Player.Player;

public class test {
    public static void main(String[] args) {

        /*Node node = new Node(new C("ABCD"),false);

        ShiningKey key = new ShiningKey("ABCD");
        ShiningKey key1 = new ShiningKey("ABC0");
        Uselesskey key2 = new Uselesskey("key");
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
        demon.event(player);*/
        Player player = new Player("Adan",5,5,new Bag());

        PauseMenu.menu(player);





    }
}
