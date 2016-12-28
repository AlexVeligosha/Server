package com.veligosha.server.service;

import com.veligosha.server.entity.Activity;
import com.veligosha.server.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Implementation of {@link UserService} interface
 *
 * @author Alex Veligosha
 * @version 1.0
 */

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    ActivityRepository repository;

    public List<Activity> getAll() {
        return repository.findAll();
    }


    public Activity getActivityById(long id) {
        return repository.findOne(id);
    }

    public Activity save(Activity activity) {
        return repository.saveAndFlush(activity);
    }

    public void remove(long id) {
        repository.delete(id);
    }

    public List<Activity> getAllActivityForUser(long userId) {
        List<Activity> list = new LinkedList<Activity>();
        return null;
    }
}
