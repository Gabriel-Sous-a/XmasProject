package Game.Items;

import Game.Items.Key.*;
import Game.Items.heal.*;
import Game.Items.weapon.*;
import Game.Player.Player;
import inputs.Input;

import java.util.ArrayList;

public class Bag {
    ArrayList<Heal> heal = new ArrayList<>();
    ArrayList<Weapon> weapon = new ArrayList<>();
    ArrayList<Key> key = new ArrayList<>();
    Player player;


    public Bag() {
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Heal> getHeal() {
        return heal;
    }

    public ArrayList<Weapon> getWeapon() {
        return weapon;
    }

    public ArrayList<Key> getKey() {
        return key;
    }

    public void addItem(Item item){
        if (item.getClass() == Bandage.class || item.getClass() == FistAidKit.class){
            heal.add((Heal) item);
            return;
        }
        if (item.getClass() == Knife.class || item.getClass() == MetalBar.class){
            weapon.add((Weapon) item);
            return;
        }
        if (item.getClass() == ShiningKey.class || item.getClass() == Uselesskey.class){
            key.add((Key) item);
        }

    }
    public void openBag(){
        do {
            System.out.println("------------------------");
            System.out.println("1 - Heal items");
            System.out.println("2 - Weapons");
            System.out.println("3 - Keys");
            System.out.println("0 - Exit");
            System.out.println("------------------------");
            int op = Input.inputMenuOptions(0,3);

            switch (op){
                case 1:
                    openHeal();
                    break;
                case 2:
                    openWeapon();
                    break;
                case 3:
                    break;
                case 0:
                    return;

            }
        }while (true);

    }
    public void openHeal(){
        do {
            heal.stream().forEach(e -> System.out.println((heal.indexOf(e) + 1)+ " - " + e.name));
            System.out.println("0 - back");
            int op = Input.inputMenuOptions(0,heal.size());
            if (op == 0){
                return;
            }

            System.out.println("What you wanna do with this item?");
            System.out.println("1 - use");
            System.out.println("2 - read description");
            System.out.println("3 - nothing");

            int itemOp = Input.inputMenuOptions(1,3);
            switch (itemOp){
                case 1:
                    heal.get(op - 1).heal(player);
                    break;
                case 2:
                    System.out.println(heal.get(op - 1).getDescription());
                case 3:
                    openKey();
                    break;
            }
        }while (true);
    }
    public void openWeapon(){
        do {
            weapon.stream().forEach(e -> System.out.println((weapon.indexOf(e) + 1)+ " - " + e.name));
            System.out.println("0 - back");
            int op = Input.inputMenuOptions(0,weapon.size());
            if (op == 0){
                break;
            }

            System.out.println("What you wanna do with this item?");
            System.out.println("1 - read description");
            System.out.println("2 - nothing");

            int itemOp = Input.inputMenuOptions(1,2);
            switch (itemOp){
                case 1:
                    System.out.println(weapon.get(op - 1).getDescription());
                    break;
                case 2:
                    break;
            }
        }while (true);


    }
    public void openKey(){
        do {
            key.stream().forEach(e -> System.out.println((key.indexOf(e) + 1)+ " - " + e.name));
            System.out.println("0 - back");
            int op = Input.inputMenuOptions(0,key.size());
            if (op == 0){
                break;
            }

            System.out.println("What you wanna do with this item?");
            System.out.println("1 - read description");
            System.out.println("2 - nothing");

            int itemOp = Input.inputMenuOptions(1,2);
            switch (itemOp){
                case 1:
                    System.out.println(weapon.get(op - 1).getDescription());
                    break;
                case 2:
                    break;
            }
        }while (true);

    }


}
