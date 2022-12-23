package Game;

import Game.Items.Bag;
import Game.Items.heal.Bandage;
import Game.Items.items_text.Art;
import Game.Items.weapon.Knife;
import Game.Player.Player;
import Map.Node;

public class test {
    public static void main(String[] args) {

        Player player = new Player(3, new Bag());
        System.out.println(Art.shiningKeyArt("A000"));
        System.out.println(Art.uselessKeyArt());

        System.out.println(Art.metalBarArt());
        System.out.println(Art.knifeArt());

        System.out.println(Art.bandageArt());
        System.out.println(Art.fistAidKitArt());

    }
}
