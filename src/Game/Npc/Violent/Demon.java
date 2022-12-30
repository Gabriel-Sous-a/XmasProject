package Game.Npc.Violent;

import Game.Items.weapon.Knife;
import Game.Npc.Npc_art.Npc_art;

public class Demon extends Violent{
    public Demon() {
        super("Demon",5 ,Npc_art.demoArt(), 2, new Knife());
    }

    @Override
    public void initialDialogue() {
        System.out.println("Your piece of shit you entered in my realm, i'm the blade demon,you can't pass without kill me, choose your weapon and come!");
    }


    @Override
    public void deathDialogue() {
        System.out.println("*angry screams* \n you killed the " + name);
    }
}

