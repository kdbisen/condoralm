package com.allometry;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MongodbAtlas {

    public static void main(String[] args) {
        MongoClientURI uri = new MongoClientURI(
                "mongodb://kdbisen:rajpal420@condorcluster0-shard-00-00-hbeic.mongodb.net:27017,condorcluster0-shard-00-01-hbeic.mongodb.net:27017,condorcluster0-shard-00-02-hbeic.mongodb.net:27017/condor?ssl=true&replicaSet=CondorCluster0-shard-0&authSource=admin&connectTimeoutMS=300000&socketTimeoutMS=300000");

        MongoDatabase database;
        try (MongoClient mongoClient = new MongoClient(uri)) {

            database = mongoClient.getDatabase("condor");
        }

        database.createCollection("employee");
        log.info("ASASA");
    }

}
