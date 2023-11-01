package study.project.member;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Member {

    Long id;

    @NotEmpty
    String memberId;
    String memberPw;
    String memberName;

    public Member(Long id, String memberId, String memberPw, String memberName) {
        this.id = id;
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberName = memberName;
    }
}
