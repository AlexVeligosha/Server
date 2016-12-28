package com.veligosha.server.controller;

import com.veligosha.server.entity.Activity;
import com.veligosha.server.entity.Test;
import com.veligosha.server.entity.User;
import com.veligosha.server.repository.ActivityRepository;
import com.veligosha.server.repository.TestRepository;
import com.veligosha.server.repository.UserRepository;
import com.veligosha.server.service.ActivityServiceImpl;
import com.veligosha.server.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/server")
public class ServerController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    ActivityServiceImpl activityService;


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAll();
    }

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    @ResponseBody
    public List<Activity> getAllActivity(){
        return activityService.getAll();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable long id){
        return userService.getUserById(id);
    }
/**
    @RequestMapping(value = "/users/{id}", method = RequestMethod.POST)
    @ResponseBody
    public User saveUser(@RequestBody User user){
        return service.save(user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id){
        service.delete(id);
    }*/
}
