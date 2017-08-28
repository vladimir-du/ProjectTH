package project.service.impl;

import project.dao.TeamDao;
import project.model.MyProject;
import project.model.Team;
import project.service.TeamService;
import project.service.email.EmailTeamService;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public class TeamServiceImpl implements TeamService{

    private TeamDao teamDao;
    private EmailTeamService emailTeamService;

    @Override
    public ArrayList<Team> getTeams() {
        return teamDao.getTeams();
    }

    @Override
    public Team getTeamByName(String name) {
        return teamDao.getTeamByName(name);
    }

    @Override
    public void setTeams(ArrayList<Team> teams) {
        teamDao.setTeams(teams);
    }

    @Override
    public void addTeam(Team team) {
        teamDao.addTeam(team);
    }

    @Override
    public void clearTeams() {
        teamDao.clearTeams();
    }

    @Override
    public boolean sendEmail(Team team, MyProject project) {
        return !emailTeamService.sendProjectEmail(team, project).isEmpty();
    }


}
