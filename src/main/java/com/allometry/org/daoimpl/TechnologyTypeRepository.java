package com.allometry.org.daoimpl;


import com.allometry.org.model.Domain;
import com.allometry.org.model.TechnologyType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  TechnologyTypeRepository  extends MongoRepository<TechnologyType, String> {
}
