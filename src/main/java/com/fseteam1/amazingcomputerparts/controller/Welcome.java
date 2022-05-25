/*
  FSE Cohort - Team Project2
  Amazing Computer Parts Inventory System -Team1
  Class: Welcome - Amazing Computer Parts Service WebSite home/index page
 */
package com.fseteam1.amazingcomputerparts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/amazingcomputerparts/home")
@RestController
public class Welcome {
    //http://localhost:8080/amazingcomputerparts/home/
    @GetMapping("/")
    public String index() {
        return "Welcome to Amazing Computer Parts Service 2022!!";
    }
}
