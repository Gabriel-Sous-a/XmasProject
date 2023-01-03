package Map;

import Game.Items.Bag;
import Game.Items.Key.ShiningKey;
import Game.Player.Player;
import VisualStats.Colors;
import VisualStats.TextArtImages;

import java.util.Scanner;

public class GameRun {
    private static Scanner scan = new Scanner(System.in);

    public static boolean run() {
        Bag bag = new Bag();
        Player player = new Player("player", 5, 5, bag);
        bag.setPlayer(player);
        bag.addItem(new ShiningKey("1111"));
        TextArtImages.introTheHouseInTheWoods();
        switch (stringCheck()) {
            case "1":
                RunMap.run(player);
                System.out.println("Want to play again? \n" +
                        "n to no \n" +
                        "y to yes");
                if (playAgainCheck()) {
                    return run();
                }
                break;
            case "2":
                System.out.println("help");
                return run();
            case "0":
                break;
        }
        return false;
    }

    public static String stringCheck() {
        String choice = scan.next().toLowerCase();
        if (choice.equals("1") || choice.equals("2") || choice.equals("0")) {
            return choice;
        }
        System.out.println(Colors.RED + "Choose a correct input" + Colors.RESET);
        return stringCheck();
    }

    public static boolean playAgainCheck() {
        String choice = scan.next().toLowerCase();
        if (choice.equals("y")) {
            return true;
        }
        if (choice.equals("n")) {
            return false;
        }
        System.out.println(Colors.RED + "Choose a correct input" + Colors.RESET);
        return playAgainCheck();
    }
}
