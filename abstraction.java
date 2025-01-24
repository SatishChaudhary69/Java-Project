// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass providing implementation of the abstract method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

public class abstraction{
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Using abstraction
        myDog.makeSound();        // Calls Dog's implementation
        myDog.sleep();            // Calls the concrete method from Animal
    }
}
