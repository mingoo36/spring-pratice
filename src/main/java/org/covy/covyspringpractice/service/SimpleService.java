package org.covy.covyspringpractice.service;

import org.springframework.stereotype.Component;

@Component
public class SimpleService {
        public String getGreetingMessage() {
            return "안녕하세요 심플서비스에용";
        }
}
