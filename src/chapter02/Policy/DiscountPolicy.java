package chapter02.Policy;

import chapter02.Money;
import chapter02.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
