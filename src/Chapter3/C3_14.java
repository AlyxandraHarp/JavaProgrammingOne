package Chapter3;

import java.util.Scanner;

/**
 * Program for a coin flip game
 *
 * @author Alyxandra Harp
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess heads or tails (0 or 1): ");
        int guess = input.nextInt();
        int answer = (int) (Math.random() * 2);
        System.out.println("Coin flipped... " + answer);
        if (answer == guess) {
            System.out.println("You are correct!");
        } else if (answer != guess) {
            System.out.println("You are incorrect.");
        }
    }
}
