package Map.Rooms;

public class ABB extends Room{
    public ABB(String code) {
        super(code);
    }

    @Override
    public void print() {
        System.out.println("Hallway");
    }
}
