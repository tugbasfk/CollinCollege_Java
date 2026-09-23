package week3_intro_java;

import java.util.Scanner;

public class weighInNewtons {
    public static void main(String[] args) {


       /*
    this program asks the user for a mass in kg and calculates it in Newtons
     */
        double weight;
        double mass = 9.81;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a the mass of your object: ");
        weight = input.nextDouble();

        weight = mass * 9.81;
        System.out.println("The weigh in Newton is: " + weight);

        System.out.print("That object is ");
        if (weight >= 10 && weight <=1000)
            System.out.println("just right!");
        else if (weight > 1000)
            System.out.println("really heavy!");
        else
            System.out.println("really light!");


    }
}

//outcome 490.5

