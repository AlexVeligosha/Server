package com.veligosha.server.service;

import com.veligosha.server.entity.User;
import com.veligosha.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the {@link UserService} interface
 *
 * @author Alex Veligosha
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    public List<User> getAll() {
        return repository.findAll();
    }

    public User getUserById(long id) {
        return repository.findOne(id);
    }

    public User save(User user) {
        return repository.saveAndFlush(user);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
