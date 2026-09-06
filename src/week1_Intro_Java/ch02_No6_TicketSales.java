package week1_Intro_Java;

import java.util.Scanner;

public class ch02_No6_TicketSales {

    public static void main(String[] args) {

        //calculating total ticket sales using Scanner

        int ClassA = 40;
        int ClassB = 20;
        int ClassC = 8;

        int numSoldTicketsA, numSoldTicketsB, numSoldTicketsC;
        double income;
        Scanner tckt = new Scanner(System.in);


        System.out.println("Enter tickets sold for Class A: ");
        numSoldTicketsA = tckt.nextInt();
        System.out.println("Enter tickets sold for Class B: ");
        numSoldTicketsB = tckt.nextInt();
        System.out.println("Enter tickets sold for Class C: ");
        numSoldTicketsC = tckt.nextInt();

        income = (ClassA * numSoldTicketsA)+
        (ClassB * numSoldTicketsB)+
        (ClassC * numSoldTicketsC);
        System.out.println("Income generated from sold tickets is: $" + income);


    }
}
