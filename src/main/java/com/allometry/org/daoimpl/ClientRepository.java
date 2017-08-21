package com.allometry.org.daoimpl;

import com.allometry.org.model.Client;
import com.allometry.org.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  ClientRepository  extends MongoRepository<Client, String> {
}
