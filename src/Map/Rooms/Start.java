package Map.Rooms;

public class Start extends Room{
    public Start(String code) {
        super(code);
    }

    @Override
    public void print() {
        System.out.println("MainHall");
    }
}
