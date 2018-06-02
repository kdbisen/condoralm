package com.allometry.org.daoimpl;

import com.allometry.org.model.Vote;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VoteRepository  extends MongoRepository<Vote, String> {
}
