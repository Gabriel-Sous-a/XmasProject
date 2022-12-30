package Map;

import Game.Items.Item;
import Game.Npc.Npc;
import Map.Rooms.Room;

public class Node {
    private Node next;
    private Node right;
    private Node left;
    private Node back;
    private Node backLeft;
    private Node backRight;
    private Room Value;
    private Item item;
    private boolean lock;
    private Npc npc;

    private boolean win;

    public Node() {
    }

    public Node(Room value) {
        Value = value;
        this.lock = true;
    }

    public Node(Room value, Item item) {
        Value = value;
        this.item = item;
        this.lock = true;
    }

    public Node(Room value, Item item, boolean lock) {
        Value = value;
        this.item = item;
        this.lock = lock;
    }

    public Node(Room value, boolean lock) {
        Value = value;
        this.lock = lock;
    }

    public Node(Room value, Item item, boolean lock, Npc npc) {
        Value = value;
        this.item = item;
        this.lock = lock;
        this.npc = npc;
    }

    public Node getNext() {
        return next;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getBack() {
        return back;
    }

    public Node getBackLeft() {
        return backLeft;
    }

    public Node getBackRight() {
        return backRight;
    }

    public Room getValue() {
        return Value;
    }

    public Item getItem() {
        return item;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setBack(Node back) {
        this.back = back;
    }

    public void setBackLeft(Node backLeft) {
        this.backLeft = backLeft;
    }

    public void setBackRight(Node backRight) {
        this.backRight = backRight;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}
