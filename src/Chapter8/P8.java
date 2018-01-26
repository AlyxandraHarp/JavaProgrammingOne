package Chapter8;

import java.util.Scanner;

/**
 * Program to make matrix for sales
 *
 * @author Alyxandra Harp
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ID, day, cont;
        int counterRow = 0, counterCol = 0;
        double[][] matrix = new double[4][5];
        double amount;
        do {
            do {
                System.out.print("Enter the salesman ID as A, B, C, or D:  ");
                ID = input.next();
                ID = ID.toUpperCase();

            } while (!ID.equals("A") && !ID.equals("B") && !ID.equals("B") && !ID.equals("D"));
            if (ID == "B") {
                counterRow += 1;
            } else if (ID == "C") {
                counterRow += 2;
            } else if (ID == "D") {
                counterRow += 3;
            }
            do {
                System.out.print("Enter the day as M, T, W, H, or, F:  ");
                day = input.next();
                day = day.toUpperCase();
            } while (!day.equals("M") && !day.equals("T") && !day.equals("W") && !day.equals("H") && !day.equals("F"));
            System.out.print("Enter the amount of the sale:  ");
            amount = input.nextDouble();

            System.out.print("More data? Enter Y or yes, N for no:  ");
            cont = input.next();
            cont = cont.toUpperCase();
        } while (!cont.equals("Y") && !cont.equals("N"));
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
