package week2_Intro_Java;

import java.util.Scanner;

public class PayrollExample {

    public static void main(String[] args) {

        double rate, hours;
        Scanner kbd = new Scanner(System.in);

        System.out.println("Hours: ");
        hours = kbd.nextDouble();
        System.out.println("Rate: ");
        rate = kbd.nextDouble();

        System.out.println("Your gross pay is: " + (hours * rate));
    }
}
