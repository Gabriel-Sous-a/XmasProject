package Game.Player;

import Game.Items.Bag;
import Map.Node;

import java.util.Stack;

public class Player {
    String name;
    int hp;
    Bag bag;
    Stack<Node> path = new Stack<>();

    public Player(int hp, Bag bag) {
        this.hp = hp;
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

    public void takeDamage(int amount){
        hp -= amount;
    }
    public void heal(int amount){
        if (hp + amount > 3){
            hp = 3;
            return;
        }
        hp += amount;
    }
}
