package week2_Intro_Java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
this program plays Madlib with the user
 */

public class MatrixMadlib {
    public static void main(String[] args) {


        String adj, place, noun, verb, animal, adj2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an adjective: ");
        adj = input.next();

        System.out.println("Enter a place: ");
        place = input.next();

        System.out.println("Enter a noun: ");
        noun = input.next();

        System.out.println("Enter a verb in past tense: ");
        verb = input.next();

        System.out.println("Enter an animal: ");
        animal = input.next();

        System.out.println("Enter a second adjective: ");
        adj2 = input.next();

        System.out.println("Neo was feeling " + adj + " as he entered the " + place +
                "." + " He saw a " + noun + " that " + verb + " like a " + animal +
                "." + " This was the moment he realized the " + adj2 + " truth about the Matrix." );

    }
}
