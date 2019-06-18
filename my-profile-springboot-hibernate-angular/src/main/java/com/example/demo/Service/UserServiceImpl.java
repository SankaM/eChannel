package com.example.demo.Service;

//import com.example.demo.dao.UserProfileRepository;
import com.example.demo.dao.UserProfileRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.model.RQ.UserRQ;
import com.example.demo.model.User;
import com.example.demo.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public UserProfileRepository userProfileRepository;

    public List<User> getDucks(){
        return  userRepository.findAll();
    }

    @Override
    public List<String> getUserNames() {
        List<User> users = userRepository.findAll();
        List<String> names = users.stream().filter((user)->user.getId() >= 2).map((user -> user.getFirstName())).collect(Collectors.toList());
        return names;
    }

    @Override
    public User getUserByName(String firstName) {
        User user = userRepository.findByFirstName(firstName);
        return user;
    }

    @Override
    public void saveUser(UserRQ userRQ) {
        User user = UserUtil.getUserFromUserRQ(userRQ);
        user = userRepository.save(user);
        System.out.println("saved successfully");
    }
}
