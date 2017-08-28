package project.model;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/27/2017.
 */
public class Team {
    private String name;
    private ArrayList<Member> members;
    private Member teamLeader;
    private boolean onProject;

    public Team() {
        this.onProject = false;
    }

    public boolean isOnProject() {
        return onProject;
    }

    public void setOnProject(boolean onProject) {
        this.onProject = onProject;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Member> getMembers() {
        if (members.isEmpty()) {
            return null;
        }
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public Member getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(Member teamLeader) {
        this.teamLeader = teamLeader;
    }
}
