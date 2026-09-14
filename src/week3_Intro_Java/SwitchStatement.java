package week3_Intro_Java;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {


        Scanner kbd = new Scanner(System.in);
        int choice = kbd.nextInt();

        switch (choice) {
            case 1:
            case 2:
                System.out.println("low key tiny");
                break;
            case 4:
                System.out.println("that's mid");
                break;
            default:
                System.out.println("max rizz");
        }

    }
}
