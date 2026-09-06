
package week1_Intro_Java;

import javax.swing.*;
import java.util.Scanner;

public class ch02_No5_Scanner_JOption {

    public static void main(String[] args) {

        //averaging 3 scores from a golf game using JOptionPane
        int score1;
        int score2;
        int score3;
        double TotalScoreAverage;
        String input;

        input = JOptionPane.showInputDialog("Enter your score: ");
        score1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter your score: ");
        score2 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter your score: ");
        score3 = Integer.parseInt(input);

        TotalScoreAverage = (score1 + score2 + score3) / 3.0;
        System.out.println("your average score is: " + TotalScoreAverage);

        System.out.println("------------------------------------------------------");


        //averaging 3 scores from a golf game using Scanner

        int score4;
        int score5;
        int score6;
        double average;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your score for the first game: ");
        score4 = scnr.nextInt();
        System.out.println("Enter your score for the second game: ");
        score5 = scnr.nextInt();
        System.out.println("Enter your score for the third game: ");
        score6 = scnr.nextInt();

        average = (score4 + score5 + score6) / 3.0;
        System.out.println("your average is: " + average);






    }
}
