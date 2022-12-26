package Game.Items.weapon;

import Game.Items.Item;
import Game.Npc.Violent.Violent;

public abstract class Weapon extends Item {


    public Weapon(String name, String asciiArt, String description) {
        super(name, asciiArt, description);
    }
        public void use(Violent violent){
            violent.setAlive(false);
        }

}
