package polymorphism1;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    // TODO: Override the introduce() method here
    // It should print "Hello, I am a student"
    
    public void introduce(){
        System.out.println("Hello, I am a student");
    }
}