package com.allometry.org.service;


import com.allometry.org.daoimpl.UserRepository;
import com.allometry.org.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.util.ClassTypeInformation.COLLECTION;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    MongoTemplate mongoTemplate;



    public User findByUsernameAndPassword(String username, String password){
       /* Query query = new Query();
        query.addCriteria(Criteria.where("name").is("Eric"));
        List<User> users = mongoTemplate.find(query, User.class);*/


        Query query =  new Query(Criteria.where("username").is(username).and("password").is(password));

        final User one = mongoTemplate.findOne(query,User.class);
        return one;
        //   return userRepository.findByUsernameAndPassword(username,password);
    }


    public List<User> fildAll(){


        return  userRepository.findAll();
    }

    public User addUser(User user){

       return userRepository.save(user);
    }


    public User getUserById(String id){
        return userRepository.findOne(id);
    }

}
