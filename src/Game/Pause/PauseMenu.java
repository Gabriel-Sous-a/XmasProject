package Game.Pause;

import Game.Player.Player;
import Inputs.Input;
import Save.Save;
import VisualStats.TextArtImages;


public class PauseMenu {
    public static boolean menu(Player player){
        int op = 0;
        do {
            System.out.println(
                    "                                                                                              ◤━━━━━━━━━━━━━━━━━━━━━━━━◥\n" +
                            "                                                                                               1 - Continue\n" +
                            "                                                                                               2 - Help\n" +
                            "                                                                                               3 - Save\n" +
                            "                                                                                               4 - Exit\n" +
                            "                                                                                              ◣━━━━━━━━━━━━━━━━━━━━━━━━◢\n"
            );
            op = Input.inputMenuOptions(1,4);
            switch (op){
                case 1:
                    return false;
                case 2:
                    TextArtImages.howToPlayTheHouseInTheWoods();
                    break;
                case 3:
                    Save.save(player);
                    break;
                case 4:
                    break;
            }
        }while (op != 4);

        return true;
    }
}
