package week4_intro_java;

public class RunningTotal {
    public static void main(String[] args) {

        //write a program that prints the sum of the odd numbers between 1 - 50
        int sum = 0; //accumulator: either called sum or total
        for (int i = 1; i <= 50; i += 2) {
            sum += i;
        }

        System.out.println(sum);
    }

    //write a program that prints the value of 7!(7Factorial)
    int total = 0;


}





