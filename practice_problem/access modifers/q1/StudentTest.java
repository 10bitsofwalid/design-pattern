public class StudentTest {
    public static void main(String[] args) {
        Student stud1 = new Student("walid", 101, 3.50);

        System.out.println("Name: " + stud1.getName());
        System.out.println("ID: " + stud1.getId());
        System.out.println("Cgpa: " + stud1.getCgpa());
    }
}
