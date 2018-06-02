package com.allometry.org.service;

import com.allometry.org.daoimpl.QuestionRepository;
import com.allometry.org.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;


    public Question save(Question question){

        return  questionRepository.save(question);
    }

    public List<Question> getAllQuestion(){

        return  questionRepository.findAll();
    }

    public Question findQuestion(String questionid){

        return  questionRepository.findOne(questionid);
    }
}
