package movieReserveProgram;

import movieReserveProgram.Discount.Condition.DiscountCondition;
import movieReserveProgram.Discount.Discount;
import movieReserveProgram.Discount.Policy.DiscountPolicy;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Screening {
    /*
    Screening의 책임 : Discount정보 받아서 선택한 상영정보와 일치하는 지 검사 후, 1인 요금 계산해서 반환
     */
    private Movie movie;
    private LocalDate date;
    private LocalTime screeningStartTime;
    private int sequence;

    private Discount movieDiscount;
    private DiscountPolicy discountPolicy;
    private List<DiscountCondition> discountConditions;

    private int screeningFee;

    public Screening(Movie movie, int sequence, LocalDate date, LocalTime screeningStartTime) {
        this.movie = movie;
        this.sequence = sequence;
        this.date = date;
        this.screeningStartTime = screeningStartTime;
    }

    public int calculateScreeningFee() {
        movieDiscount = movie.getMovieDiscountInfo(this.movie);
        discountPolicy = movieDiscount.getDiscountPolicy();
        discountConditions = movieDiscount.getDiscountConditions();

        screeningFee = movie.getFee()
                - getTotalDiscountAmount(discountPolicy, getSatisfiedConditionCount(discountConditions));
        return screeningFee;
    }

    //선택한 상영의 할인조건에 따라 할인금액 계산해서 반환
    private int getTotalDiscountAmount(DiscountPolicy discountPolicy, int count){
        int fee = movie.getFee(); //선택한 영화 요금
        return (discountPolicy.getDiscountAmount(fee)*count);
        //할인 조건 없는 경우, count=0이므로 할인되는 금액은 0원으로 반환된다.
    }

    //선택한 상영이 부합하는 할인조건 개수 반환
    private int getSatisfiedConditionCount(List<DiscountCondition> discountConditions){
        int count=0;

        if(!discountConditions.isEmpty()){ //할인 조건이 존재할 경우
            for (DiscountCondition condition:discountConditions) {
                if(condition.isSatisfiedCondition(this))
                    count++;
            }
            return count;
        }else{ //적용될 할인조건, 정책이 없음
            return 0;
        }
    }

    public boolean isSequence(int sequence) {
        if(this.sequence == sequence)
            return true;
        else return false;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getScreeningStartTime() {
        return screeningStartTime;
    }
}
