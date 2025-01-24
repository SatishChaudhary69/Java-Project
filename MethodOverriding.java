
// Parent class
class Animals {
    // Method to be overridden
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class
class Dogs extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animals myAnimal = new Animals(); // Create an Animal object
        myAnimal.makeSound();           // Calls the parent class method

        Animal myDog = new Dog();       // Create a Dog object as an Animal reference
        myDog.makeSound();              // Calls the overridden method in the Dog class
    }
}