package io.project.springboot.repository;

import io.project.springboot.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository  extends MongoRepository<User, String>  {

    public User findByFirstName(String firstName);
    public List<User> findByLastName(String lastName);

}
