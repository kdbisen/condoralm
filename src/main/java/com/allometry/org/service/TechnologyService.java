package com.allometry.org.service;
import com.allometry.org.daoimpl.TechnologyRepository;
import com.allometry.org.model.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyService {

    @Autowired
    private TechnologyRepository technologyRepository;


    public  Technology addTechnology(Technology technology){
       return technologyRepository.save(technology);
    }



    public List<Technology>  getAllTechnologies(){

        return technologyRepository.findAll();
    }
}
