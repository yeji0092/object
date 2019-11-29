package movieReserveProgram.Discount.Condition;

import movieReserveProgram.Screening;

public interface DiscountCondition {
    boolean isSatisfiedCondition(Screening screening);
}
