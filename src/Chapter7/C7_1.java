package Chapter7;

import java.util.Scanner;

/**
 * Program to pair scores with letter grades
 *
 * @author Alyxandra Harp
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students:  ");
        int num = input.nextInt();
        int[] numarray = new int[num];
        String letter = "";

        System.out.print("Enter scores:  ");
        for (int i = 0; i < num; i++) {
            numarray[i] = input.nextInt();
        }
        int max = numarray[0];
        for (int i = 0; i < numarray.length; i++) {
            if (numarray[i] > max) {
                max = numarray[i];
            }
        }
        for (int i = 0; i < numarray.length; i++) {
            if (numarray[i] >= max - 10) {
                letter = "A";
            } else if (numarray[i] >= max - 20) {
                letter = "B";
            } else if (numarray[i] >= max - 30) {
                letter = "C";
            } else if (numarray[i] >= max - 40) {
                letter = "D";
            } else {
                letter = "F";
            }

            System.out.println("Student " + i + " score is " + numarray[i] + " and grade is " + letter);
        }
    }
}
