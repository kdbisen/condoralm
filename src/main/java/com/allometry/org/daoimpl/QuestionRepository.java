package com.allometry.org.daoimpl;


import com.allometry.org.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {

}
