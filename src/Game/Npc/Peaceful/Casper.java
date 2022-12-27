package Game.Npc.Peaceful;

import Game.Player.Player;

public class Casper extends Peaceful{
    public Casper() {
        super("", "");
    }

    @Override
    public void event(Player player) {
        System.out.println("Hello buddy, don't worry i will not hurt you. " +
                "I'm Casper and i'm here to give you a tip, inside this house you will find many items, get all that you find");
    }

}
