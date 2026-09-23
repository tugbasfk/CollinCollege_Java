package labs;

import java.util.Scanner;

public class Lab3 {

    //assigning constant variables
    public static final int grindylowDamage = 20;
    public static final int trollDamage = 40;
    public static final int dementorDamage = 60;
    public static final int basiliskDamage = 80;

    public static void main(String[] args) {


    /*Harry Potter is being attacked
     the goal of this program is to determine if he wins or loses the battle
     against one of four creatures.
     It will tell the user at the end of the battle whether Harry survives or not.*/

        //assigning variables
        int healthPoints;
        int creatureChoice;
        char knowsPatronusCharm;
        Scanner input = new Scanner(System.in);

        //prompting to choose health points
        System.out.println("Help! Harry Potter is being attacked!");
        System.out.println("How much health should he start with? (1 -100):");
        healthPoints = input.nextInt();
        if (healthPoints >= 1 && healthPoints <= 100) {
            System.out.println("Your health point is: " + healthPoints);

            //prompting to choose creature
            System.out.println("Which creature is attacking. Choose your number:\n" +
                    "1. Grindylow\n" +
                    "2. Troll\n" +
                    "3. Basilisk\n" +
                    "4. Dementor"
            );
            creatureChoice = input.nextInt();

            //making sure Harry survives according to creature choice
            if (creatureChoice == 1) {
                System.out.println("Harry is attacked by a Grindylow which deals " + grindylowDamage
                        + " damage.");

                if (healthPoints > grindylowDamage) {
                    System.out.println("Harry ends the battle with " + (healthPoints - grindylowDamage) + " health.\n" +
                            "He survives!");
                } else {
                    System.out.println("Harry ends the battle with " + (healthPoints - grindylowDamage) + " health.\n" +
                            "Oh no... he didn't make it.");
                }

            } else if (creatureChoice == 2) {
                System.out.println("Harry is attacked by a Troll which deals " + trollDamage
                        + " damage.");
                if (healthPoints > trollDamage) {
                    System.out.println("Harry ends the battle with " + (healthPoints - trollDamage) + " health.\n" +
                            "He survives!");
                } else {
                    System.out.println("Harry ends the battle with " + (healthPoints - trollDamage) + " health.\n" +
                            "Oh no... he didn't make it.");
                }


            } else if (creatureChoice == 3) {
                System.out.println("Harry is attacked by a Basilisk which deals " + basiliskDamage
                        + " damage.");

                if (healthPoints > basiliskDamage) {
                    System.out.println("Harry ends the battle with " + (healthPoints - basiliskDamage) + " health.\n" +
                            "He survives!");
                } else {
                    System.out.println("Harry ends the battle with " + (healthPoints - basiliskDamage) + " health.\n" +
                            "Oh no... he didn't make it.");
                }

                //considering special creature choice options
            } else if (creatureChoice == 4) {
                input.nextLine();
                System.out.println("Has Harry learned the Patronus charm yet? y/n: ");
                knowsPatronusCharm = input.nextLine().toLowerCase().charAt(0);
                if (knowsPatronusCharm == 'y') {
                    System.out.println("Harry is attacked by a Dementor which deals " + dementorDamage
                            + " damage.");
                    if (healthPoints > dementorDamage) {
                        System.out.println("Harry ends the battle with " + (healthPoints - dementorDamage) + " health.\n" +
                                "He survives!");
                    } else {
                        System.out.println("Harry ends the battle with " + (healthPoints - dementorDamage) + " health.\n" +
                                "Oh no... he didn't make it.");
                    }

                } else if (knowsPatronusCharm == 'n') {
                    System.out.println("Harry suffers the Dementor's Kiss and... it's not pretty. Poor Harry.");
                } else {
                    System.out.println("Invalid input. Choose y/n.");
                }

            } else {
                //output for invalid inputs
                System.out.println("The number you have chosen is " + creatureChoice + "." +
                        " Choose a valid number between 1 - 4: ");
            }


        } else {
            System.out.println("Invalid health point. " +
                    "Your input is " + healthPoints + ". " +
                    "It needs to be between 1 - 100. Run the program again.");
        }
    }
}