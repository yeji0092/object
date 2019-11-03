package chapter02.Policy;

import chapter02.Money;
import chapter02.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    /*
    할인 정책이 없는 경우
    implements DiscountPolicy
     */

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
