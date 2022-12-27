package Game.Items.items_text;

import VisualStats.Colors;

public class Art {
    public static String knifeArt() {
        return "                                                                    \n" +
                "                      ▒▒▒▒▒▒▒▒                                      \n" +
                "                    ▒▒▒▒░░░░░░▒▒██                                  \n" +
                "                        ░░▒▒▒▒▒▒▒▒██                                \n" +
                "                            ▒▒▒▒▒▒▓▓██                              \n" +
                "                              ▓▓▓▓▓▓▓▓                              \n" +
                "                              ██▓▓▓▓██                              \n" +
                "                              ░░████▒▒                              \n" +
                "                                ▓▓██▓▓                              \n" +
                "                                ▒▒▒▒▓▓░░                            \n" +
                "                                ▓▓▓▓▒▒░░                            \n" +
                "                                ▓▓▓▓▓▓                              \n" +
                "                              ▓▓▓▓▓▓██                              \n" +
                "                            ░░░░  ▓▓▒▒                              \n" +
                "                              ▓▓▒▒▓▓                                \n" ;
    }

    public static String metalBarArt() {
        return "┌┐\n" +
                "││\n" +
                "││\n" +
                "││\n" +
                "││\n" +
                "││\n" +
                "││\n" +
                "└┘";
    }

    public static String shiningKeyArt(String code) {
        return Colors.YELLOW +
                "     8 8 8 8                     ,ooo.\n" +
                "     8a8 8a8                    oP   ?b\n" +
                "    d888a888zzzzzzzz" + code + "zzzzzzzz8     8b\n" +
                "     `\"\"^\"\"'                    ?o___oP'"
                + Colors.RESET;
    }

    public static String uselessKeyArt() {
        return  "     8 8 8 8                     ,ooo.\n" +
                "     8a8 8a8                    oP   ?b\n" +
                "    d888a888zzzzzzzz*$@%zzzzzzzz8     8b\n" +
                "     `\"\"^\"\"'                    ?o___oP'";
    }

    public static String bandageArt() {
        return " .--\"\"--.___.._\n" +
                " (  <__>  )     `-.\n" +
                " |`--..--'|      <|\n" +
                " |   +   :|       /\n" +
                " |       :|--\"\"-./\n" +
                " `.__  __;' o!O\n" +
                "     \"\"     ";
    }

    public static String fistAidKitArt() {
        return "             _____________\n" +
                "           /     __      /|\n" +
                "          /   __/ /_    / /\n" +
                "         /   /_  __/   / //\n" +
                "        /     /_/     / //\n" +
                "       /_____________/ //\n" +
                "       |______&______|//\n" +
                "       |_____________|/\n" +
                "            ___________";
    }
}
