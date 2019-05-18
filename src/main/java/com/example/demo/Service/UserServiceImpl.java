package com.example.demo.Service;

//import com.example.demo.dao.UserProfileRepository;
import com.example.demo.dao.UserProfileRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public UserProfileRepository userProfileRepository;

    public List<User> getDucks(){
        return  userRepository.findAll();
    }
}
