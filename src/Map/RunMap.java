package Map;

import java.util.Scanner;

public class RunMap {
    private static Scanner scan;

    public RunMap() {
    }

    public static void run() {
        for(Node tempNode = MapCreation.create(); tempNode != null; tempNode = direction(questionLookVerification(), tempNode)) {
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

    public static Node direction(String choice, Node node) {
        if (choice.equals("w")) {
            checkNumOfDoorsW(node);
            switch (questionVerification()) {
                case "n":
                    if (node.getNext() != null) {
                        return node.getNext();
                    }

                    System.out.println("thats a wall");
                    break;
                case "r":
                    if (node.getRight() != null) {
                        return node.getRight();
                    }

                    System.out.println("thats a wall");
                    break;
                case "l":
                    if (node.getLeft() != null) {
                        return node.getLeft();
                    }

                    System.out.println("thats a wall");
                    break;
                case "s":
                    return direction("s", node);
            }
        }

        if (choice.equals("s")) {
            checkNumOfDoorsS(node);
            switch (questionVerification()) {
                case "b":
                    if (node.getBack() != null) {
                        return node.getBack();
                    }

                    System.out.println("thats a wall");
                    break;
                case "bl":
                    if (node.getBackLeft() != null) {
                        return node.getBackLeft();
                    }

                    System.out.println("thats a wall");
                    break;
                case "br":
                    if (node.getBackRight() != null) {
                        return node.getBackRight();
                    }

                    System.out.println("thats a wall");
                    break;
                case "w":
                    return direction("w", node);
            }
        }

        return node;
    }

    public static void checkNumOfDoors(Node node) {
        if (node.getNext() != null && node.getRight() != null && node.getLeft() != null || node.getBack() != null && node.getBackRight() != null && node.getBackLeft() != null) {
            System.out.println("⛩⛩⛩");
        }

        if (node.getNext() == null && node.getRight() != null && node.getLeft() != null || node.getBack() == null && node.getBackRight() != null && node.getBackLeft() != null) {
            System.out.println("⛩❌⛩");
        }

        if (node.getNext() != null && node.getRight() == null && node.getLeft() != null || node.getBack() != null && node.getBackRight() == null && node.getBackLeft() != null) {
            System.out.println("⛩⛩❌");
        }

        if (node.getNext() != null && node.getRight() != null && node.getLeft() == null || node.getBack() != null && node.getBackRight() != null && node.getBackLeft() == null) {
            System.out.println("❌⛩⛩");
        }

        if (node.getNext() == null && node.getRight() == null && node.getLeft() != null || node.getBack() == null && node.getBackRight() == null && node.getBackLeft() != null) {
            System.out.println("⛩❌❌");
        }

        if (node.getNext() == null && node.getRight() != null && node.getLeft() == null || node.getBack() == null && node.getBackRight() != null && node.getBackLeft() == null) {
            System.out.println("❌❌⛩");
        }

        if (node.getNext() != null && node.getRight() == null && node.getLeft() == null || node.getBack() != null && node.getBackRight() == null && node.getBackLeft() == null) {
            System.out.println("❌⛩❌");
        }

        if (node.getNext() == null && node.getRight() == null && node.getLeft() == null || node.getBack() == null && node.getBackRight() == null && node.getBackLeft() == null) {
            System.out.println("❌❌❌");
        }

    }

    public static void checkNumOfDoorsW(Node node) {
        if (node.getNext() != null && node.getRight() != null && node.getLeft() != null) {
            System.out.println("⛩⛩⛩");
        }

        if (node.getNext() == null && node.getRight() != null && node.getLeft() != null) {
            System.out.println("⛩❌⛩");
        }

        if (node.getNext() != null && node.getRight() == null && node.getLeft() != null) {
            System.out.println("⛩⛩❌");
        }

        if (node.getNext() != null && node.getRight() != null && node.getLeft() == null) {
            System.out.println("❌⛩⛩");
        }

        if (node.getNext() == null && node.getRight() == null && node.getLeft() != null) {
            System.out.println("⛩❌❌");
        }

        if (node.getNext() == null && node.getRight() != null && node.getLeft() == null) {
            System.out.println("❌❌⛩");
        }

        if (node.getNext() != null && node.getRight() == null && node.getLeft() == null) {
            System.out.println("❌⛩❌");
        }

        if (node.getNext() == null && node.getRight() == null && node.getLeft() == null) {
            System.out.println("❌❌❌");
        }

    }

    public static void checkNumOfDoorsS(Node node) {
        if (node.getBack() != null && node.getBackRight() != null && node.getBackLeft() != null) {
            System.out.println("⛩⛩⛩");
        }

        if (node.getBack() == null && node.getBackRight() != null && node.getBackLeft() != null) {
            System.out.println("⛩❌⛩");
        }

        if (node.getBack() != null && node.getBackRight() == null && node.getBackLeft() != null) {
            System.out.println("⛩⛩❌");
        }

        if (node.getBack() != null && node.getBackRight() != null && node.getBackLeft() == null) {
            System.out.println("❌⛩⛩");
        }

        if (node.getBack() == null && node.getBackRight() == null && node.getBackLeft() != null) {
            System.out.println("⛩❌❌");
        }

        if (node.getBack() == null && node.getBackRight() != null && node.getBackLeft() == null) {
            System.out.println("❌❌⛩");
        }

        if (node.getBack() != null && node.getBackRight() == null && node.getBackLeft() == null) {
            System.out.println("❌⛩❌");
        }

        if (node.getBack() == null && node.getBackRight() == null && node.getBackLeft() == null) {
            System.out.println("❌❌❌");
        }

    }

    static {
        scan = new Scanner(System.in);
    }
}