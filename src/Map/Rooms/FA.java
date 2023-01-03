package Map.Rooms;

public class FA extends Room{
    public FA(String code) {
        super(code);
    }

    @Override
    public void print() {
        System.out.println("Pantry");
    }
}
