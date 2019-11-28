package movieReserveProgram.Discount.Condition;

import movieReserveProgram.Screening;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class PeriodDiscountCondition extends DiscountCondition {
    private DayOfWeek dayOfWeek; //요일
    private LocalDateTime discountStartTime;
    private LocalDateTime discountEndTime;

    public PeriodDiscountCondition(DayOfWeek dayOfWeek, LocalDateTime discountStartTime, LocalDateTime discountEndTime) {
        this.dayOfWeek = dayOfWeek;
        this.discountStartTime = discountStartTime;
        this.discountEndTime = discountEndTime;
    }

    @Override
    public boolean isSatisfiedCondition(Screening screening) {
        screening.getDate();
        return false;
    }
}
