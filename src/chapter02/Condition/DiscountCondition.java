package chapter02.Condition;

import chapter02.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
