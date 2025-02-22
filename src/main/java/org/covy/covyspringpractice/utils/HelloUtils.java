package org.covy.covyspringpractice.utils;

import org.springframework.stereotype.Component;

@Component
public class HelloUtils {

    public String makeHelloMessage(String name) {
        return "안녕하세요, " + name + "님!";
    }
}
