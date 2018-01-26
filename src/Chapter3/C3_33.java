package Chapter3;

import java.util.Scanner;

/**
 * Program to check weight and price of packages
 *
 * @author Alyxandra Harp
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price of package 1: ");
        double packw1 = input.nextDouble();
        double packp1 = input.nextDouble();
        System.out.print("Enter weight and price of package 2: ");
        double packw2 = input.nextDouble();
        double packp2 = input.nextDouble();

        double totalp1;
        double totalp2;
        totalp1 = packp1 / packw1;
        totalp2 = packp2 / packw2;
        if (totalp1 > totalp2) {
            System.out.println("Package 2 is better.");
        } else if (totalp1 < totalp2) {
            System.out.println("Package 1 is better.");
        } else if (totalp1 == totalp2) {
            System.out.println("Both packages have the same price.");
        }
    }
}
