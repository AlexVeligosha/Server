package com.veligosha.server.controller;

import com.veligosha.server.entity.Test;
import com.veligosha.server.entity.User;
import com.veligosha.server.repository.TestRepository;
import com.veligosha.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/server")
public class ServerController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

/**
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable long id){
        return service.findOne(id);
    }

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
