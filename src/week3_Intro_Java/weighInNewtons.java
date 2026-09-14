package week3_Intro_Java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class weighInNewtons {
    public static void main(String[] args) {


       /*
    this program asks the user for a mass in kg and calculates it in Newtons
     */
        int weight;
        double newtons = 9.81;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a weight in kg: ");
        weight = input.nextInt();

        newtons = weight * 9.81;
        // if(newtons <10 || ){
        System.out.println("Object is just right. ");
    }
}

//outcome 490.5

