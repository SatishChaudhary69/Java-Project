public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10/0;  // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch the exception and handle it
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // This block always executes
            System.out.println("Finally block executed.");
        }
    }
}
