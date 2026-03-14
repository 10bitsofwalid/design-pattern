package polymorphism1;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    // TODO: Override the introduce() method here
    // It should print "Hello, I am a teacher"
    
    public void introduce(){
        System.out.println("Hello, I am a teacher");
    }
}