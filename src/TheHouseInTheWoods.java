import Game.Items.Bag;
import Game.Player.Player;
import Save.Save;
import VisualStats.Colors;
import VisualStats.TextArtImages;

import java.util.Scanner;

import static Map.GameRun.playAgainCheck;
import static Map.RunMap.run;

public class TheHouseInTheWoods {
    static Scanner sc = new Scanner(System.in);

    static boolean exit = false;


    public static void launcher() {
        while (!exit) {
            int option;
            System.out.println(Colors.BLACK_BACKGROUND);
            TextArtImages.introTheHouseInTheWoods();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    play();
                    break;
                case 2:
                    howToPlay();
                    break;
                case 0:
                    System.out.println("\t\t\t\t\t\tSee you latter!");
                    exit = true;
                    break;
                default:
                    TextArtImages.separatorText();
                    System.out.println(Colors.RED + "" + Colors.BLACK_BACKGROUND + "Invalid Option" + Colors.RESET + Colors.BLACK_BACKGROUND);
            }
        }
    }

    public static void play() {
        while (!exit) {
            String name;
            int option;
            TextArtImages.playTheHouseInTheWoods();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Bag bag = new Bag();
                    System.out.print("Insert name for save file. \n SaveName:");
                    name = sc.next();
                    Player player = new Player(name, 5, 5, bag);
                    bag.setPlayer(player);
                    run(player);

                    System.out.println("Want to play again? \n" +
                            "n to no \n" +
                            "y to yes");
                    if (playAgainCheck()) {
                        run(player);
                    }
                    break;
                case 2:
                    System.out.print("Insert name of save file. \n SaveName:");
                    name = sc.next();
                    run(Save.load(name));


                    break;
                case 0:
                    launcher();
                    break;
                default:
                    TextArtImages.separatorText();
                    System.out.println(Colors.RED + "" + Colors.BLACK_BACKGROUND + "Invalid Option" + Colors.RESET + Colors.BLACK_BACKGROUND);
                    TextArtImages.separatorText();

            }
        }
    }

    public static void howToPlay() {
        TextArtImages.howToPlayTheHouseInTheWoods();
        int option = sc.nextInt();
        switch (option) {
            case 0:
                launcher();
                break;
            default:
                TextArtImages.separatorText();
                System.out.println(Colors.RED + "" + Colors.BLACK_BACKGROUND + "Invalid Option" + Colors.RESET + Colors.BLACK_BACKGROUND);
                TextArtImages.separatorText();

        }
    }

}
