package Game.Npc.Violent;

import Game.Items.weapon.Weapon;
import Game.Npc.Npc;
import Game.Player.Player;
import Inputs.Input;

public abstract class Violent extends Npc {
    protected int hp;
    protected int damage;
    protected boolean alive;
    protected Weapon weapon;

    public Violent(String name, int hp, String asciiArt, int damage, Weapon weapon) {
        super(name, asciiArt);
        this.damage = damage;
        this.alive = true;
        this.weapon = weapon;
        this.hp = hp;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void event(Player player) {
        initialDialogue();
        do {
            System.out.println(asciiArt);
            hpBar();
            System.out.println("1 - Attack      2- Healing items\n" +
                    "3 - run");
            player.hpBar();
            System.out.print("->");
            int op = Input.inputMenuOptions(1, 3);
            switch (op) {
                case 1:
                    player.attack(this);
                    break;
                case 2:
                    player.getBag().openHeal();
                    continue;
                case 3:
                    System.out.println("You can't run");
                    break;
            }
            if (hp == 0){
                deathDialogue();
                alive = false;
                return;
            }

            attack(player);
            System.out.println(player.getHp());
        } while (player.getHp() > 0);
        System.out.println("you die!");
    }

    public void attack(Player player) {
        player.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public abstract void initialDialogue();

    public abstract void deathDialogue();

    public abstract void fistsDialogue();

    public void hpBar(){
        System.out.print(name + " ");
        for (int i = 0; i < hp; i++){
            System.out.print("❤");
        }
        System.out.println();
    }
}
