package com.allometry.org.daoimpl;

import com.allometry.org.model.Answer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository   extends MongoRepository<Answer, String> {
}
