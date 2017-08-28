package project.service.email.impl;

import project.model.MyProject;
import project.model.Team;
import project.service.email.EmailTeamService;

/**
 * @author Vladimir on 8/28/2017.
 */
public class EmailTeamServiceImpl implements EmailTeamService {
    @Override
    public String sendProjectEmail(Team team, MyProject project) {
        return "Dear " + team.getName() +
                " team members, your team has received a new project to work upon!";
    }
}
