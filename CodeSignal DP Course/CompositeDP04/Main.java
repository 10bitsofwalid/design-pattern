package CompositeDP04;

public class Main {
    public static void main(String[] args) {
        // TODO: Create Analyst instances (e.g., analyst1 and analyst2) with appropriate
        // memberId, name, and role.
        // TODO: Create a TeamLead instance (e.g., lead1) with appropriate memberId,
        // name, and role.
        // TODO: Create a ProjectTeam instance (e.g., projectTeam) with a team name.
        // TODO: Add the Analyst and TeamLead instances to the ProjectTeam instance.
        // TODO: Call the showMemberDetails method on the ProjectTeam instance to
        // display the details of the project team.

        Analyst analyst1 = new Analyst(100, "Alice Johnson", "Senior Analyst");
        Analyst analyst2 = new Analyst(101, "Bob Smith", "Junior Analyst");

        TeamLead lead1 = new TeamLead(200, "Charlie Brown", "Team Lead");

        ProjectTeam projectTeam = new ProjectTeam("Data Analytics Team");
        projectTeam.addMember(analyst1);
        projectTeam.addMember(analyst2);
        projectTeam.addMember(lead1);

        projectTeam.showMemberDetails();
    }
}
