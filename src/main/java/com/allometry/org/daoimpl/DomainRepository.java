package com.allometry.org.daoimpl;

import com.allometry.org.model.Domain;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by kuldeep.bisen on 7/16/2017.
 */
public interface DomainRepository extends MongoRepository<Domain, String>{

}
