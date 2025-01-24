import java.util.Scanner;

public class LargestNumberGeneric {

    // Generic function to find the largest among three numbers
    public static <T extends Comparable<T>> T findLargest(T num1, T num2, T num3) {
        T largest = num1; // Assume num1 is the largest initially
        if (num2.compareTo(largest) > 0) {
            largest = num2; // Update largest if num2 is greater
        }
        if (num3.compareTo(largest) > 0) {
            largest = num3; // Update largest if num3 is greater
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.println("Enter three numbers:");
        System.out.print("Number 1: ");
        Double num1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        Double num2 = scanner.nextDouble();
        System.out.print("Number 3: ");
        Double num3 = scanner.nextDouble();

        // Find the largest number using the generic function
        Double largest = findLargest(num1, num2, num3);

        // Display the largest number
        System.out.println("The largest number is: " + largest);

    }
}
