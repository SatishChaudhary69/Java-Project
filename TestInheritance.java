class Animal1 {
    void eat() {
        System.out.println("eating");
    }
}
class Dog1 extends Animal1 {
    void bark() {
        System.out.println("barking");
    }
}
class cat extends Animal1 {
    void meow() {
        System.out.println("Meowing");
    }
}
public class TestInheritance {
    public static void main(String []args) {
        cat c = new cat();
        c.meow();
        c.eat();
    }
}