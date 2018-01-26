package Chapter3;

import java.util.Scanner;

/**
 * Program to compare two numbers
 *
 * @author Alyxandra Harp
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first integer: "); //prompts user
        double first = input.nextDouble();
        System.out.print("Enter your next integer: ");
        double second = input.nextDouble(); //Stores int 
        //5-9
        if (first < second) {
            System.out.println("The first number is less than the second.");
        }
        if (first > second) {
            System.out.println("The first number is greater than the second.");
        }
        if (first == second) {
            System.out.println("The first number is equal to the second.");
        }
        if (first >= second) {
            System.out.println("The first number is less than or equal to the second.");
        }
        if (first != second) {
            System.out.println("The first number is not equal to the second.");
        }
        //10 
        if (second == 0) {
            System.out.println("Cannot divide by zero.");
        } else if ((first / second) < 1) {
            System.out.println("Proper fraction.");
        } else {
            System.out.println("Improper fraction.");
        }
        //11
        if (first >= 90) {
            System.out.println("A");
        } else if (first >= 80) {
            System.out.println("B");
        } else if (first >= 70) {
            System.out.println("C");
        } else if (first >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        //12
        if ((second >= 1) && (second <= 100)) {
            System.out.println("In Range.");
        } else {
            System.out.println("Out of Range.");
        }
    }
}
