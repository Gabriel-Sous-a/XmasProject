package Map.Rooms;

public abstract class Room {

    private String code;

    public Room(String code) {
        this.code = code;
    }

    public void print() {
        System.out.println("-");
    }
}
