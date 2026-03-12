package access_modifiers;

public class Employee extends Person {
    private String EmpID;

    public Employee(String nationalID, String EmpID) {
        super(nationalID);
        this.EmpID = EmpID;
    }

    public void displayInfo() {
        System.out.println("National Id: " + nationalID);
        System.out.println("Employee Id: " + EmpID);
    }
}
