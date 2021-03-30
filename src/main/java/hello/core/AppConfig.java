package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//순수 자바 코드
//public class AppConfig {
//
////    public MemberService memberService() {
////        return new MemberServiceImpl(new MemoryMemberRepository());
////    }
////
////    public OrderService orderService(){
////        return new OrderServiceImpl(
////                new MemoryMemberRepository()
////                , new FixDiscountPolicy());
////    }
//
//
//    //역할과 구현을 한눈에  Refactoring
//    public MemberService memberService() {
//        return new MemberServiceImpl(memberRepository());
//    }
//
//    private MemoryMemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
//
//    public OrderService orderService(){
//        return new OrderServiceImpl(memberRepository(), discountPolicy());
//    }
//
//    public DiscountPolicy discountPolicy(){
////        return new FixDiscountPolicy();
//        return new RateDiscountPolicy();
//    }
//}


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
    public OrderService orderService(){
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
