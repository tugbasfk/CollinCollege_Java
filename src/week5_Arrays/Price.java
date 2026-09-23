package week5_Arrays;

import java.util.Scanner;
import java.util.Arrays;


public class Price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] prices = new double[4];
      /*  for(int i =0; i < 5; i++){
            System.out.println("Enter price: " + (i+1) + ": ");
            prices[i] = input.nextDouble();
            => not convenient to sout anything useful other than hash code*/
        System.out.println(prices.toString());
        }

    }


