package Map.Rooms;

public class Final extends Room{
    public Final(String code) {
        super(code);
    }

    @Override
    public void print() {
        System.out.println("The outdoors");
        System.out.println("Or so it seems...");
    }
}
