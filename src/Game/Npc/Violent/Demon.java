package Game.Npc.Violent;

import Game.Items.weapon.Knife;

public class Demon extends Violent{
    public Demon() {
        super("Demon", "", 2, new Knife());
    }

    @Override
    public void initialDialogue() {
        System.out.println("Your piece of shit you entered in my realm, i'm the blade demon,you can't pass without kill me, choose your weapon and come!");
    }

    @Override
    public void wrongWeaponDialog() {
        System.out.println("Wrong weapon your dump, get out of here if you don't wanna die!");
    }

    @Override
    public void deathDialogue() {
        System.out.println("*angry screams* \n you killed the " + name);
    }

    @Override
    public void fistsDialogue() {
        System.out.println("You really will try to kill me with empty hands?");
    }
}
