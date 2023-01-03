package Map.Rooms;

public class CC extends Room{
    public CC(String code) {
        super(code);
    }

    @Override
    public void print() {
        System.out.println("Hallway");
    }
}
