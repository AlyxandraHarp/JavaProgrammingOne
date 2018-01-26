package Chapter7;

import java.util.Scanner;

/**
 * Program to find average and display array
 *
 * @author Alyxandra Harp
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read:  ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        arrayInput(n, numbers, input);
        averageCall(numbers);
        System.out.println("The average is...  " + averageCall(numbers));
        System.out.print("The contents of the array: ");
        arrayCall(numbers);
    }

    /**
     * arrayInput Method
     *
     * @param n number of items in array
     * @param numbers array input
     * @param input Scanner user input
     */
    public static void arrayInput(int n, int[] numbers, Scanner input) {
        System.out.print("Enter " + n + " elements:  ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
    }

    /**
     * averageCall Method
     *
     * @param numbers array input
     * @return average number
     */
    public static double averageCall(int... numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avg = sum / numbers.length;
        return avg;
    }

    /**
     * arrayCall Method
     *
     * @param numbers shows content of array
     */
    public static void arrayCall(int... numbers) {

        System.out.println(java.util.Arrays.toString(numbers));
    }

}
