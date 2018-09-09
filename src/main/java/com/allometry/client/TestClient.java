package com.allometry.client;

import com.allometry.org.model.User;
import org.springframework.web.client.RestTemplate;

public class TestClient {


    public static final String SERVER_URI = "http://localhost:9090/api/adduser/";

    public static void main(String[] args) {
        try{
            testClient();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void testClient(){

        RestTemplate restTemplate = new RestTemplate();
        User emp = new User("sswwswwswsws","saasasas","asasasas");
        restTemplate.postForEntity(SERVER_URI,emp,User.class);
      //  User response = restTemplate.postForObject(SERVER_URI, emp, User.class);
    }
}
