package com.allometry.org.daoimpl;

import com.allometry.org.model.Department;
import com.allometry.org.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  DepartmentRepository  extends MongoRepository<Department, String> {
}
