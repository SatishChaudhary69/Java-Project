class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Call the method with two integers
        System.out.println("Sum of two integers: " + calc.add(5, 10));

        // Call the method with three integers
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));

        // Call the method with two doubles
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));
    }
}