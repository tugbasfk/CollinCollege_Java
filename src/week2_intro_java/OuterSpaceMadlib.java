package week2_intro_java;

import java.util.Scanner;

public class OuterSpaceMadlib {
    public static void main(String[] args) {
/*
this program plays outer space madlib with the user
 */
        double decimalNum;
        String planetName, funnyName;
        int wholeNum;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        decimalNum = input.nextDouble();

        System.out.println("Enter a planet name: ");
        planetName = input.next();

        System.out.println("Enter a whole number: ");
        wholeNum = input.nextInt();

        System.out.println("Enter a funny name: ");
        funnyName = input.next();

        System.out.println("In the future you will live on the planet " + planetName + ", " +
                decimalNum + " light years from earth. Oh no! " + wholeNum +
                " asteroids led by the fearsome asteroid " + funnyName + " destroy planet " +
               planetName + " and you loose. Sorry!" );


    }
}
