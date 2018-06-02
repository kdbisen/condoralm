package com.allometry.org.service;
import com.allometry.org.daoimpl.ProjectRepository;
import com.allometry.org.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

@Autowired
    private ProjectRepository projectRepository;

    public void save(Project project){

        projectRepository.save(project);

    }

    public List<Project> getAllProjects(){

        return  projectRepository.findAll();
    }
}
