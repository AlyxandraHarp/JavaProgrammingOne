package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate tax, tip, and total for a meal
 *
 * @author Alyxandra Harp
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        //ask meal, drink, dessert... total
        //tax 10%, tip 15%... final total
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of meal:  $");
        double meal = input.nextDouble();
        System.out.print("Enter price of drink:  $");
        double drink = input.nextDouble();
        System.out.print("Enter price of dessert:  $");
        double dessert = input.nextDouble();
        double subtotal = meal + drink + dessert;

        System.out.println(""); //leaviing this blank
        System.out.println("Meal:  $" + meal);
        System.out.println("Drink:  $" + drink);
        System.out.println("Dessert:  $" + dessert);
        System.out.println("Subtotal:  $" + subtotal);

        double tax = (subtotal * .1);
        double tip = (subtotal + tax) * .15;
        System.out.println("Tax : $" + tax);
        System.out.println("Tip: $" + tip);

        double total = subtotal + tax + tip;
        System.out.println("Total:  $" + total);

    }
}
