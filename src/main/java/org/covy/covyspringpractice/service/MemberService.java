package org.covy.covyspringpractice.service;

import org.covy.covyspringpractice.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {

    private MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void createMember(String name) {
        memberRepository.createMember(name);
        System.out.println("MemberService: 회원 '" + name + "' 생성 로직 실행 완료.");
    }

    public String getMemberInfo(String name) {
        return memberRepository.findMember(name);
    }

}
