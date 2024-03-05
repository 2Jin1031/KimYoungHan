package hello.coreparrot.discount;

import hello.coreparrot.member.Member;

public interface DiscountPolicy {

    default int discount(Member member , int price) {
        return 0;
    }
}
