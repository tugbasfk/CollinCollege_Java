package week1_intro_java;

public class ch02_No4_MealAfterTaxAndTip {

    public static void main(String[] args) {

        //determining coast of a meal after tax and tip are added

        double meal = 88.75;
        double tax = .06;
        double tip = .2;

        double mealTotal;
        double taxPaid;
        double tipPaid;



        taxPaid = meal * tax;
        tipPaid = meal * tip;
        mealTotal = meal + tax + tip;


        System.out.println("Meal is $" + meal);
        System.out.println("Total after tax paid is $" + taxPaid);
        System.out.println("Total after tip added is $" + tipPaid);
        System.out.println("Total bill to pay is $" + mealTotal);









    }
}
