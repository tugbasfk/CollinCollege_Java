package week1_Intro_Java;

public class ch02_No3_EastCoastSales {
    public static void main(String[] args) {

        //determining east coast sales

        int companySales = 46000000;
        double totalSales;

        totalSales = 0.64;

        int overallSale = (int) (companySales * totalSales);
        System.out.println("The East Coast Division will have $" + overallSale + " in sales.");
    }
}
