package movieReserveProgram.Discount.Condition;

public class SequenceDiscountCondition extends DiscountCondition {
    private int sequence;

    public SequenceDiscountCondition(int sequence) {
        this.sequence = sequence;
    }
}
