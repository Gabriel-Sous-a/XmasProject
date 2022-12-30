package Game.Items.heal;

import Game.Items.items_text.Art;
import Game.Items.items_text.Description;
import Game.Player.Player;

public class FistAidKit extends Heal{
    public FistAidKit() {
        super("Fist Aid Kit", Art.fistAidKitArt(), Description.fistAidKitDescription(), 3);
    }

    @Override
    public void heal(Player player) {
        player.setHp(player.getMaxHp());
    }
}
