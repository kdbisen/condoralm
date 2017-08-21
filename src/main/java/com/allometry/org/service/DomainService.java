package com.allometry.org.service;

import com.allometry.org.daoimpl.DomainRepository;
import com.allometry.org.model.Domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kuldeep.bisen on 7/16/2017.
 */
@Service
public class DomainService {

    @Autowired
    private DomainRepository domainRepository;

    public void addDomain(Domain domain){

        domainRepository.save(domain);

    }
    public List<Domain> getAllDomain(){

        return domainRepository.findAll();
    }
}
