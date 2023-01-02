package Map.Rooms;

public class CB extends Room{
    public CB(String code) {
        super(code);
    }

    @Override
    public void print() {
        System.out.println("Bedroom");
    }
}
