package org.covy.covyspringpractice.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberRepository {

    private final Map<String, String> memberMap = new HashMap<>();

    public void createMember(String name) {
        memberMap.put(name, "회원 정보: " + name);
    }

    public String findMember(String name) {
        return memberMap.getOrDefault(name, "존재하지 않는 회원입니다.");
    }
}
