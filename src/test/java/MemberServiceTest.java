import org.covy.covyspringpractice.repository.MemberRepository;
import org.covy.covyspringpractice.service.MemberService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MemberServiceTest {

    @Test
    void testCreateAndGetMember() {
        // given
        MemberRepository memberRepository = new MemberRepository();
        MemberService memberService = new MemberService(memberRepository);

        // when
        memberService.createMember("홍길동");
        String info = memberService.getMemberInfo("홍길동");

        // then
        assertEquals("회원 정보: 홍길동", info);
    }

    @Test
    void testGetNonExistentMember() {
        // given
        MemberRepository memberRepository = new MemberRepository();
        MemberService memberService = new MemberService(memberRepository);

        // when
        String info = memberService.getMemberInfo("아무개");

        // then
        assertEquals("존재하지 않는 회원입니다.", info);
    }
}
