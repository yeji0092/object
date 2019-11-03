package chapter02.Policy;

import chapter02.Condition.DiscountCondition;
import chapter02.Money;
import chapter02.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount; //할인요금

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
