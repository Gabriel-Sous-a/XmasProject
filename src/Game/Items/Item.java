package Game.Items;

import Game.Player.Player;

public abstract class Item {
    protected String name;
    protected String asciiArt;
    protected String description;
    protected int amount;

    public Item(String name, String asciiArt, String description, int amount) {
        this.name = name;
        this.asciiArt = asciiArt;
        this.description = description;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsciiArt() {
        return asciiArt;
    }

    public void setAsciiArt(String asciiArt) {
        this.asciiArt = asciiArt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
