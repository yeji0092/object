package movieReserveProgram.Discount.Policy;

public class AmountDiscountPolicy extends DiscountPolicy {
    private int discountAmount;

    public AmountDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }
}
