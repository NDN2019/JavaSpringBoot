package io.project.springboot.services;

import io.project.springboot.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class UserService {

    UserService(){}
    List<User> users = new ArrayList<>( Arrays.asList(new User(0,"Micheal","Blade",20),
            new User(1,"Micheal","Blade",20)));

    public List<User> getUsers() {
        return users;
    }

    public User getUser(int id){
        return users.stream().filter(u -> u.getId() == id).findFirst().get();
    }

    public String updatdeUser(int id, User user){

        users.stream().filter(x-> x.getId() ==id)
                .map(x -> {
                    x.setId(user.getId());
                    x.setAge(user.getAge());
                    x.setLastName(user.getLastName());
                    x.setFirstName(user.getFirstName());
                return x;
                });


        return "User updated";




    }

    public  String addUser(User user){

        if(Optional.ofNullable(user).isPresent()){
            users.add(user);
            return "200";
        }
        return "Adding user failed";
    }

    public String userDelete(int id)
    {
        users.removeIf( x -> x.getId() == id);

        return "User deleted";
    }





}
