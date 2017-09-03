package com.allometry.org.service;


import com.allometry.org.daoimpl.ClientRepository;
import com.allometry.org.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    public void addClient(Client client){

        clientRepository.save(client);
    }

    public  Client getCientByName(String clientname){


        return   mongoTemplate.findOne(query(where("client_name").is(clientname)),Client.class);
    }


    public List<Client> getAllClients(){
        return  clientRepository.findAll();
    }
}
