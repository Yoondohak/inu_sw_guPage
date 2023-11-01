package study.project.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import study.project.member.Member;
import study.project.repository.MemberRepository;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class SignUpController {

    private final MemberRepository memberRepository;

    @GetMapping("/add")
    public String addForm(@ModelAttribute Member member) {
        return "guPage/guPage";
    }

    @PostMapping("/add")
    public String addForm1(@ModelAttribute Member member) {
        return "guPage/guPage";
    }

}
