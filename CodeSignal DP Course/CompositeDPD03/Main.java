package CompositeDPD03;

public class Main {
    public static void main(String[] args) {
        // Create instances of Tester
        Tester tester1 = new Tester(300, "Emma Watson", "Lead Tester");
        Tester tester2 = new Tester(301, "Henry Cavill", "Junior Tester");

        // Create an instance of Designer
        Designer designer1 = new Designer(400, "Scarlett Johansson", "Senior Designer");

        // Create an instance of TeamDirectory
        TeamDirectory teamDirectory = new TeamDirectory("Quality Team");

        // Add employees to the teamDirectory
        teamDirectory.addEmployee(tester1);
        teamDirectory.addEmployee(tester2);
        teamDirectory.addEmployee(designer1);

        // Display the teamDirectory employee information
        teamDirectory.displayEmployeeInfo();
    }
}
