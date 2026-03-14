package polymorphism1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // TODO: Add the introduce() method here
    // It should print "Hello, I am a person"
    public void introduce(){
        System.out.println("Hello, I am a person");
    }
}