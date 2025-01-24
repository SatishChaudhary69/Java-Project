import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check for non-negative numbers
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // Using long to handle large results

            // Calculate factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the result
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        scanner.close();
    }
}
