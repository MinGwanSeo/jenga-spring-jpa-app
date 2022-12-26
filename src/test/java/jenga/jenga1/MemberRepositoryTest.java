package jenga.jenga1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class MemberRepositoryTest
{
    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
	@Rollback(false)
    public void testMember() throws Exception
    {
        //given
        Member member = new Member();
        member.setUsername("seohyun");

        //when
        Long savedId = memberRepository.save(member);
        Member findMember = memberRepository.find(savedId);

        //then
        assertEquals(findMember.getId(), member.getId());
        assertEquals(findMember.getUsername(), member.getUsername());
        assertEquals(findMember, member);
    }
}
