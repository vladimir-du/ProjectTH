package project.dao.impl;

import project.dao.TeamDao;
import project.database.TeamData;
import project.model.Team;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public class TeamDaoImpl implements TeamDao{
    @Override
    public ArrayList<Team> getTeams() {
        return TeamData.getTeams();
    }

    @Override
    public Team getTeamByName(String name) {
        return TeamData.getTeamByName(name);
    }

    @Override
    public void setTeams(ArrayList<Team> teams) {
        TeamData.setTeams(teams);
    }

    @Override
    public void addTeam(Team team) {
        TeamData.addTeam(team);
    }

    @Override
    public void clearTeams() {
        TeamData.clearTeams();
    }
}
