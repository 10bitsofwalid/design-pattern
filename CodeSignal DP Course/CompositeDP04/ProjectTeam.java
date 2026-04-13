package CompositeDP04;

import java.util.ArrayList;
import java.util.List;

// TODO: Implement the ProjectTeam class that implements the TeamMember interface and can contain multiple TeamMember objects

// TODO: Declare private variables for teamName (String) and a List of TeamMember objects.

// TODO: Implement a constructor to initialize the teamName and instantiate the list of TeamMember objects.

// TODO: Override the showMemberDetails method to print the team name and iterate over the list of team members, calling their showMemberDetails method.

// TODO: Add methods to add and remove TeamMember instances in/from the list.

import java.util.ArrayList;
import java.util.List;

public class ProjectTeam implements TeamMember {
    private String teamName;
    private List<TeamMember> teamMembers;

    public ProjectTeam(String teamName) {
        this.teamName = teamName;
        this.teamMembers = new ArrayList<>();
    }

    @Override
    public void showMemberDetails() {
        System.out.println("Project Team: " + teamName);
        for (TeamMember member : teamMembers) {
            member.showMemberDetails();
        }
    }

    public void addMember(TeamMember member) {
        teamMembers.add(member);
    }

    public void removeMember(TeamMember member) {
        teamMembers.remove(member);
    }
}