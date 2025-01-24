public class OneDimensionalArrayExample {
    public static void main(String[] args) {
        // Declaring and initializing a one-dimensional array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements using index
        System.out.println("First element: " + numbers[0]); // Output: 10
        System.out.println("Third element: " + numbers[2]); // Output: 30

        // Using a loop to iterate over the array
        System.out.println("\nArray elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
