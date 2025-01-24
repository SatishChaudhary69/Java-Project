public class MultipleCatch {
    public static void main(String[] args) {
        try {
            // Code that may throw multiple exceptions
            int a = 10 / 0; // ArithmeticException
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero!");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Null object!");
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}