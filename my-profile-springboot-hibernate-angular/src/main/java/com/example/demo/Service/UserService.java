package com.example.demo.Service;

import com.example.demo.model.RQ.UserRQ;
import com.example.demo.model.User;
import java.util.List;

public interface UserService {

    List<String> getUserNames();

    User getUserByName(String firstName);

    void saveUser(UserRQ userRQ);


}
