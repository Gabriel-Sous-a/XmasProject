package Save;
import Game.Player.Player;
import java.io.*;

public class Save implements Serializable {


    public static void save(Player player){
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(player.getName()+".txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(player);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void load(String player){
        Player player1 = null;
        try {
            FileInputStream fileIn = new FileInputStream(player+".txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            player1 = (Player) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Deserialized Player...");
        System.out.println("Name: " + player1.getName());
        System.out.println("Path: " + player1.getPath());
        System.out.println("Bag: " + player1.getBag());
        System.out.println("HP: " + player1.getHp());
        System.out.println("HP: " + player1.getCurrentLocation());
    }


    }





