package CompositeDPD03;

import java.util.ArrayList;
import java.util.List;

public class TeamDirectory implements Employee {
    private String teamName;
    // TODO: Initialize the teamList
    private List<Employee> teamList;

    // TODO: Initialize the teamName and teamList
    public TeamDirectory(String teamName) {
        this.teamName = teamName;
        this.teamList = new ArrayList<>();
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("Team Directory: " + teamName);
        for (Employee emp : teamList) {
            emp.displayEmployeeInfo();
        }
    }

    // TODO: Implement the method to add employees to the teamList
    public void addEmployee(Employee emp) {
        teamList.add(emp);
    }

    // TODO: Implement the method to remove employees from the teamList
    public void removeEmployee(Employee emp) {
        teamList.remove(emp);
    }
}