package org.covy.covyspringpractice.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MemberService {
    // RDB 대신 해시맵에 데이터를 저장하는 방식으로 실습 진행
    private final Map<String, String> memberStorage = new HashMap<>();

    // 회원 생성
    public void createMember(String name) {
        // Map에 key=value로 저장
        memberStorage.put(name, "회원 정보: " + name);
        System.out.println("MemberService: 회원 '" + name + "'이(가) 생성되었습니다.");
    }

    // 회원 정보 조회
    public String getMemberInfo(String name) {
        // 저장된 값이 없다면 null 또는 "존재하지 않는 회원" 등의 메시지를 반환하도록 처리
        return memberStorage.getOrDefault(name, "존재하지 않는 회원입니다.");
    }
}
