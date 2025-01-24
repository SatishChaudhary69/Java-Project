import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reverse = 0;
        int originalNumber = number;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the number
        }

        // Display the result
        System.out.println("The reverse of " + originalNumber + " is " + reverse);

        scanner.close();
    }
}
