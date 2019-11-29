package movieReserveProgram.Discount.Condition;

import movieReserveProgram.Screening;

public abstract class DiscountCondition {
    abstract public boolean isSatisfiedCondition(Screening screening);
}
