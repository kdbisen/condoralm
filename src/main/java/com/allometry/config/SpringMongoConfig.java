package com.allometry.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;



/**
 * Spring MongoDB configuration file
 *
 */
@Configuration
public class SpringMongoConfig{

	public @Bean
    MongoTemplate mongoTemplate() throws Exception {

		MongoTemplate mongoTemplate =
		    new MongoTemplate(new MongoClient("127.0.0.1"),"allometry");
		return mongoTemplate;

	}

}