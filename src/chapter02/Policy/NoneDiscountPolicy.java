package chapter02.Policy;

import chapter02.Money;
import chapter02.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    /*
    할인 정책이 없는 경우
     */
    @Override
    Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
