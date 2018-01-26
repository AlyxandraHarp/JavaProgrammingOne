package Chapter4;

import java.util.Scanner;

/**
 * Program to tell college major and year
 *
 * @author Alyxandra Harp
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters... ");
        String major = input.nextLine();
        //There are multiple ways of doing this, but this is one I'm more familiar with.
        if (major.startsWith("M")) {
            if (major.endsWith("1")) {
                System.out.println("Mathematics Freshman");
            } else if (major.endsWith("2")) {
                System.out.println("Mathematics Sophmore");
            } else if (major.endsWith("3")) {
                System.out.println("Mathematics Junior");
            } else if (major.endsWith("4")) {
                System.out.println("Mathematics Senior");
            } else {
                System.out.println("Invalid input");
            }
        } else if (major.startsWith("C")) {
            if (major.endsWith("1")) {
                System.out.println("Computer Science Freshman");
            } else if (major.endsWith("2")) {
                System.out.println("Computer Science Sophmore");
            } else if (major.endsWith("3")) {
                System.out.println("Computer Science Junior");
            } else if (major.endsWith("4")) {
                System.out.println("Computer Science Senior");
            } else {
                System.out.println("Invalid input");
            }
        } else if (major.startsWith("I")) {
            if (major.endsWith("1")) {
                System.out.println("Information Technology Freshman");
            } else if (major.endsWith("2")) {
                System.out.println("Information Technology Sophmore");
            } else if (major.endsWith("3")) {
                System.out.println("Information Technology Junior");
            } else if (major.endsWith("4")) {
                System.out.println("Information Technology Senior");
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
