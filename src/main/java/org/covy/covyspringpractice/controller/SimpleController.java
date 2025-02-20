package org.covy.covyspringpractice.controller;

import org.covy.covyspringpractice.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller// 스프링 MVC 구조에서 컨트롤러 역할을 하는 Bean
public class SimpleController {

    // 필드 주입 방법
    @Autowired
    private SimpleService simpleService;

    public void printGreeting() {
        // 의존성이 주입된 SimpleService 사용
        String message = simpleService.getGreetingMessage();
        System.out.println("SimpleController: "+ message);
    }
}

// 의존성 주입은 필요한 물건을 배달 받는 것 이라고 생각하면 됨
// @Autowired: 필요한 Bean을 스프링이 자동으로 주입하도록 하는 어노테이션
// @Controller: 스프링 MVC 구조에서 컨트롤러 역할을 담당함을 표시하는 어노테이션
// 필드 주입 방법: 클래스의 필드에 바로 @Autowired를 붙여 의존성을 주입받는 방식
