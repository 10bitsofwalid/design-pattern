package inheritance1;

public class Student extends Person {
    private String major;

    // TODO: Modify the constructor to include the major of the student
    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    // TODO: Create a displayMajor() method to display the student's major
    public void displayMajor(){
        System.out.println("Major: "+major);
    }
}