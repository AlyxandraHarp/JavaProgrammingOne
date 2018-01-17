package Chapter2;
import java.util.Scanner;
/**
 * Program to find gratuity and total
 *
 * @author Alyxandra Harp
 */


public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        //asks user subtotal and gratuity rate
        //shows gratuity and total
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double sub = input.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double rate = input.nextDouble();
        double grad = (rate / 100) * sub;
        double total = sub + grad;
        System.out.println("The gratuity is $" + grad + " and the total is $" + total);
    }
}
