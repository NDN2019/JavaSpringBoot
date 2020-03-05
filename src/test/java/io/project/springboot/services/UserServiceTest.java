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

import static org.junit.Assert.assertEquals;

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
    public void getUsers() {

        List<User> usersList = new ArrayList<>( Arrays.asList(new User(0,"Micheal","Blade",20),
                new User(1,"Micheal","Blade",20)));
        assertEquals(users, usersList);
    }


    @Test
    public void updatdeUserTest(){

        User user = new User(9,"Micheal","Blade",20);

            userService.updatdeUser(0, user);

            assertEquals("User updated", userService.updatdeUser(0, user));

    }


    @Test
    public  void  del(){
        assertEquals("User deleted",userService.userDelete(0));
    }







}
