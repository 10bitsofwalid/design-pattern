package inheritance;

public class employee extends person {
    int empID;

    public employee(String name, int age, int empID) {
        super(name, age);
        this.empID = empID;
    }

    public void displayempInfo() {
        displayinfo();
        System.out.println("Employee ID: " + empID);
    }

}
