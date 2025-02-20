package org.covy.covyspringpractice.controller;

import org.covy.covyspringpractice.service.SimpleService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class AnotherController {

    private SimpleService simpleService;

    // Setter 주입
    @Autowired
    public void setSimpleService(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    public void printGreeting() {
        System.out.println("AnotherController (Setter Injection): " + simpleService.getGreetingMessage());
    }
}
