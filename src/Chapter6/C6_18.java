package Chapter6;

import java.util.Scanner;

/**
 * Program to check password
 *
 * @author Alyxandra Harp
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pass = input.nextLine();

        if (isValidPassword(pass) == true) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    /**
     * isPasswordValid Method
     *
     * @param pass user input
     * @return validPassword to check if password is valid
     */
    public static boolean isValidPassword(String pass) {
        final int lenPas = 8;
        final int minDig = 2;

        boolean validPassword = isLengthValid(pass, lenPas) && isLettersAndDigits(pass) && hasDigits(pass, minDig);
        return validPassword;
    }

    /**
     * isLengthValid Method
     *
     * @param pass user input
     * @param validLength to check length
     * @return pass.length() if password is less than 8
     */
    public static boolean isLengthValid(String pass, int validLength) {
        System.out.println("Your password must contain 8 characters");
        return pass.length() >= 8;
    }

    /**
     * isLetterAndDigits Method
     *
     * @param pass user input
     * @return boolean true or false
     */
    public static boolean isLettersAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (!Character.isLetterOrDigit(pass.charAt(i))) {
                System.out.println("Your password must contain only letters and digits");
                return false;
            }
        }
        return true;
    }

    /**
     * hasDigits Method
     *
     * @param pass
     * @param n
     * @return boolean ture or false
     */
    public static boolean hasDigits(String pass, int n) {
        int counter = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                ++counter;
            }

        }
        if (counter < n) {
            System.out.println("Your password must contain at least two digits");
            return false;
        }
        return true;
    }
}
