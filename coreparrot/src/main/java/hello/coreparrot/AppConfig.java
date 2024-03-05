package hello.coreparrot;

import hello.coreparrot.discount.DiscountPolicy;
import hello.coreparrot.discount.FixDiscountPolicy;
import hello.coreparrot.member.MemberRepository;
import hello.coreparrot.member.MemberService;
import hello.coreparrot.member.MemberServiceImpl;
import hello.coreparrot.member.MemoryMemberRepository;
import hello.coreparrot.order.OrderServiceImpl;
import hello.coreparrot.order.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
//        return null;
    }


    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
