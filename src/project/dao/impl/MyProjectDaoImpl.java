package project.dao.impl;

import project.dao.MyProjectDao;
import project.database.MyProjectData;
import project.model.MyProject;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public class MyProjectDaoImpl implements MyProjectDao{

    @Override
    public ArrayList<MyProject> getProjects() {
        return MyProjectData.getProjects();
    }

    @Override
    public MyProject getProjectByName(String name) {
        return MyProjectData.getProjectByName(name);
    }

    @Override
    public void setProjects(ArrayList<MyProject> projects) {
        MyProjectData.setProjects(projects);
    }

    @Override
    public void addProject(MyProject project) {
        MyProjectData.addProject(project);
    }

    @Override
    public void clearProjects() {
        MyProjectData.clearProjects();
    }
}
