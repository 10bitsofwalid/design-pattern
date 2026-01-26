public class student {

    String name = "walid";
    int id = 435;
    double cgpa = 3.50;

    public void display() {
        System.out.println("" + name);
        System.out.println("" + id);
        System.out.println("" + cgpa);
    }

    public static void main(String[] args) {
        student student1 = new student();
        student1.display();
    }
}
