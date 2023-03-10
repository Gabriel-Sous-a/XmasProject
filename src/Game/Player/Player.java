package Game.Player;

import Game.Items.Bag;
import Game.Items.weapon.Hands;
import Game.Items.weapon.Weapon;
import Game.Npc.Violent.Violent;
import Inputs.Input;
import Map.Node;
import Map.Rooms.Room;

import java.io.Serializable;
import java.util.Stack;

public class Player implements Serializable {
    String name;
    int hp;
    int maxHp;
    Bag bag;
    Node currentLocation;
    Stack<Node> path = new Stack<>();
    Weapon equipped;

    int level = 0;

    public Player(String name, int maxHp ,int hp, Bag bag) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = hp;
        this.bag = bag;
        this.bag.setPlayer(this);
        this.equipped = new Hands();
    }

    public Player() {

    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }
    public void setCurrentLocation(Node currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    public Stack<Node> getPath() {
        return path;
    }

    public void setPath(Stack<Node> path) {
        this.path = path;
    }

    public Node getCurrentLocation() {
        return currentLocation;
    }

    public Weapon getEquipped() {
        return equipped;
    }

    public void setEquipped(Weapon equipped) {
        this.equipped = equipped;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void takeDamage(int amount){
        if (hp - amount < 0){
            hp = 0;
            return;
        }
        hp -= amount;
    }
    public void heal(int amount){
        if (hp + amount > maxHp){
            hp = maxHp;
            return;
        }
        hp += amount;
    }
    public void move(Node nextLocation){
        if (currentLocation != null){
            path.add(currentLocation);
        }
        currentLocation = nextLocation;
    }
    public void goBack(){
        if (path.empty()){
            return;
        }
        currentLocation = path.pop();
    }
    public void openPlayerBag(){
        bag.openBag();
    }
    public void attack(Violent violent){
        if (equipped == null){
            equipped = new Hands();
        }
        equipped.use(violent);
    }
    public void hpBar(){
        System.out.print(name + " ");
        for (int i = 0; i < hp; i++){
            System.out.print("???");
        }
        System.out.println();
    }
    public void battleMenu(Violent violent){
        do {
            System.out.println("1 - Attack      2- Healing items\n" +
                    "3 - run");
            hpBar();
            int op = Input.inputMenuOptions(1, 3);
            switch (op) {
                case 1:
                    attack(violent);
                    return;
                case 2:
                    int temp = bag.getHealing().size();
                    getBag().openHeal();
                    if (temp != bag.getHealing().size()){
                        return;
                    }
                    continue;
                case 3:
                    System.out.println("You can't run");
                    return;
            }
        }while (true);

    }

}
