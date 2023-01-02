package Map.Rooms;

public class A extends Room{


    public A(String code) {
        super(code);
    }

    @Override
    public void print() {
        System.out.println("Hallway");
    }
}
