package com.allometry.org.service;

import com.allometry.org.daoimpl.VoteRepository;

import com.allometry.org.model.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;
    @Autowired
    MongoTemplate mongoTemplate;

    public void castVote(Vote vote){



        voteRepository.save(vote);
    }

    public boolean isVoteAlreadyByUserForPerticularQuestion(String que_id, String user_id){

        Query query =  new Query(Criteria.where("que_id").is(que_id).and("user_id").is(user_id));
        System.out.println(query.toString());

        long votes =  mongoTemplate.count(query, Vote.class);

        System.out.println(votes);

        if(votes  > 0) {
            return  true;
        } else {
            return  false;
        }

    }

    public int getUpVoteByQueId(String que_id){

        Query query =  new Query(Criteria.where("que_id").is(que_id).and("vote_up").is(true));


       return  mongoTemplate.find(query, Vote.class).size();


    }
    public int getDownByQueId(String que_id){

        Query query =  new Query(Criteria.where("que_id").is(que_id).and("vote_down").is(true));


        return mongoTemplate.find(query, Vote.class).size();

    }
}
