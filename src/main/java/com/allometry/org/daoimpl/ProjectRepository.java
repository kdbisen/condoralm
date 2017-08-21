package com.allometry.org.daoimpl;


import com.allometry.org.model.Domain;
import com.allometry.org.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  ProjectRepository   extends MongoRepository<Project, String> {

    public List<Project> findById(String id);

}
