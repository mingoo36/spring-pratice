package org.covy.covyspringpractice.controller;

import org.covy.covyspringpractice.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    private final AnotherController anotherController;

    @Autowired
    public TestController(AnotherController anotherController) {
        this.anotherController = anotherController;
    }

    public void testSetterInjection() {
        // 기존 SimpleService를 새로운 SimpleService로 교체
        SimpleService newSimpleService = new SimpleService();
        anotherController.setSimpleService(newSimpleService);

        // 교체된 SimpleService로 메시지 출력
        anotherController.printGreeting();
    }
}

// @Autowired: 생성자, Setter, 필드 어느곳에서든 Bean주입 지점으로 지정
