import java.util.Scanner;

/**
 * Unitity class to check user input.
 */
public class Unitity {
    /**
     * A shared object used to read input data from the keyboard for the entire class.
     */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Check if a positive integer is entered from the keyboard.
     * If the entered value is less than 0 or not a number, please re-enter the value.
     *
     * @param msg is information need display in screen.
     * @return a valid positive integer.
     */
    public static int checkUserInputInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String input = scanner.nextLine().trim();
                int number = Integer.parseInt(input);
                if (number > 0) {
                    return number;
                } else {
                    System.err.println("Number must be greater than 0. Please enter again.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Value of matrix is digit.");
            }
        }
    }

    /**
     * Check if a integer (form 1 to 4) is entered from the keyboard.
     * If the entered value is less than 1 or greater than 4 or not a number, please re-enter the value.
     *
     * @return a valid positive integer.
     */
    public static int checkUserInputSwitchCase(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String input = scanner.nextLine().trim();
                int number = Integer.parseInt(input);

                if (number >= 1 && number <= 4) {
                    return number;
                } else {
                    System.err.println("Number must be 1-4. Please enter again.");
                }

            } catch (NumberFormatException e) {
                System.err.println("Invalid format! Please enter again.");
            }
        }
    }
}
