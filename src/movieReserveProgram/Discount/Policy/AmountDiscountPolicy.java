package movieReserveProgram.Discount.Policy;

public class AmountDiscountPolicy implements DiscountPolicy {
    private int discountAmount;

    public AmountDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public int getDiscountAmount(int fee) {
        return discountAmount;
    }
}
