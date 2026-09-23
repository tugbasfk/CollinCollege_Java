package practice_questions;

public class ch4ForLoops {
    public static void main(String[] args) {

        //write a Loop that prints out the number 0-100

        for (int a = 0; a <= 100; a++) {
            System.out.println(a);
        }

        //write a Loop that prints out the number 5-50
        for (int b = 5; b <= 50; b++) {
            System.out.println(b);
        }

        //write a Loop that prints out the number -12-12
        for (int c = -12; c <= 12; c++) {
            System.out.println(c);
        }

        //write a Loop that prints out only the even numbers from 0 - 50
        for (int d = 0; d <= 50; d += 2) {
            System.out.println(d);
        }

        //write a Loop that prints out only the every third num from 0 - 9
        for (int e = 0; e <= 9; e += 3) {
            System.out.println(e);
        }

        System.out.println("----------------------------------------------------------");

        //write a loop that adds up the numbers from 0 - 9 and prints the result

        int abc = 0;
        for (int f = 0; f < 10; f++) {
            abc += f;
        }
        System.out.println(abc);


        //write a loop that adds up the numbers from 1 - 100 and prints the result

        int def = 0;
        for (int g = 1; g <= 100; g++) {
            def += g;
        }
        System.out.println(def);

        //write a loop that subtracts numbers 1 - 50 from 5050 and prints the result

        int ghi = 5050;
        for(int h = 1; h <= 50; h++){
            ghi -= h;
        }
        System.out.println(ghi);


        //write a loop that adds every 5th num from 1- 100 and prints out the result
        int klm = 0;
        for(int i = 5; i <=100; i+=5){
            klm += i;
        }
        System.out.println(klm);

        //write a loop that subtracts every 3rd num from 5 -65 from 10,000 and prints the result
        int mno = 10000;
        for(int j = 7; j<=65; j+=3){ //7 is the 3rd num in 5 - 65
            mno -= j;
        }
        System.out.println(mno);



















    }
}
