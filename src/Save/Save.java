package Save;
import Game.Player.Player;
import Inputs.Input;
import VisualStats.Colors;
import VisualStats.TextArtImages;

import java.io.*;
import java.util.Scanner;

public class Save implements Serializable {


    public static void save(Player player){
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(player.getName()+".txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(player);
            out.close();
            fileOut.close();
            System.out.printf(Colors.GREEN+""+Colors.BLACK_BACKGROUND+"Player " +player.getName()+ " is saved."+Colors.RESET+Colors.BLACK_BACKGROUND);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static Player load(String player){
        Player player1 = null;
        try {
            FileInputStream fileIn = new FileInputStream(player+".txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            player1 = (Player) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Colors.GREEN+""+Colors.BLACK_BACKGROUND+"Loading Player "+player1.getName()+" info..."+Colors.RESET+Colors.BLACK_BACKGROUND);
        return player1;
    }

    public static boolean saveExitMenu(Player player) {
        int option;
        Scanner sc = new Scanner(System.in);


            TextArtImages.saveExitMenu();
            option = Input.inputMenuOptions(0,2);
            switch (option) {
                case 0:
                    return true;
                case 1:
                    Save.save(player);
                    break;
                case 2:
                    return false;
                default:
                    System.out.println("Invalid option");
                    return saveExitMenu(player);
            }

        return false;
    }


    }





