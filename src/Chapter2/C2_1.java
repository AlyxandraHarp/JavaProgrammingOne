package Chapter2;

import java.util.Scanner;

/**
 * Program to find Fahrenheit
 *
 * @author Alyxandra Harp
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        //fah = (9/5) * cel + 32
        //ask user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for celsius:  ");
        double cel = input.nextDouble();
        double fah = (9.0 / 5) * cel + 32;
        System.out.println(cel + " degrees celsius is " + fah + " degrees in fahrenheit.");

    }
}
