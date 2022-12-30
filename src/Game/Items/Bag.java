package Game.Items;

import Game.Items.Key.*;
import Game.Items.heal.*;
import Game.Items.weapon.*;
import Game.Npc.Violent.Violent;
import Game.Player.Player;
import Map.Node;
import Inputs.Input;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Bag {

    ArrayList<Heal> healing = new ArrayList<>();
    ArrayList<Weapon> weapons = new ArrayList<>();
    ArrayList<Key> keys = new ArrayList<>();
    public static ArrayList<Key> keys1 = new ArrayList<>();
    public static ArrayList<Item> bagList = new ArrayList<>(keys1);

    Player player;


    public Bag() {
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Heal> getHealing() {
        return healing;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public ArrayList<Key> getKeys() {
        return keys;
    }

    public void addItem(Item item) {
        if (item.getClass() == Bandage.class || item.getClass() == FistAidKit.class) {
            healing.add((Heal) item);
            return;
        }
        if (item.getClass() == Knife.class || item.getClass() == MetalBar.class) {
            weapons.add((Weapon) item);
            return;
        }
        if (item.getClass() == ShiningKey.class || item.getClass() == Uselesskey.class) {
            keys.add((Key) item);
        }
    }

    public void openBag() {
        do {
            System.out.println("------------------------");
            System.out.println("1 - Heal items");
            System.out.println("2 - Weapons");
            System.out.println("3 - Keys");
            System.out.println("0 - Exit");
            System.out.println("------------------------");
            int op = Input.inputMenuOptions(0, 3);

            switch (op) {
                case 1:
                    openHeal();
                    break;
                case 2:
                    openWeapon();
                    break;
                case 3:
                    openKey();
                    break;
                case 0:
                    return;

            }
        } while (true);

    }

    public void openHeal() {
        do {
            healing.stream().forEach(e -> System.out.println((healing.indexOf(e) + 1) + " - " + e.name));
            System.out.println("0 - back");
            int op = Input.inputMenuOptions(0, healing.size());
            if (op == 0) {
                return;
            }

            System.out.println("What you wanna do with this item?");
            System.out.println("1 - use");
            System.out.println("2 - read description");
            System.out.println("3 - nothing");

            int itemOp = Input.inputMenuOptions(1, 3);
            switch (itemOp) {
                case 1:
                    healing.get(op - 1).heal(player);
                    break;
                case 2:
                    System.out.println(healing.get(op - 1).getDescription());
                case 3:
                    break;
            }
        } while (true);
    }

    public void openWeapon() {
        do {
            weapons.stream().forEach(e -> System.out.println((weapons.indexOf(e) + 1) + " - " + e.name));
            System.out.println("0 - back");
            int op = Input.inputMenuOptions(0, weapons.size());
            if (op == 0) {
                break;
            }

            System.out.println("What you wanna do with this item?");
            System.out.println("1 - read description");
            System.out.println("2 - nothing");

            int itemOp = Input.inputMenuOptions(1, 2);
            switch (itemOp) {
                case 1:
                    System.out.println(weapons.get(op - 1).getDescription());
                    break;
                case 2:
                    break;
            }
        } while (true);


    }

    public void openKey() {
        do {
            keys.stream().forEach(e -> System.out.println((keys.indexOf(e) + 1) + " - " + e.name));
            System.out.println("0 - back");
            int op = Input.inputMenuOptions(0, keys.size());
            if (op == 0) {
                break;
            }

            System.out.println("What you wanna do with this item?");
            System.out.println("1 - read description");
            System.out.println("2 - nothing");

            int itemOp = Input.inputMenuOptions(1, 2);
            switch (itemOp) {
                case 1:
                    System.out.println(keys.get(op - 1).getDescription());
                    break;
                case 2:
                    break;
            }
        } while (true);
    }

    public void openDoorBagAction(Node locked) {
        do {
            keys.stream().forEach(e -> System.out.println((keys.indexOf(e) + 1) + " - " + e.name));
            System.out.println("0 - back");
            int op = Input.inputMenuOptions(0, keys.size());
            if (op == 0) {
                break;
            }
            boolean lock = keys.get(op - 1).open(locked);
            if (lock){
                break;
            }
        } while (true);


    }
    public Weapon violentNpcEvent(){

        System.out.println("0 - fists");
        weapons.stream().forEach(e -> System.out.println((weapons.indexOf(e) + 1) + " - " + e.name));
        int op = Input.inputMenuOptions(0, weapons.size());
        if (op == 0) {
            return null;
        }

        return weapons.get(op - 1);
    }
}