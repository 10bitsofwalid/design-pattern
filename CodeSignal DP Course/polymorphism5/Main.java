package polymorphism5;

public class Main {
    public static void main(String[] args) {
        // TODO: Demonstrate compile-time polymorphism by calling both makeSound methods on an Animal object
        Animal animal = new Animal();
        
        animal.makeSound();
        animal.makeSound("Roar");

        // TODO: Demonstrate runtime polymorphism by creating Dog and Cat objects using Animal references and calling the methods
        
        Dog dog = new Dog();
        dog.makeSound();
        
        Animal cat = new Cat();
        cat.makeSound();
    }
}