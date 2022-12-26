package Map;

import Game.Player.Player;
import VisualStats.Colors;
import VisualStats.TextArtImages;

import java.util.Scanner;

public class RunMap {
    private static Scanner scan = new Scanner(System.in);
    private static int[] doors = {0, 0, 0};
    private static int[] doorsOpen = {0, 0, 0};

    public RunMap() {
    }

    public static void run(Player player) {
        for (Node tempNode = MapCreation.create(); tempNode != null; tempNode = direction(questionLookVerification(), tempNode, player)) {
            tempNode.getValue().print();
        }
    }

    public static String questionVerification() {
        System.out.println("where to go?");
        String choice = scan.next();
        return !choice.equals("r") && !choice.equals("l") && !choice.equals("n") && !choice.equals("b") && !choice.equals("bl") && !choice.equals("br") && !choice.equals("w") && !choice.equals("s") ? questionVerification() : choice;
    }

    public static String questionLookVerification() {
        System.out.println("Where to look?");
        String choice = scan.next();
        return !choice.equals("w") && !choice.equals("s") ? questionVerification() : choice;
    }

    public static Node direction(String choice, Node node, Player player) {
        if (choice.equals("w")) {
            checkNumOfDoorsW(node);
            switch (questionVerification()) {
                case "n":
                    if (node.getNext() != null && node.getNext().isLock()) {
                        pickItem(node,player);
                        System.out.println(Colors.BLUE + "works" + Colors.RESET);
                        return node.getNext();
                    }
                    if (node.getNext() != null && bagCheck(player,node, 0)){
                        pickItem(node,player);
                        return node.getNext();
                    }
                    System.out.println("thats a wall");
                    break;
                case "r":
                    if (node.getRight() != null && node.getRight().isLock()) {
                        pickItem(node,player);
                        return node.getRight();
                    }
                    if (node.getRight() != null && bagCheck(player,node, 1)){
                        pickItem(node,player);
                        return node.getRight();
                    }

                    System.out.println("thats a wall");
                    break;
                case "l":
                    if (node.getLeft() != null && node.getLeft().isLock()) {
                        pickItem(node,player);
                        return node.getLeft();
                    }
                    if (node.getLeft() != null && bagCheck(player,node, 2)){
                        pickItem(node,player);
                        return node.getLeft();
                    }

                    System.out.println("thats a wall");
                    break;
                case "s":
                    return direction("s", node, player);
            }
        }
        if (choice.equals("s")) {
            checkNumOfDoorsS(node);
            switch (questionVerification()) {
                case "b":
                    if (node.getBack() != null) {
                        pickItem(node,player);
                        return node.getBack();
                    }

                    System.out.println("thats a wall");
                    break;
                case "bl":
                    if (node.getBackLeft() != null) {
                        pickItem(node,player);
                        return node.getBackLeft();
                    }
                    System.out.println("thats a wall");
                    break;
                case "br":
                    if (node.getBackRight() != null) {
                        pickItem(node,player);
                        return node.getBackRight();
                    }
                    System.out.println("thats a wall");
                    break;
                case "w":
                    return direction("w", node, player);
            }
        }
        return node;
    }

    public static boolean bagCheck(Player player, Node node, int num) {
        if (num == 0) {
            if (player.getBag().getKeys().size() > 0 && !node.getNext().isLock()) {
                player.getBag().openDoorBagAction(node.getNext());
                return node.getNext().isLock();
            }
        }
        if (num == 1){
            if (player.getBag().getKeys().size() > 0 && !node.getRight().isLock()) {
                player.getBag().openDoorBagAction(node.getRight());
                return node.getRight().isLock();
            }
        }
        if (num == 2){
            if (player.getBag().getKeys().size() > 0 && !node.getLeft().isLock()) {
                System.out.println(node.getLeft().isLock());
                player.getBag().openDoorBagAction(node.getLeft());
                return node.getLeft().isLock();
            }
        }
        System.out.println("locked");
        return false;
    }

    public static void pickItem (Node node, Player player) {
        if (node.getItem() != null){
            player.getBag().addItem(node.getItem());
            System.out.println("You've picked an Item");
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
}