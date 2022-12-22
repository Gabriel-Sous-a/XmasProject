package Game.Items;

import java.util.ArrayList;

public class Bag {
    ArrayList<Item> items = new ArrayList<>();

    public Bag() {
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    public void addItem(Item item){
        items.add(item);
    }

}
