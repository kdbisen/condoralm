package com.allometry.org.Controller;


import com.allometry.org.model.Authentication;
import com.allometry.org.model.Domain;
import com.allometry.org.model.User;
import com.allometry.org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public Authentication login(@RequestBody User user) {
        Authentication authentication = null;
        System.out.println("login controller"+user.toString());
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
        System.out.println("login controller");
     return   userService.fildAll();
    }


@GetMapping("/api/user")
    public User getUser(){

        return new User("kdbisen", "password","mymail@domain.com");
}


    @RequestMapping(value = "/api/adduser" ,method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public User addUser(@RequestBody  User user){


        userService.addUser(user);
        System.out.println("#####################"+user.toString());
        return user;
    }


}
