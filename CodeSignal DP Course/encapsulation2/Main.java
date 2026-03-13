package encapsulation2;

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Person object with a negative age
        Person person = new Person("Alice", -30);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());

        person.setName("Bob");
        person.setAge(25);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
