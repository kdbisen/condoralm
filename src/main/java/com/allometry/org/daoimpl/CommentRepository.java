package com.allometry.org.daoimpl;

import com.allometry.org.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
}
