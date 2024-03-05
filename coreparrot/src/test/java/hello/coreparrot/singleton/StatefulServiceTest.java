package hello.coreparrot.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class StatefulServiceTest {
    
    @Test
    void statefulServiceSingleton() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);
        
        //ThreadA: A사용자 10000원 주문
        int userAprice = statefulService1.order("userA", 10000);
        //ThreadB: B사용자 20000원 주문
        int userBprice = statefulService2.order("userB", 20000);

        System.out.println("userAprice = " + userAprice);
        System.out.println("userBprice = " + userBprice);
    }
    
    static class TestConfig {
        
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}
