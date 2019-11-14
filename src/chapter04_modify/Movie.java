package chapter04_modify;

import chapter02.Money;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public MovieType getMovieType() {
        return movieType;
    }

    /////////////////////////////////////////////////////////////////////
    //할인 정책에 따른 요금 계산
    public Money calculateAmountDiscountedFee(){ //금액할인 정책일 경우
        if(movieType != MovieType.AMOUNT_DISCOUNT){
            throw new IllegalArgumentException();
        }
        return fee.minus(discountAmount);
    }
    public Money calculatePercentDiscountedFee(){ //비율할인 정책일 경우
        if(movieType != MovieType.PERCENT_DISCOUNT){
            throw new IllegalArgumentException();
        }
        return fee.minus(fee.times(discountPercent));
    }
    public Money calculateNoneDiscountedFee(){ //할인 정책 없을 경우
        if(movieType != MovieType.NONE_DISCOUNT){
            throw new IllegalArgumentException();
        }
        return fee;
    }
    ///////////////////////////////////////////////////////////////////
    //할인 여부를 판단하는 로직
    public boolean isDiscountable(LocalDateTime whenScreened, int sequence){
        for(DiscountCondition condition: discountConditions){
            if(condition.getType() == DiscountConditionType.PERIOD){
                if(condition.isDiscountable(whenScreened.getDayOfWeek(), whenScreened.toLocalTime())) {
                    return true;
                }
            }else{
                if(condition.isDiscountable(sequence)){
                    return true;
                }
            }
        }
        return false;
    }

}
