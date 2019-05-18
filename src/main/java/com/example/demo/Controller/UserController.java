package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/get", method= RequestMethod.GET)
    public List<User> getDucks(){
        return userService.getDucks();
    }

}
