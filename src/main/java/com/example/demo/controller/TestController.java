package com.example.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping(value = "/springboot")
public class TestController {

    @RequestMapping(value = "/getUserByGet", method = RequestMethod.GET)
    public String getUserByGet(@RequestParam(value = "userName") String userName) {
        return "Hello " + userName;
    }
}
