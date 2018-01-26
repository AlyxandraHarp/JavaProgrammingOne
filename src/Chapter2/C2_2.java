package Chapter2;

import java.util.Scanner;

/**
 * Program to find area and volume of cylinder
 *
 * @author Alyxandra Harp
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        //ask rad and len
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a cylinder:  ");
        double rad = input.nextDouble();
        System.out.print("Enter the length:  ");
        double len = input.nextDouble();
        double area = rad * rad * 3.14;
        double vol = area * len;
        System.out.println("The area is " + area + " and the volume is " + vol);
    }
}
