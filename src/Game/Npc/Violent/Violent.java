package Game.Npc.Violent;

import Game.Items.weapon.Weapon;
import Game.Npc.Npc;
import Game.Player.Player;

public abstract class Violent extends Npc {
    protected int damage;
    protected boolean alive;
    protected Weapon weapon;
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
        initialDialogue();
        do {
            Weapon temp = player.getBag().violentNpcEvent();
            if (temp == null){
                fistsDialogue();
                hit(player);
                continue;
            }
            if (temp.getClass() == weapon.getClass()){
                temp.use(this);
                deathDialogue();
                return;
            }
            hit(player);
            wrongWeaponDialog();
        }while (player.getHp() > 0);

    }
    public void hit(Player player){
        player.takeDamage(damage);
    }
    public abstract void initialDialogue();
    public abstract void wrongWeaponDialog();
    public abstract void deathDialogue();
    public abstract void fistsDialogue();

}
