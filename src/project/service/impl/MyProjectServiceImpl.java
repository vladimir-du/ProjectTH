package project.service.impl;

import project.dao.MyProjectDao;
import project.model.MyProject;
import project.service.MyProjectService;

import java.util.ArrayList;

/**
 * @author Vladimir on 8/28/2017.
 */
public class MyProjectServiceImpl implements MyProjectService{

    private MyProjectDao myProjectDao;

    @Override
    public ArrayList<MyProject> getProjects() {
        return myProjectDao.getProjects();
    }

    @Override
    public MyProject getProjectByName(String name) {
        return myProjectDao.getProjectByName(name);
    }

    @Override
    public void setProjects(ArrayList<MyProject> projects) {
        myProjectDao.setProjects(projects);
    }

    @Override
    public void addProject(MyProject project) {
        myProjectDao.addProject(project);
    }

    @Override
    public void clearProjects() {
        myProjectDao.clearProjects();
    }
}
