package io.project.springboot.controller;

import io.project.springboot.User;
import io.project.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserContoller {

    @Autowired
    private UserService userSevices;

    @RequestMapping("/users")
    public List<User> getUsers(){
        return userSevices.getUsers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users/{id}")
    public User getUser(@PathVariable int id){
        return userSevices.getUser(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User user){
        return userSevices.updatdeUser(user.getId(), user);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public String updateUser(@PathVariable int id){
            return  userSevices.userDelete(id);
    }

}
