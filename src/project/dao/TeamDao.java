package project.dao;

import project.database.TeamData;
import project.model.Team;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public interface TeamDao {

    public  ArrayList<Team> getTeams();

    public  Team getTeamByName(String name);

    public void setTeams(ArrayList<Team> teams);

    public void addTeam(Team team);

    public void clearTeams();
}
