package Chapter3;

import java.util.Scanner;

/**
 * Program to tell if a number is divisible by 5 and 6
 *
 * @author Alyxandra Harp
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:  ");
        int number = input.nextInt();
        boolean div = false;
        if ((number % 5 == 0) && (number % 6 == 0)) {
            div = true;
        } else {
            div = false;
        }
        System.out.println("Is " + number + " divisible by 5 and 6? " + div);
        if ((number % 5 == 0) || (number % 6 == 0)) {
            div = true;
        } else {
            div = false;
        }
        System.out.println("Is " + number + " divisiable by 5 or 6? " + div);
        if ((number % 5 == 0) ^ (number % 6 == 0)) {
            div = true;
        } else {
            div = false;
        }
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + div);
    }
}
