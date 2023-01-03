import Game.Items.Bag;
import Game.Player.Player;
import Inputs.Input;
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
            option = Input.inputMenuOptions(0,2);
            switch (option) {
                case 1:
                    play();
                    break;
                case 2:
                    howToPlay();
                    break;
                case 0:
                    System.out.println("\t\t\t\t\t\tSee you later!");
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
                    System.out.println("""
                                               As you usually do at the end of the day, you go for a run in a forest near your city, but this time you took a path you have never taken before. 
                                               After a few hours of exercise you suddenly see a huge house, that almost seems like an old mansion, which intrigued you, and since you are very curious
                                                and adventurous, you chose to take a quick look even though is getting dark.
                                               The entry/lobby door is open so you step in and take a look , as you enter further you hear the door you just came from closing behind you! You try to
                                                open it but strangely it is now locked.. You hope it was the wind but you have your doubts...
                """);
                    Bag bag = new Bag();
                    System.out.print("Insert name for save file. \n SaveName:");
                    name = sc.next();
                    Player player = new Player(name, 5, 5, bag);
                    bag.setPlayer(player);
                    if (run(player)){
                        return;
                    }
                    /*System.out.println("Want to play again? \n" +
                            "n to no \n" +
                            "y to yes");
                    if (playAgainCheck()) {
                        if (run(player)){
                            return;
                        }
                    }*/
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
