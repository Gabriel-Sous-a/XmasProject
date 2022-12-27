package Game.Npc.Violent;

import Game.Items.weapon.MetalBar;

public class CrazyMan extends Violent{
    public CrazyMan() {
        super("Crazy man", "",1,new MetalBar());
    }

    @Override
    public void initialDialogue() {
        System.out.println("Hello little friend, are you ready to die? you cant kill me, cause you will be a murderer");
    }

    @Override
    public void wrongWeaponDialog() {
        System.out.println("You cant fight me with this");
    }

    @Override
    public void deathDialogue() {
        System.out.println("The crazy mann is dead");
    }

    @Override
    public void fistsDialogue() {
        System.out.println("oh this is so cute, you think that you can fight me with empty hands");
    }
}
