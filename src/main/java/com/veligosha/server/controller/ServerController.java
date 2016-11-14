package com.veligosha.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Controller
@RequestMapping("/server")
public class ServerController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getValue(ModelMap model){
        return "My string";
    }
}
