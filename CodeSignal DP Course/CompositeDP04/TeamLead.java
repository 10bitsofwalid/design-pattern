package CompositeDP04;

// TODO: Implement the TeamLead class that provides a base implementation of the TeamMember interface

// TODO: Declare private variables for memberId (long), name (String), and role (String).

// TODO: Implement a constructor to initialize these variables.

// TODO: Override the showMemberDetails method to print the memberId, name, and role.

public class TeamLead implements TeamMember {
    private long memberId;
    private String name;
    private String role;

    public TeamLead(long memberId, String name, String role) {
        this.memberId = memberId;
        this.name = name;
        this.role = role;
    }

    @Override
    public void showMemberDetails() {
        System.out.println(memberId + " " + name + " " + role);
    }
}