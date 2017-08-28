package project.dao;

import project.model.MyProject;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public interface MyProjectDao {
    ArrayList<MyProject> getProjects();

    MyProject getProjectByName(String name);

    void setProjects(ArrayList<MyProject> projects);

    void addProject(MyProject project);

    void clearProjects();
}
