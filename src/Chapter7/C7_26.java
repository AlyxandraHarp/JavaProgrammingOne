package Chapter7;

import java.util.Scanner;

/**
 * Program to compare two lists
 *
 * @author Alyxandra Harp
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items in list1:  ");
        int n1 = input.nextInt();
        int[] list1 = new int[n1];
        System.out.print("Enter the number of items in list2:  ");
        int n2 = input.nextInt();
        int[] list2 = new int[n2];

        System.out.print("Enter list1:  ");
        for (int i = 0; i < n1; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2:  ");
        for (int j = 0; j < n2; j++) {
            list2[j] = input.nextInt();
        }

        if (equals(list1, list2) == true) {
            System.out.println("Two lists are strictly identical.");
        } else {
            System.out.println("Two lists are not strictly identical.");
        }
    }

    /**
     * equals Method
     *
     * @param list1 first list
     * @param list2 second list
     * @return true or false
     */
    public static boolean equals(int[] list1, int[] list2) {

        return java.util.Arrays.equals(list1, list2);
    }
}
