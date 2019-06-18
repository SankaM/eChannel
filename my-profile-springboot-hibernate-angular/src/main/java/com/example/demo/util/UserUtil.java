package com.example.demo.util;

import com.example.demo.model.RQ.UserRQ;
import com.example.demo.model.User;

public final class UserUtil {

    public UserUtil() {

    }

    public static User getUserFromUserRQ(UserRQ userRQ){
        User user = new User();
        user.setFirstName(userRQ.getFirstName());
        user.setLastName(userRQ.getLastName());
        user.setEmail(userRQ.getEmail());
        user.setPassword(userRQ.getPassword());
        return user;
    }
}
