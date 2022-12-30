import Map.RunMap;
import VisualStats.Colors;
import VisualStats.TextArtImages;

import java.util.Scanner;

public class TheHouseInTheWoods {
    static Scanner sc = new Scanner(System.in);

    static boolean exit = false;


    public static void launcher(){
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
                    exit=true;
                    break;
                default:
                    TextArtImages.separatorText();
                    System.out.println(Colors.RED+""+Colors.BLACK_BACKGROUND+"Invalid Option"+Colors.RESET+Colors.BLACK_BACKGROUND);
            }
        }
    }

    public static void play() {
        while (!exit) {
            int option;
            //System.out.println(Colors.BLACK_BACKGROUND);
            TextArtImages.playTheHouseInTheWoods();
            option = sc.nextInt();
            switch (option) {
                case 1:
                  //  RunMap.run(player);
                    //game();
                    break;
                case 2:


                    break;
                case 0:
                    launcher();
                    break;
                default:
                    TextArtImages.separatorText();
                    System.out.println(Colors.RED+""+Colors.BLACK_BACKGROUND+"Invalid Option"+Colors.RESET+Colors.BLACK_BACKGROUND);
                    TextArtImages.separatorText();

            }
        }
    }

    public static void howToPlay(){
        TextArtImages.howToPlayTheHouseInTheWoods();
        int option = sc.nextInt();
        switch (option){
            case 0:
                launcher();
                break;
            default:
                TextArtImages.separatorText();
                System.out.println(Colors.RED+""+Colors.BLACK_BACKGROUND+"Invalid Option"+Colors.RESET+Colors.BLACK_BACKGROUND);
                TextArtImages.separatorText();

        }
    }
}
