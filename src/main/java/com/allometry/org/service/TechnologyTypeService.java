package com.allometry.org.service;
import com.allometry.org.daoimpl.TechnologyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologyTypeService {

    @Autowired
    private TechnologyTypeRepository technologyTypeRepository;


}
