package Chapter4;

import java.util.Scanner;

/**
 * Program to compare two bids
 *
 * @author Alyxandra Harp
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name of first bidder: ");
        String firn = input.next();
        System.out.print("Enter hours of work first bidder requires: ");
        int hoursf = input.nextInt();
        System.out.print("Enter first bidder charges per hour: ");
        double chargef = input.nextDouble();

        System.out.print("Enter name of second bidder: ");
        String secn = input.next();
        System.out.print("Enter hours of work second bidder requires: ");
        int hourss = input.nextInt();
        System.out.print("Enter second bidder charges per hour: ");
        double charges = input.nextDouble();

        double costf = hoursf * chargef;
        double costs = hourss * charges;

        if (costf < costs) {
            System.out.printf("\nWinner is %s with a total cost $ %.2f", firn, costf);
        } else if (costs < costf) {
            System.out.printf("\nWinner is %s with a total cost $ %.2f", secn, costs);
        } else if ((costf == costs) && (hoursf < hourss)) {
            System.out.printf("\nWinner is %s with a total cost $ %.2f and %d hours ", firn, costf, hoursf);
        } else if ((costs == costf) && (hourss < hoursf)) {
            System.out.printf("\nWinner is %s with a total cost $ %.2f and %d hours ", secn, costs, hourss);
        } else if ((costs == costf) && (hourss == hoursf)) {
            System.out.printf("\n%s , %s", firn, secn + "\nBoth bids are indentical.");
            System.out.printf("\nHours: %d, %d ", hoursf, hourss);
            System.out.printf("\nCost per hour: $ %.2f, %.2f", chargef, charges);
            System.out.printf("\nTotal cost: $ %.2f, %.2f ", costf, costs);
        }
    }
}
