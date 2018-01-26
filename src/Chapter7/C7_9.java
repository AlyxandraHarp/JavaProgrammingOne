package Chapter7;

import java.util.Scanner;

/**
 * Program to Find smallest number in array
 *
 * @author Alyxandra Harp
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter ten numbers:  ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The minimum number is:  " + min(array));
    }

    /**
     * min Method
     *
     * @param array the input from user
     * @return array[0] first number in array
     */
    public static double min(double[] array) {

        java.util.Arrays.sort(array);
        return array[0];
    }
}
