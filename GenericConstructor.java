// Generic class
class Container<T> {
    private T value;

    // Generic constructor
    public <U extends T> Container(U initialValue) {
        this.value = initialValue;
        System.out.println("Generic Constructor: Initialized with value of type " + initialValue.getClass().getSimpleName());
    }

    // Getter method
    public T getValue() {
        return value;
    }

    // Setter method
    public void setValue(T value) {
        this.value = value;
    }

    // Method to display the value
    public void displayValue() {
        System.out.println("Value: " + value);
    }
}

public class GenericConstructor {
    public static void main(String[] args) {
        // Using Container with Integer
        Container<Number> intContainer = new Container<>(123); // Pass an Integer
        intContainer.displayValue();

        // Using Container with Double
        // Container<Number> doubleContainer = new Container<>(45.67); // Pass a Double
        //doubleContainer.displayValue();

        // Using Container with String (Type mismatch will cause a compile-time error)
        // Container<Number> stringContainer = new Container<>("Hello"); // Uncommenting this line will result in an error
    }
}
