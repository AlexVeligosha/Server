package com.veligosha.server.service;

import com.veligosha.server.entity.User;

import java.util.List;

/**
 * User service interface.
 *
 * @author Alex Veligosha
 * @version 1.0
 */
public interface UserService {

    List<User> getAll();

    User getUserById(long id);

    User save(User user);

    void remove(long id);


}
