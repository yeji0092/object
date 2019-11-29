package movieReserveProgram.Discount.Condition;

import movieReserveProgram.Screening;

import java.time.DayOfWeek;

import java.time.LocalTime;

public class PeriodDiscountCondition extends DiscountCondition {
    private DayOfWeek dayOfWeek; //요일
    private LocalTime discountStartTime;
    private LocalTime discountEndTime;

    public PeriodDiscountCondition(DayOfWeek dayOfWeek, LocalTime discountStartTime, LocalTime discountEndTime) {
        this.dayOfWeek = dayOfWeek;
        this.discountStartTime = discountStartTime;
        this.discountEndTime = discountEndTime;
    }

    @Override
    public boolean isSatisfiedCondition(Screening screening) {
        //요일이 일치해야하고, 상영시작시간이 할인 조건시간 내에 존재해야함
        return screening.getDate().getDayOfWeek().equals(dayOfWeek) &&
                discountStartTime.compareTo(screening.getScreeningStartTime()) <= 0 &&
                discountEndTime.compareTo(screening.getScreeningStartTime()) >= 0;
    }
}
