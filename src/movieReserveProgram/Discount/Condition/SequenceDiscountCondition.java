package movieReserveProgram.Discount.Condition;

import movieReserveProgram.Screening;

public class SequenceDiscountCondition implements DiscountCondition {
    private int sequence;

    public SequenceDiscountCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedCondition(Screening screening) {
        return screening.isSequence(sequence);
    }
}
