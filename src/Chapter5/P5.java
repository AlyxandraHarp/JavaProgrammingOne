package Chapter5;

import java.util.Scanner;

/**
 * Program to count number of votes
 *
 * @author Alyxandra Harp
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yes = 0, no = 0, inva = 0, total = 0, quit = 0;
        while (quit == 0) {
            System.out.print("Enter 'Y' to vote yes, 'No' to vote no, or 'Q' to quit voting: ");
            String vote = input.nextLine();
            vote = vote.toUpperCase();
            char v1 = vote.charAt(0);
            switch (v1) {
                case 'Y':
                    yes++;
                    break;
                case 'N':
                    no++;
                    break;
                case 'Q':
                    quit++;
                    break;
                default:
                    inva++;
                    System.out.print("INVALID CODE: ");
            }
        }
        total = yes + no + inva;
        System.out.println("Yes votes: " + yes);
        System.out.println("No votes: " + no);
        System.out.println("Invalid votes: " + inva);
        System.out.println("Total votes: " + total);
    }
}
