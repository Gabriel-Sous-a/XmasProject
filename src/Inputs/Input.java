package Inputs;

import java.util.Scanner;

public class Input {

    public static int inputMenuOptions(int initial, int finale){
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();
        if (op >= initial && op <= finale){
            return op;
        }
        System.out.println("this is not a option");
        return inputMenuOptions(initial,finale);
    }
    public static String yesOrNo(){
        Scanner scan = new Scanner(System.in);
        String temp = scan.next().toUpperCase();
        if (temp.equals("Y") || temp.equals("N")){
            return temp;
        }
        return yesOrNo();
    }

}
