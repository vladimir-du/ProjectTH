package project.model;

/**
 * @author Vladimir on 8/28/2017.
 */
public class Member {
    private String name;
    private String teamName;
    private boolean leader;
    private int age;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLeader() {
        return leader;
    }

    public void setLeader(boolean leader) {
        this.leader= leader;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
