package com.allometry.org.daoimpl;

import com.allometry.org.model.Domain;
import com.allometry.org.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


    @Query(value = "{username: ?0, password: ?0, availability : 1}")
    public User findByUsernameAndPassword(String username, String password);

    public List<User> findAll();

}
