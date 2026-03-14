package polymorphism1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Student("Alice", 30);
        Person person2 = new Teacher("Bob", 25);

        // TODO: Call the introduce() method for the Student object
        person1.introduce();

        // TODO: Call the introduce() method for the Teacher object
        person2.introduce();
    }
}