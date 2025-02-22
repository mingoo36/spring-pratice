package org.covy.covyspringpractice.service;

import org.springframework.stereotype.Component;

@Component
public class SimpleService {
        public String getGreetingMessage() {
            return "안녕하세요 심플서비스에용";
        }
}

// Bean이란?
// 스프링 컨테이너가 생성부터 소멸까지 관리하는 객체

// @Component: 스프링이 해당클래스는 Bean으로 등록하도록 지시하는 어노테이션
