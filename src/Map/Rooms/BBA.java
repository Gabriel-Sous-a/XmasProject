package Map.Rooms;

public class BBA  extends Room{
    public BBA(String code) {
        super(code);
    }

    @Override
    public void print() {
        System.out.println("Stairwell");
    }
}
