package com.allometry.org.controller;


import com.allometry.org.model.Authentication;
import com.allometry.org.model.User;
import com.allometry.org.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
@Slf4j
@CrossOrigin(origins = "*")
public class LoginController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/register", method = RequestMethod.POST)
    public User register(@RequestBody User user) {

        log.info("register controller" + user.toString());
        return userService.addUser(user);
    }


    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public Authentication login(@RequestBody User user) {
        Authentication authentication;
        log.info("login controller" + user.toString());
        User userr = userService.findByUsernameAndPassword(user.getUsername(),user.getPassword());
        if (userr!=null){
            if(userr.getUsername().equalsIgnoreCase(user.getUsername()) && userr.getPassword().equalsIgnoreCase(user.getPassword())){

                authentication = new Authentication(true,userr);
                return  authentication;
            }else{

                authentication = new Authentication(false,null);
                return  authentication;
            }
        }else {

            authentication = new Authentication(false,null);
            return  authentication;

        }


    }


    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public List<User>  alllogin() {
        log.info("login controller");
        return   userService.fildAll();
    }


    @GetMapping("/api/user")
    public User getUser(){

        return new User("kdbisen", "password","mymail@domain.com");
    }


    @GetMapping("/api/user/{id}")
    public User getUserName(@PathVariable("id")  String id){


        return userService.getUserById(id);
    }

    @RequestMapping(value = "/api/adduser" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public User addUser(@RequestBody final User user) {


        userService.addUser(user);

        return user;
    }


}
