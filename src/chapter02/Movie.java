package chapter02;

import chapter02.Policy.DefaultDiscountPolicy;
import chapter02.Policy.DiscountPolicy;

import java.time.Duration;

public abstract class Movie {
    private String title; //제목
    private Duration runningTime; //상영시간
    private Money fee; //기본요금
    private DiscountPolicy discountPolicy; //할인 정책

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        /*
        할인 정책이 없는 경우 : DiscountPolicy-> NoneDiscountPolicy
        할인 정책이 있는 경우 : DiscountPolicy-> DefaultDiscountPolicy
                              할인 정책 종류에 따라
                              DefaultDiscountPolicy-> AmountDiscountPolicy
                                                   -> PercentDiscountPolicy
        실행 시, 자동으로 업 캐스팅
        컴파일 시에는 DiscountPolicy에 의존
        실행 시에는 다른 Policy class에 의존할 수도 있음
         */
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

}
