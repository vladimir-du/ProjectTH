package project.service.email;

import project.model.MyProject;
import project.model.Team;

/**
 * @author Vladimir on 8/28/2017.
 */
public interface EmailTeamService {
    String sendProjectEmail(Team team, MyProject project);
}
