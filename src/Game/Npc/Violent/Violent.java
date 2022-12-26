package Game.Npc.Violent;

import Game.Items.Bag;
import Game.Items.weapon.Weapon;
import Game.Npc.Npc;
import Game.Player.Player;

public abstract class Violent extends Npc {
    int damage;
    boolean alive;
    Weapon weapon;
    String dialogue;
    public Violent(String name, String asciiArt, int damage,Weapon weapon) {
        super(name, asciiArt);
        this.damage = damage;
        this.alive = true;
        this.weapon = weapon;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public void event(Player player) {
        System.out.println();
        Weapon temp = player.getBag().violentNpcEvent();
        if (temp.getClass() == weapon.getClass()){
            temp.use(this);
            return;
        }
        hit(player);
    }
    public void hit(Player player){
        player.takeDamage(damage);
    }
}
