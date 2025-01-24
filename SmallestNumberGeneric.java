import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SmallestNumberGeneric {

    // Generic function to find the smallest number in a list
    public static <T extends Comparable<T>> T findSmallest(ArrayList<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("The list cannot be null or empty.");
        }
        return Collections.min(list); // Using Collections.min() to find the smallest
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 numbers:");

        // Input 10 numbers
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        // Find and print the smallest number
        int smallestNumber = findSmallest(numbers);
        System.out.println("The smallest number is: " + smallestNumber);
    }
}
