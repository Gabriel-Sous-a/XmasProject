package Game.Npc.Peaceful;

import Game.Npc.Npc_art.Npc_art;
import Game.Player.Player;

public class Casper extends Peaceful{
    public Casper() {
        super("Casper", Npc_art.casperArt());
    }

    @Override
    public void event(Player player) {
        System.out.println(this.asciiArt);
        System.out.println("Hello buddy, don't worry i will not hurt you. " +
                "I'm Casper and i'm here to give you a tip, inside this house you will find many items, get all that you find");
    }

}
