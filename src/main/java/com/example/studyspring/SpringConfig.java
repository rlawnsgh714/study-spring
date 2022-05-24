package com.example.studyspring;

import com.example.studyspring.repository.MemberRepository;
import com.example.studyspring.repository.MemoryMemberRepository;
import com.example.studyspring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
