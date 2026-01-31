package inheritance;

public class manager extends employee {
    String designation;

    public manager(String name, int age, int empID, String designation) {
        super(name, age, empID);
        this.designation = designation;
    }

    public void display() {
        displayempInfo();
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        manager manager1 = new manager("walid", 21, 435, "developer");

        manager1.display();
    }

}
