package com.allometry.org.daoimpl;

import com.allometry.org.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kuldeep.bisen on 7/15/2017.
 */

@Repository
public interface TeamRepository extends MongoRepository<Team, String> {


}
