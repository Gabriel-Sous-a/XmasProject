package Map.Rooms;

public class CA extends Room{
    public CA(String code) {
        super(code);
    }

    @Override
    public void print() {
        System.out.println("Bedroom");
    }
}
