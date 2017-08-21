package com.allometry.org.service;
import com.allometry.org.daoimpl.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignationService {

    @Autowired
    private DesignationRepository designationRepository;

}
