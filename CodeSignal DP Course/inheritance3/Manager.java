package inheritance3;

public class Manager extends Employee {
    // TODO: Add a private field teamSize to Manager
    private int teamSize;
    // TODO: Implement a constructor in Manager that initializes name, age, employeeId, department, and teamSize
    Manager(String name, int age, String employeeID, String department, int teamSize){
        super(name, age, employeeID, department);
        this.teamSize = teamSize;
    }
    // TODO: Create a displayManagerDetails method that calls displayEmployeeDetails() and then prints teamSize
    public void displayManagerDetails(){
        displayEmployeeDetails();
        System.out.println("Team Size: "+teamSize);
    }
}
