package project.service;

import project.database.TeamData;
import project.model.MyProject;
import project.model.Team;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public interface TeamService {


    ArrayList<Team> getTeams();

    Team getTeamByName(String name);

    void setTeams(ArrayList<Team> teams);

    void addTeam(Team team);

    void clearTeams();

    boolean sendEmail(Team team, MyProject project);
}
