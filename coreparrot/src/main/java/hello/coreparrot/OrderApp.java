package hello.coreparrot;

import hello.coreparrot.member.Grade;
import hello.coreparrot.member.Member;
import hello.coreparrot.member.MemberService;
import hello.coreparrot.order.Order;
import hello.coreparrot.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(1L, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.getDiscountPrice = " + order.getDiscountPrice());
    }


}
