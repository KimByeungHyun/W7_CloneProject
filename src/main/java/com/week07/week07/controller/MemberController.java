package com.week07.week07.controller;

import com.week07.week07.dto.GlobalResDto;
import com.week07.week07.dto.request.LoginReqDto;
import com.week07.week07.dto.request.MemberReqDto;
import com.week07.week07.dto.request.idCheckDto;
import com.week07.week07.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    //아이디 체크
    @PostMapping("/member/idCheck")
    public GlobalResDto<?> idCheck(@RequestBody idCheckDto idCheckDto){
        return memberService.idCheck(idCheckDto);
    }

    //회원가입
    @PostMapping("/member/signup")
    public GlobalResDto<?> signup(@RequestBody MemberReqDto memberReqDto){
        return memberService.signup(memberReqDto);
    }

    //로그인
    @PostMapping("/member/login")
    public GlobalResDto<?> login(@RequestBody @Valid LoginReqDto loginReqDto, HttpServletResponse response){
        return memberService.login(loginReqDto,response);
    }
}
