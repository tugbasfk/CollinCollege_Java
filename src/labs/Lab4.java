/*
Name: Tugba Safak
Date: 09/17/2026
Assignment: Lab 4
Section: TUE / THU
 */

package labs;

import java.util.Random;
import java.util.Scanner;

/**
 * This program will follow Mariposa and Bibbles in their adventure to the forest of darkness.
 * The user will be faced with three different obstacles.
 * Each obstacle will have only one spell that will help overcome it.
 * The spells will be assigned randomly to the user when Enter is pressed.
 */

public class Lab4 {

    //Obstacles: constants representing obstacles
    public final static int SKEEZITE = 1;
    public final static int HENNA = 2;
    public final static int GWYLLION = 3;

    //Spells: constants representing spells
    public final static int MAGICCRYSTALNECKLACE = 1;
    public final static int PEGASUS = 2;
    public final static int WINGS = 3;

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); //So the program can receive input from user
        Random rnd = new Random(); //Creates a Random object to generate random spell numbers

        //Creates a timer with 5 minutes
        int timer = 5;

        int obstacle = SKEEZITE;//Sets the current obstacle to the first one
        int randomSpell; //Declares a variable that will store the randomly selected spell

        System.out.println("You are a brave, smart, and shy butterfly fairy who loves reading " +
                "and dreams of exploring the world beyond her home. " +
                "You are flying in the forest of bright magic with Bibbles, " +
                "your fluffy flying puffball royal servant pet, " +
                "when all of a sudden Laverna, the witch in town, " +
                "lures Bibbles into the forest of darkness to turn him evil and make him her own servant. " +
                "You follow them into the dark forest but shortly after lose them. " +
                "You try to get out of the forest to find Prince Carlos to help you get back Bibbles. " +
                "But Laverna has thought of everything and put up obstacles all over the forest " +
                "which you need to overcome to save Bibbles from turning evil.");
        System.out.println();

        while (timer > 0 && obstacle <= GWYLLION) {//Keeps game running while time remains and obstacles are not finished
            if (obstacle == SKEEZITE) {
                System.out.println("You run into your first obstacle a Skeezite, huge, " +
                        "green flying creatures hunting and feeding on butterfly fairies. " +
                        "You must make your magic crystal necklace shine to protect yourself. (press enter)");
                input.nextLine(); //Waits for the user to press Enter
                randomSpell = rnd.nextInt(3) + 1; //Generates a random number from 1 to 3 representing a spell

                if (randomSpell == MAGICCRYSTALNECKLACE) {//Checks whether the correct spell was randomly chosen
                    System.out.println("Your magic crystal necklace, " +
                            "it is shining as bright as the sun blinding all Skeezite. " +
                            "You fly through them and keep searching for a way out.");
                    System.out.println();
                    obstacle++; //Moves the player to the next obstacle
                } else {
                    if (randomSpell == PEGASUS || randomSpell == WINGS) {
                        System.out.println("Your magic power is not enough to win this battle. " +
                                "You must try harder to defeat the Skeezite");
                        timer--; //Subtracts one minute from the timer if the wrong spell was randomly assigned
                        if (timer == 0) {//Checks whether all time has been used up
                            System.out.println("You ran out of time.");
                        } else {
                            System.out.println("Quick! You have " + timer +
                                    " more minutes before Laverna finishes her mixture and " +
                                    "turns Bibbles evil.");
                            System.out.println();

                        }
                    }

                }


            } else if (obstacle == HENNA) {
                System.out.println("Your run into Henna, your second obstacle " +
                        "and your biggest competitor back in the days at school. " +
                        "She used her knowledge on spells to now become an evil fairy manipulating " +
                        "the butterfly fairy flight course. " +
                        "You must call Pegasus, your winged pink unicorn " +
                        "to fly higher than Henna and protect yourself. (press enter)");
                input.nextLine();
                randomSpell = rnd.nextInt(3) + 1;

                if (randomSpell == PEGASUS) {
                    System.out.println("Henna is stronger than you thought. " +
                            "But, what is that noise? It’s Pegasus, your flying unicorn. " +
                            "You are saved! " +
                            "You hop on Pegasus and he flies you higher than any fairy ever could.");
                    System.out.println();
                    obstacle++;
                } else {
                    if (randomSpell == MAGICCRYSTALNECKLACE || randomSpell == WINGS) {
                        System.out.println("Your magic power is not enough to win this battle. " +
                                "You must try harder to defeat Henna.");
                        timer--;
                        if (timer == 0) {
                            System.out.println("You ran out of time.");
                        } else {
                            System.out.println("Quick! You have " + timer +
                                    " more minutes before Laverna finishes her mixture and " +
                                    "turns Bibbles evil.");
                            System.out.println();

                        }

                    }


                }

            } else if (obstacle == GWYLLION) {
                System.out.println("Your last obstacle is Gwillion. She has been around for thousands of years. " +
                        "Her strongest feature is her using dark power to cast spells on fairies and turn " +
                        "them into thin air. (press enter)");
                input.nextLine();
                randomSpell = rnd.nextInt(3) + 1;

                if (randomSpell == WINGS) {
                    System.out.println("Gwyllion has really improved her spells over the years, " +
                            "but you remember your fairy trainings and remember you can use your wings as a shield to protect " +
                            "yourself from evil spells. You hide behind your wings and Gwyllion’s spell gets reflected to herself. " +
                            "She turns into thin air. You quickly fly away and save yourself!");
                    System.out.println();
                    obstacle++;
                } else {
                    if (randomSpell == MAGICCRYSTALNECKLACE || randomSpell == PEGASUS) {
                        System.out.println("Your magic power is not enough to win this battle. " +
                                "Think about the lectures you've had at school.");

                        timer--;
                        if (timer == 0) {
                            System.out.println("You ran out of time.");
                        } else {
                            System.out.println("Quick! You have " + timer +
                                    " more minutes before Laverna finishes her mixture and " +
                                    "turns Bibbles evil.");
                            System.out.println();

                        }

                    }
                }
            }
        }
        //Determine whether player wins or looses
        if (obstacle > GWYLLION) { //Checks whether all obstacles have been completed
            System.out.println("You are out. You did it! " +
                    "Now you quickly fly your way to the castle and get help before it’s too late. ");
        } else {
            System.out.println("Hehehee! Oh no, that’s Laverna! " +
                    "She turned Bibbles into her very own evil servant. " +
                    "You could not save him. It's game over. You lose.");
        }
    }
}



