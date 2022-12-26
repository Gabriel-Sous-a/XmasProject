package Game.Items.Key;

import Game.Items.items_text.Art;
import Game.Items.items_text.Description;
import Map.Node;

public class ShiningKey extends Key{
    public ShiningKey(String name, String code) {
        super(name, Art.shiningKeyArt(code), Description.shiningKeyDescription(code), code);
    }

    @Override
    public boolean open(Node locked) {
        if (!locked.isLock() && locked.getValue().getCode().equals(code)){
            locked.setLock(true);
            return true;
        }
        if (locked.isLock()){
            System.out.println("this door is already open");
            return false;
        }

        System.out.println("This is the wrong key");
        return false;
    }
}
