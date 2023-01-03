package Inputs;

import java.util.Scanner;

public class Input {

    public static int inputMenuOptions(int initial, int finale){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.print("\n->");
            int op = scan.nextInt();
            if (op >= initial && op <= finale){
                return op;
            }
            System.out.println("this is not a option");
        }catch (Exception e){
            System.out.println("Only numbers allowed");
            return inputMenuOptions(initial,finale);
        }
        return inputMenuOptions(initial,finale);
    }
    public static String yesOrNo(){
        Scanner scan = new Scanner(System.in);

        System.out.print("\n->");
        String temp = scan.next().toUpperCase();
        if (temp.equals("Y") || temp.equals("N")){
            return temp;
        }
        System.out.println("The options are only y or n");
        return yesOrNo();
    }

}
