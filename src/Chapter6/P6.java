package Chapter6;

import java.util.Scanner;

/**
 * Program to convert currency
 *
 * @author Alyxandra Harp
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;

        System.out.print("How many Euros does a dollar buy? ");
        double euro = input.nextDouble();
        System.out.print("How many Pound Sterling does a dollar buy? ");
        double pound = input.nextDouble();
        System.out.print("How many Yen does a dollar buy? ");
        double yen = input.nextDouble();
        System.out.println("\n--------------------------------------------\n");

        String cont = "";
        do {
            System.out.print("Enter the number of dollars you want to convert: $");
            double curr = input.nextDouble();

            System.out.print("Enter 'E' to buy Euros, 'P' to buy Pounds or 'Y' to buy Yen: ");
            String currtype = input.next().toUpperCase();

            if (currtype.equals("E")) {
                total = convertLoop(curr, euro);
                System.out.printf("For %2.2f dollars, you will be able to buy %2.2f Euros.", curr, total);
            } else if (currtype.equals("P")) {
                total = convertLoop(curr, pound);
                System.out.printf("For %2.2f dollars, you will be able to buy %2.2f Pounds.", curr, total);
            } else if (currtype.equals("Y")) {
                total = convertLoop(curr, yen);
                System.out.printf("For %2.2f dollars, you will be able to buy %2.2f Yen.", curr, total);
            }

            do {
                System.out.println();
                System.out.println("Are there more conversions to perform? ");
                cont = input.next().toUpperCase();
            } while (!cont.equals("YES") && !cont.equals("NO"));

        } while (cont.equals("YES"));

    }

    /**
     * convertLoop Method
     *
     * @param dollars user input
     * @param currencyBeingConverted type of currency
     * @return double exchange rate
     */
    public static double convertLoop(double dollars, double currencyBeingConverted) {

        if (dollars < 100) {
            return 0.90 * dollars * currencyBeingConverted;
        } else {
            return 0.95 * dollars * currencyBeingConverted;
        }
    }
}
