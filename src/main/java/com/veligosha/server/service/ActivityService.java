package com.veligosha.server.service;

import com.veligosha.server.entity.Activity;

import java.util.List;

/**
 * Activity service interface
 *
 * @author Alex Veligosha
 * @version 1.0
 */
public interface ActivityService {

    List<Activity> getAll();

    Activity getActivityById(long id);

    Activity save(Activity activity);

    void remove(long id);

    List<Activity> getAllActivityForUser(long userId);
}
