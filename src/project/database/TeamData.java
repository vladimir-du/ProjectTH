package project.database;

import project.model.Team;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public class TeamData {
    private static ArrayList<Team> teams = new ArrayList<>();

    public static  ArrayList<Team> getTeams(){
        return TeamData.teams;
    }

    public static Team getTeamByName(String name){
        for (int i = 0; i < teams.size(); i++) {
            if(teams.get(i).getName().equals(name)){
                return teams.get(i);
            }
        }
        return null;
    }

    public static void setTeams(ArrayList<Team> teams){
        TeamData.teams = teams;
    }

    public static void addTeam(Team team){
        TeamData.teams.add(team);
    }

    public static void clearTeams(){
        teams.clear();
    }

}
