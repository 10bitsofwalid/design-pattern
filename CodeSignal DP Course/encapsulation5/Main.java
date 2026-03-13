package encapsulation5;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // TODO: Change the 'name' and 'age' attributes using the setter methods instead
        person.setName("Bob");
        person.setAge(25);

        // TODO: Print the 'name' and 'age' attributes using the getter methods instead
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}