package Game.Npc.Peaceful;

import Game.Items.weapon.Knife;
import Game.Player.Player;
import VisualStats.Colors;

public class ElderGhost extends Peaceful {

    public ElderGhost() {
        super("", "");
    }

    @Override
    public void event(Player player) {
        System.out.println("Congratulations you came here, i was watching your effort to get out from here...");
        System.out.println("But you look a little unprotected...");
        System.out.print(Colors.YELLOW_BOLD);
        System.out.println("It's dangerous to go alone take this");
        Knife knife = new Knife();
        System.out.println(knife.getAsciiArt());
        System.out.print(Colors.RESET);
        player.getBag().addItem(knife);
        System.out.println("you got a knife");
    }
}
