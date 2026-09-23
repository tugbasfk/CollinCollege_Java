package week4_intro_java;

public class booleanMethods {
    public static void main(String[] args) {
        boolean isValid = true;
    }

    //this method takes a parameter called value and return
    // whether or no value is in the range 0 - 100
    public static boolean isValid(int value) {
        boolean check;

        if (value >= 0 && value <= 100) {
            check = true;
        } else {
            check = false;

        }
        return check;
    }
}

//this method takes an int parameter and returns true if that value is prime or false if not
//prime num is only divisible by itself and 1

