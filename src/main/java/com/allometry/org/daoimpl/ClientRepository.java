package com.allometry.org.daoimpl;

import com.allometry.org.model.Client;
import com.allometry.org.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface  ClientRepository  extends MongoRepository<Client, String> {
    /*@Query("{ 'client_name' : ?0 }")
    Client findClientByClientName(String client);*/

    Client findFirstByLocation(String location);
}
