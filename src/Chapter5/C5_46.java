package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse string
 *
 * @author Alyxandra Harp
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s1 = input.nextLine();
        System.out.println(("The reversed string is ") + (new StringBuffer(s1).reverse().toString()));
    }
}
