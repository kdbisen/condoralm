package com.allometry.org.daoimpl;


import com.allometry.org.model.Domain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  TechnologyRepository  extends MongoRepository<TechnologyRepository, String> {
}
