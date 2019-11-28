package movieReserveProgram.Discount.Policy;

public class PercentDiscountPolicy extends DiscountPolicy {
    private float discountPercent;

    public PercentDiscountPolicy(float discountPercent) {
        this.discountPercent = discountPercent;
    }
}
