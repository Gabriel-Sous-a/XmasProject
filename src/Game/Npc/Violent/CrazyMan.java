package Game.Npc.Violent;

import Game.Items.weapon.MetalBar;
import Game.Npc.Npc_art.Npc_art;

import java.io.Serializable;

public class CrazyMan extends Violent {
    public CrazyMan() {
        super("Crazy man",5 , Npc_art.crazyManArt(),1,new MetalBar());
    }

    @Override
    public void initialDialogue() {
        System.out.println("Hello little friend, are you ready to die? Let's play");
    }


    @Override
    public void deathDialogue() {
        System.out.println("The crazy mann is knocked out");
    }

}
