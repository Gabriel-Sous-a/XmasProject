package Game.Items.weapon;

import Game.Items.Item;
import Game.Npc.Violent.Violent;

import java.io.Serializable;

public abstract class Weapon extends Item implements Serializable {

    protected int damage;

    public Weapon(String name, String asciiArt, String description, int damage) {
        super(name, asciiArt, description);
        this.damage = damage;
    }
        public void use(Violent violent){
            if (violent.getHp() - damage < 0){
                violent.setHp(0);
                return;
            }
            violent.takeDamage(damage);
        }

    public Weapon() {
    }
}
