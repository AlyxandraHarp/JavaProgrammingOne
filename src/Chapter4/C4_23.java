package Chapter4;
import java.util.Scanner;
/**
 * Program to create a payroll of an employee
 *
 * @author Alyxandra Harp
 */


public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double pay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fed = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double state = input.nextDouble();

        double gross = hours * pay;
        double fedb = fed * 100;
        double fedw = gross * fed;
        double stateb = state * 100;
        double statew = gross * state;
        double totald = fedw + statew;
        double net = gross - totald;

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $ " + pay);
        System.out.printf("Gross Pay: $ %1.2f\n", gross);
        System.out.println("Deductions:");
        System.out.printf("\t Federal Withholding (" + fedb + "): $ %1.2f\n", fedw);
        System.out.printf("\t State Withholding (" + stateb + "): $ %1.2f\n", statew);
        System.out.printf("\t Total Deductions: $ %1.2f\n", totald);
        System.out.printf("Net Pay: $ %1.2f\n", net);

    }
}
