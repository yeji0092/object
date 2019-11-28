package movieReserveProgram.Discount.Condition;

import movieReserveProgram.Screening;

public abstract class DiscountCondition {
    public DiscountCondition(){

    }
    public DiscountCondition getDiscountCondition() {
        DiscountCondition discountCondition=null;
        return discountCondition;
    }
    abstract public boolean isSatisfiedCondition(Screening screening);
}
