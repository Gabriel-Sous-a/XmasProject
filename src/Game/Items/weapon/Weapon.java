package Game.Items.weapon;

import Game.Items.Item;

public abstract class Weapon extends Item {
    protected int damage;

    public Weapon(String name, String asciiArt, String description,int damage) {
        super(name, asciiArt, description);
        this.damage = damage;
    }


}
