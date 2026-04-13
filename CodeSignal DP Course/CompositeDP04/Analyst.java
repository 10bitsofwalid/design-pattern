package CompositeDP04;

// TODO: Implement the Analyst class that provides a base implementation of the TeamMember interface

// TODO: Declare private variables for memberId (long), name (String), and role (String).

// TODO: Implement a constructor to initialize these variables.

// TODO: Override the showMemberDetails method to print the memberId, name, and role.

public class Analyst implements TeamMember {
    private long memberId;
    private String name;
    private String role;

    public Analyst(long memberId, String name, String role) {
        this.memberId = memberId;
        this.name = name;
        this.role = role;
    }

    @Override
    public void showMemberDetails() {
        System.out.println(memberId + " " + name + " " + role);
    }
}