package week4_intro_java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class firstMethods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        tripleIt(num);
        cubeIt(num);

    }

    public static void tripleIt(int value){
        System.out.println(value + " triple is " + (value * 3));
    }

    public static void cubeIt(int value){
        System.out.println("Now let's print some cubes");
        for (int i = 0; i<= value; i++)
        System.out.println(i + "^3 = " + i*i*i);
    }
}
