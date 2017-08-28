package project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vladimir on 8/27/2017.
 */
public class MyProject {
    String name;
    ArrayList<Team> teams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public void addTeams(Team team){
        this.teams.add(team);
    }

    public void remTeam(Team team){
        for (int i = 0; i < teams.size(); i++) {
            if (this.teams.equals(team)) this.teams.remove(team);
        }
    }

    public void clearTeams(){
        teams.clear();
    }
}
