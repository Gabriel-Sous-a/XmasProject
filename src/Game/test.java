package Game;

import Game.Items.Bag;
import Game.Items.heal.Bandage;
import Game.Items.weapon.Knife;
import Game.Player.Player;

public class test {
    public static void main(String[] args) {

        Player player = new Player(3, new Bag());
        player.getBag().addItem(new Bandage("bandage","","",1));
        player.getBag().addItem(new Bandage("bandage","","",1));
        player.getBag().addItem(new Bandage("bandage","","",1));

        player.getBag().addItem(new Knife("Knife","","knife",1));
        player.getBag().openBag();
    }
}
