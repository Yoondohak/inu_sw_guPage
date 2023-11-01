package study.project.repository;

import org.springframework.stereotype.Component;
import study.project.member.Member;

import java.util.*;

@Component
public class MemberRepository {

    Map<Long, Member> store = new HashMap<>();

    Long id = 0L;

    public Member save(String memberId, String memberPw, String memberName) {
        ++id;
        Member member = new Member(id, memberId, memberPw, memberName);
        store.put(id, member);
        return member;
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public Optional<Member> findByMemberId(String memberId) {
        return findAll().stream()
                .filter(m -> m.getMemberId().equals(memberId)).findFirst();
    }
}
