package week3_intro_java;

import java.util.Scanner;

public class InputValidationNumbers {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number between 5 and 10: ");

       num = input.nextInt();

      //while(num > 10) -> this would include all nums from 1 - 5 , we only want 5 -10
        while(num < 5 || num > 10){
           System.out.println("Invalid entry! Please enter a number between 5 and 10 ");
           num = input.nextInt();
       }
        System.out.println("Valid entry! You entered " + num);

    }
}
