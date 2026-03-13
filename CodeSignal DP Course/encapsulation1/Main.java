package encapsulation1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        // TODO: Use setName and setAge methods
        person.setName("Bob");
        person.setAge(25);

        // TODO: Print the 'name' and 'age' attributes using the getter methods
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}