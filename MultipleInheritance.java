
// Interface 1
interface Animal2 {
    void eat();
}

// Interface 2
interface Mammal {
    void giveBirth();
}

// Class implements both interfaces
class Dog2 implements Animal2, Mammal {
    public void eat() {
        System.out.println("The dog eats.");
    }

    public void giveBirth() {
        System.out.println("The dog gives birth to puppies.");
    }
}

public class MultipleInheritance{
    public static void main(String[] args) {
        Dog2 myDog = new Dog2();
        myDog.eat();        // From Animal interface
        myDog.giveBirth();  // From Mammal interface
    }
}