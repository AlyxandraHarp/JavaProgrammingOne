
package Chapter8;

/**
 * Method to count hours for every employee
 *
 * @author Alyxandra Harp
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from line prompt
     */
    public static void main(String[] args) {
        int[][] hours = {{2, 4, 3, 4, 5, 8, 8}, {7, 3, 4, 3, 3, 4, 4},
        {3, 3, 4, 3, 3, 2, 2}, {9, 3, 4, 7, 3, 4, 1}, {3, 5, 4, 3, 6, 3, 8}, {3, 7, 4, 8, 3, 8, 4}, {6, 3, 5, 9, 2, 7, 9}};
        String[] top = {"Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat"};
        System.out.print("          \t");
        for (int column = 0; column < top.length; column++) {
            System.out.print(top[column] + "\t");
        }
        System.out.println();

        for (int row = 0; row < hours.length; row++) {
            System.out.print("Employee " + row + ":\t");
            for (int column = 0; column < hours[row].length; column++) {
                System.out.print(hours[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
