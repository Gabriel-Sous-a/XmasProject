package Map.Rooms;

import java.io.Serializable;

public abstract class Room implements Serializable {

    private String code;

    public Room(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void print() {
        System.out.println("-");
    }
}
