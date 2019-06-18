package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void testDoub() {
      double x = 1.0;

    }

    @Test
    public void contextLoads() {
        User user1 = new User();
        user1.setId(1);
        user1.setName("hi");
        user1.setPondId(40);
        user1.setSpeciesId(30);

        User user2 = new User();
        user2.setId(2);
        user2.setName("hids");
        user2.setPondId(14);
        user2.setSpeciesId(15);

        User user3 = new User();
        user3.setId(3);
        user3.setName("hi");
        user3.setPondId(30);
        user3.setSpeciesId(15);

        User user4 = new User();
        user4.setId(4);
        user4.setName("hi");
        user4.setPondId(10);
        user4.setSpeciesId(15);

        List response = new ArrayList<User>();
        response.add(user1);
        response.add(user2);
        response.add(user3);
        response.add(user4);

//        Collections.sort(response, new Comparator<User>() {
//            public int compare(User d1, User d2){
//                return user1.getPondId() - user2.getPondId();
//            }
//        });

//        response=  (List) response.stream().sorted().collect(Collectors.toList());
//
//        response.stream().forEach((x)-> System.out.println(x.toString()));
    }

}
