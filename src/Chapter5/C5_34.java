package Chapter5;

import java.util.Scanner;

/**
 * Program to play RockPaperScissors
 *
 * @author Alyxandra Harp
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess, answer;
        int countg = 0, counta = 0;
        do {
            System.out.print("Enter 0, 1, or 2: ");
            guess = input.nextInt();
            answer = (int) (Math.random() * 3);
            switch (guess) {
                case 0:
                    if (answer == 0) {
                        System.out.print("You chose rock. Computer chose rock. ");
                        System.out.println("Draw!");
                    } else if (answer == 1) {
                        counta++;
                        System.out.print("You chose rock. Computer chose paper. ");
                        System.out.println("You lose.");
                    } else if (answer == 2) {
                        countg++;
                        System.out.print("You chose rock. Computer chose scissors. ");
                        System.out.println("You win!");
                    }
                    break;
                case 1:
                    if (answer == 0) {
                        countg++;
                        System.out.print("You chose paper. Computer chose rock. ");
                        System.out.println("You win!");
                    } else if (answer == 1) {
                        System.out.print("You chose paper. Computer chose paper. ");
                        System.out.println("Draw!");
                    } else if (answer == 2) {
                        counta++;
                        System.out.print("You chose paper. Computer chose scissors. ");
                        System.out.println("You lose.");
                    }
                    break;
                case 2:
                    if (answer == 0) {
                        counta++;
                        System.out.print("You chose scissors. Computer chose rock. ");
                        System.out.println("you lose.");
                    } else if (answer == 1) {
                        countg++;
                        System.out.print("You chose scissors. Computer chose paper. ");
                        System.out.println("You win!");
                    } else if (answer == 2) {
                        System.out.print("You chose scissors. Computer chose scissors. ");
                        System.out.println("Draw!");
                    }
                    break;
                default:
                    System.out.println("Invalid guess.");
            }
        } while (countg <= 2 && counta <= 2);
        if (countg > counta) {
            System.out.println("You won more than two times!");
        } else if (counta > countg) {
            System.out.println("The computer won more than two times.");
        }

    }
}
