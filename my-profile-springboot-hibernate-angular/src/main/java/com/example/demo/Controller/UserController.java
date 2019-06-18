package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import com.example.demo.model.RQ.UserRQ;
import com.example.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/names", method= RequestMethod.GET)
    public List<String> getUserNames(){
        return userService.getUserNames();
    }

    @RequestMapping(value = "/{name}", method= RequestMethod.GET)
    public User getUserByName(@PathVariable("name") String name){
        return userService.getUserByName(name);
    }

    @RequestMapping(value = "/create/user", method= RequestMethod.POST)
    public void createUser(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("email") String email,
                           @RequestParam("password") String password){
        UserRQ userRQ = new UserRQ(firstName,lastName,email,password);

        userService.saveUser(userRQ);

    }

}
