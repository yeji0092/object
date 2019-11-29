package movieReserveProgram.Discount;

import movieReserveProgram.Discount.Condition.DiscountCondition;
import movieReserveProgram.Discount.Policy.DiscountPolicy;
import movieReserveProgram.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Discount {
    private List<DiscountCondition> discountConditions = new ArrayList<>();
    private DiscountPolicy discountPolicy;

    public Discount() {
        this.discountPolicy = null;
        this.discountConditions = null;
    }
    public Discount(DiscountPolicy discountPolicy, DiscountCondition... conditions){
        this.discountPolicy = discountPolicy;
        this.discountConditions = Arrays.asList(conditions);
    }

    public List<DiscountCondition> getDiscountConditions() {
        return discountConditions;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }
}
