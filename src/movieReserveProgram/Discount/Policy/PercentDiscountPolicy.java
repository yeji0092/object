package movieReserveProgram.Discount.Policy;

public class PercentDiscountPolicy implements DiscountPolicy {
    private float discountPercent;

    public PercentDiscountPolicy(float discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public int getDiscountAmount(int fee) {
        return (int)(fee*discountPercent);
    }
}
