package inheritance;

public class Dog extends animal {

    public void makeSound() {
        System.out.println("Dog says woof woof nigga");
    }

    public static void main(String[] args) {
        animal mydog = new Dog();
        mydog.makeSound();

        animal mycat = new cat();
        mycat.makeSound();

    }
}
