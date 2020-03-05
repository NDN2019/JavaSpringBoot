package io.project.springboot.services;

import io.project.springboot.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class UserServiceTest {

    UserService userService;
    List<User> users = new ArrayList<>( Arrays.asList(new User(0,"Micheal","Blade",20),
            new User(1,"Micheal","Blade",20)));

    @Before
    public void setup(){
        userService = new UserService();

    }


    @Test
    public void updatdeUserTest(){

        User user = new User(9,"Micheal","Blade",20);

            userService.updatdeUser(0, user);

    }


    @Test
    public  void  del(){
        userService.userDelete(0);


    }







}
