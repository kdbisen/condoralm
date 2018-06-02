package com.allometry.org.service;

import com.allometry.org.daoimpl.CommentRepository;
import com.allometry.org.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentService  {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    public Comment save(Comment comment){
        return commentRepository.save(comment);
    }

    public List<Comment> findAllCommnetsByQueId(String question_id){
        Query query =  new Query(Criteria.where("question_id").is(question_id));

        return  mongoTemplate.find(query,Comment.class);
    }
}
