package com.allometry.org.service;


import com.allometry.org.daoimpl.AnswerRepository;
import com.allometry.org.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    MongoTemplate mongoTemplate;


    public Answer save(Answer answer){

        return answerRepository.save(answer);
    }

    public List<Answer> getAllAnswerByQueId(String que_id){
        Query query =  new Query(Criteria.where("que_id").is(que_id));

        return  mongoTemplate.find(query,Answer.class);

    }
}
