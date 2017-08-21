package com.allometry.org.daoimpl;

import com.allometry.org.model.Domain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by kuldeep.bisen on 7/16/2017.
 */
public interface DomainRepository extends MongoRepository<Domain, String>{

    @Query(value = "{domainName: ?0, availability : 1}")
    public List< Domain > findByDomaniNameOnlyAvailables(String sku);




}
