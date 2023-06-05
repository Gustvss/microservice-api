package com.tcser.hrworker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControllerHello {

@GetMapping("/")
public String HelloApi () {
    return ("Hello for my api");
}
    
}
