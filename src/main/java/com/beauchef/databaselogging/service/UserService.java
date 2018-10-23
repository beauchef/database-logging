package com.beauchef.databaselogging.service;

import com.beauchef.databaselogging.model.User;
import com.beauchef.databaselogging.model.repository.UserRepository;
import com.beauchef.databaselogging.service.exception.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author beauchef on 2018-10-04.
 */
@Slf4j
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getById(long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Could not find user with ID %d.", id)));
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
