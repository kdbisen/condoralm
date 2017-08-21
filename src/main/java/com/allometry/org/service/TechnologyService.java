package com.allometry.org.service;
import com.allometry.org.daoimpl.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologyService {

    @Autowired
    private TechnologyRepository technologyRepository;

}
