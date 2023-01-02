package Map;

import Game.Player.Player;
import VisualStats.Colors;
import VisualStats.TextArtImages;
import java.util.Scanner;

import static Save.Save.saveExitMenu;

public class RunMap {
    private static Scanner scan = new Scanner(System.in);
    private static boolean lookBool;

    public RunMap() {
    }

    public static void run(Player player) {
        player.setLevel(0);
        for (Node tempNode = MapCreation.create2()[0]; tempNode != null; tempNode = direction(tempNode, player)) {
            if (tempNode.getValue().getCode().equals("1111")) {
                System.out.println(Colors.GREEN_BOLD_BRIGHT + "you won level 1" + Colors.RESET);
                break;
            }
            if (player.getHp() <= 0) {
                System.out.println(Colors.GREEN_BOLD_BRIGHT + "you lost" + Colors.RESET);
                break;
            }
            tempNode.getValue().print();
        }
        player.setLevel(1);
        System.out.println("Do you want to keep playing?");
        System.out.print("->");
        if (playAgainCheck()) {
            for (Node tempNode = MapCreation.create()[0]; tempNode != null; tempNode = direction(tempNode, player)) {
                if (tempNode.getValue().getCode().equals("1111")) {
                    System.out.println(Colors.GREEN_BOLD_BRIGHT + "you win" + Colors.RESET);
                    if (!playAgainCheck()) {
                        return;
                    }
                    break;
                }
                if (player.getHp() <= 0) {
                    System.out.println(Colors.GREEN_BOLD_BRIGHT + "you lost" + Colors.RESET);
                    break;
                }
                tempNode.getValue().print();
            }
        }
    }

    public static String questionVerification() {
        System.out.println("where to go?");
        System.out.print("->");
        String choice = scan.next();
        return !choice.equals("w") && !choice.equals("a") && !choice.equals("d") && !choice.equals("s") && !choice.equals("i") && !choice.equals("m") ? questionVerification() : choice;
    }

    public static Node direction(Node node, Player player) {
        if (lookBool) {
            return lookBack(node, player);
        }
        checkNumOfDoorsW(node);
        switch (questionVerification()) {
            case "w" -> {
                if (node.getNext() != null && node.getNext().isLock()) {
                    pickItem(node, player, 0);
                    checkNpc(node, player, 0);
                    return node.getNext();
                }
                if (node.getNext() != null && !bagCheck(player, node, 0)) {
                    pickItem(node, player, 0);
                    checkNpc(node, player, 0);
                    return node.getNext();
                } else if (node.getNext() != null && bagCheck(player, node, 0) && !node.getNext().isLock()) {
                    System.out.println("This door is locked, try to find a key");
                    break;
                }
                if (node.getNext() == null) {
                    System.out.println("that's a wall");
                }
            }
            case "d" -> {
                if (node.getRight() != null && node.getRight().isLock()) {
                    pickItem(node, player, 1);
                    checkNpc(node, player, 1);
                    return node.getRight();
                }
                if (node.getRight() != null && !bagCheck(player, node, 1)) {
                    pickItem(node, player, 1);
                    checkNpc(node, player, 1);
                    return node.getRight();
                } else if (node.getRight() != null && bagCheck(player, node, 0) && !node.getRight().isLock()) {
                    System.out.println("This door is locked, try to find a key");
                    break;
                }
                if (node.getRight() == null) {
                    System.out.println("that's a wall");
                }
            }
            case "a" -> {
                if (node.getLeft() != null && node.getLeft().isLock()) {
                    pickItem(node, player, 2);
                    checkNpc(node, player, 2);
                    return node.getLeft();
                }
                if (node.getLeft() != null && !bagCheck(player, node, 2)) {
                    pickItem(node, player, 2);
                    checkNpc(node, player, 2);
                    return node.getLeft();
                } else if (node.getLeft() != null && bagCheck(player, node, 0) && !node.getLeft().isLock()) {
                    System.out.println("This door is locked, try to find a key");
                    break;
                }
                if (node.getLeft() == null) {
                    System.out.println("that's a wall");
                }
            }
            case "i" -> player.getBag().openBag();
            case "s" -> {
                lookBool = true;
                return lookBack(node, player);
            }
            case "m" -> {saveExitMenu(player);}

        }
        return node;
    }

    public static Node lookBack(Node node, Player player) {
        checkNumOfDoorsS(node);
        switch (questionVerification()) {
            case "w" -> {
                if (node.getBack() != null && node.getBack().isLock()) {
                    pickItem(node, player, 3);
                    checkNpc(node, player, 3);
                    return node.getBack();
                }
                if (node.getBack() != null && !bagCheck(player, node, 3)) {
                    pickItem(node, player, 3);
                    checkNpc(node, player, 3);
                    return node.getBack();
                } else if (bagCheck(player, node, 3) && !node.getBack().isLock()) {
                    System.out.println("This door is locked, try to find a key");
                    break;
                }
                if (node.getBack() == null) {
                    System.out.println("that's a wall");
                }
            }
            case "a" -> {
                if (node.getBackLeft() != null && node.getBackLeft().isLock()) {
                    pickItem(node, player, 5);
                    checkNpc(node, player, 5);
                    return node.getBackLeft();
                }
                System.out.println("that's a wall");
            }
            case "d" -> {
                if (node.getBack() != null && node.getBackRight() != null && node.getBackRight().isLock()) {
                    pickItem(node, player, 4);
                    checkNpc(node, player, 4);
                    return node.getBackRight();
                }
                System.out.println("that's a wall");
            }
            case "s" -> {
                lookBool = false;
            }
            case "m" -> {
                //por menu aqui
            }
        }
        return node;
    }

    public static boolean bagCheck(Player player, Node node, int num) {
        if (num == 0) {
            if (player.getBag().getKeys().size() > 0 && !node.getNext().isLock()) {
                System.out.println("You need this key -> " + node.getNext().getValue().getCode());
                player.getBag().openDoorBagAction(node.getNext());
                return node.getNext().isLock();
            }
        }
        if (num == 1) {
            if (player.getBag().getKeys().size() > 0 && !node.getRight().isLock()) {
                System.out.println("You need this key -> " + node.getRight().getValue().getCode());
                player.getBag().openDoorBagAction(node.getRight());
                return node.getRight().isLock();
            }
        }
        if (num == 2) {
            if (player.getBag().getKeys().size() > 0 && !node.getLeft().isLock()) {
                System.out.println("You need this key -> " + node.getLeft().getValue().getCode());
                player.getBag().openDoorBagAction(node.getLeft());
                return node.getLeft().isLock();
            }
        }
        if (num == 3) {
            if (player.getBag().getKeys().size() > 0 && !node.getBack().isLock()) {
                System.out.println("You need this key -> " + node.getBack().getValue().getCode());
                player.getBag().openDoorBagAction(node.getBack());
                return node.getBack().isLock();
            }
        }
        return true;
    }

    public static void pickItem(Node node, Player player, int num) {
        if (num == 0) {
            if (node.getNext().getItem() != null) {
                System.out.println("You've picked this Item:" + node.getNext().getItem().getName());
                System.out.println(node.getNext().getItem().getAsciiArt());
                player.getBag().addItem(node.getNext().getItem());
                node.setItem(null);
            }
        }
        if (num == 1) {
            if (node.getRight().getItem() != null) {
                System.out.println("You've picked this Item:" + node.getRight().getItem().getName());
                System.out.println(node.getRight().getItem().getAsciiArt());
                player.getBag().addItem(node.getRight().getItem());
                node.setItem(null);
            }

        }
        if (num == 2) {
            if (node.getLeft().getItem() != null) {
                System.out.println("You've picked this Item:" + node.getLeft().getItem().getName());
                System.out.println(node.getLeft().getItem().getAsciiArt());
                player.getBag().addItem(node.getLeft().getItem());
                node.setItem(null);
            }
        }
        if (num == 3) {
            if (node.getBack().getItem() != null) {
                System.out.println("You've picked this Item:" + node.getBack().getItem().getName());
                System.out.println(node.getBack().getItem().getAsciiArt());
                player.getBag().addItem(node.getBack().getItem());
                node.setItem(null);
            }
        }
        if (num == 4) {
            if (node.getBackRight().getItem() != null) {
                System.out.println("You've picked this Item:" + node.getBack().getItem().getName());
                System.out.println(node.getBack().getItem().getAsciiArt());
                player.getBag().addItem(node.getBackRight().getItem());
                node.setItem(null);
            }

        }
        if (num == 5) {
            if (node.getBackLeft().getItem() != null) {
                System.out.println("You've picked this Item:" + node.getBack().getItem().getName());
                System.out.println(node.getBack().getItem().getAsciiArt());
                player.getBag().addItem(node.getBackLeft().getItem());
                node.setItem(null);
            }
        }
    }

    public static void checkNpc(Node node, Player player, int num) {
        if (num == 0) {
            if (node.getNext().getNpc() != null) {
                node.getNext().getNpc().event(player);
            }
        }
        if (num == 1) {
            if (node.getRight().getNpc() != null) {
                node.getRight().getNpc().event(player);
            }
        }
        if (num == 2) {
            if (node.getLeft().getNpc() != null) {
                node.getLeft().getNpc().event(player);
            }
        }
        if (num == 3) {
            if (node.getBack().getNpc() != null) {
                node.getBack().getNpc().event(player);
            }
        }
        if (num == 4) {
            if (node.getBackRight().getNpc() != null) {
                node.getBackRight().getNpc().event(player);
            }
        }
        if (num == 5) {
            if (node.getBackLeft().getNpc() != null) {
                node.getBackLeft().getNpc().event(player);
            }
        }
    }

    public static void checkNumOfDoorsW(Node node) {
        if (node.getNext() != null && node.getRight() != null && node.getLeft() != null) {
            TextArtImages.threeDoor();
        }

        if (node.getNext() == null && node.getRight() != null && node.getLeft() != null) {
            TextArtImages.twoLeftRightDoor();
        }

        if (node.getNext() != null && node.getRight() == null && node.getLeft() != null) {
            TextArtImages.twoLeftMiddleDoor();
        }

        if (node.getNext() != null && node.getRight() != null && node.getLeft() == null) {
            TextArtImages.twoMiddleRightDoor();
        }

        if (node.getNext() == null && node.getRight() == null && node.getLeft() != null) {
            TextArtImages.oneLeftDoor();
        }

        if (node.getNext() == null && node.getRight() != null && node.getLeft() == null) {
            TextArtImages.oneRightDoor();
        }

        if (node.getNext() != null && node.getRight() == null && node.getLeft() == null) {
            TextArtImages.oneMiddleDoor();
        }

        if (node.getNext() == null && node.getRight() == null && node.getLeft() == null) {
            TextArtImages.noDoor();
        }
    }

    public static void checkNumOfDoorsS(Node node) {
        if (node.getBack() != null && node.getBackRight() != null && node.getBackLeft() != null) {
            TextArtImages.threeDoor();
        }

        if (node.getBack() == null && node.getBackRight() != null && node.getBackLeft() != null) {
            TextArtImages.twoLeftRightDoor();
        }

        if (node.getBack() != null && node.getBackRight() == null && node.getBackLeft() != null) {
            TextArtImages.twoLeftMiddleDoor();
        }

        if (node.getBack() != null && node.getBackRight() != null && node.getBackLeft() == null) {
            TextArtImages.twoMiddleRightDoor();
        }

        if (node.getBack() == null && node.getBackRight() == null && node.getBackLeft() != null) {
            TextArtImages.oneLeftDoor();
        }

        if (node.getBack() == null && node.getBackRight() != null && node.getBackLeft() == null) {
            TextArtImages.oneRightDoor();
        }

        if (node.getBack() != null && node.getBackRight() == null && node.getBackLeft() == null) {
            TextArtImages.oneMiddleDoor();
        }

        if (node.getBack() == null && node.getBackRight() == null && node.getBackLeft() == null) {
            TextArtImages.noDoor();
        }

    }

    public static boolean playAgainCheck() {
        String choice = scan.next();
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