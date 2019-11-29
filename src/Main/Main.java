package Main;

import movieReserveProgram.Discount.Condition.PeriodDiscountCondition;
import movieReserveProgram.Discount.Condition.SequenceDiscountCondition;
import movieReserveProgram.Discount.Discount;
import movieReserveProgram.Discount.Policy.AmountDiscountPolicy;
import movieReserveProgram.Discount.Policy.PercentDiscountPolicy;
import movieReserveProgram.Movie;
import movieReserveProgram.Reserve;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    static Movie frozen2;
    static Movie blackMoney;
    static Movie findMe;

    public static void main(String args[])throws Exception{
        initMovie();

        Reserve reserve = new Reserve(2, 10, frozen2 , LocalDate.of(2019,12,26), LocalTime.of(18,0));
        System.out.println("===========================================================================================================================");
        System.out.println("선택한 상영정보\n=>"+reserve.toString());
        System.out.println("할인 적용된 총 금액 = "+reserve.calculateTotalFee());
        System.out.println("===========================================================================================================================");

    }
    public static void initMovie(){
        frozen2 = new Movie("겨울왕국2", 10000,
                new Discount(new AmountDiscountPolicy(800),
                        new SequenceDiscountCondition(1),
                        new SequenceDiscountCondition(10),
                        new PeriodDiscountCondition(DayOfWeek.MONDAY,LocalTime.of(10,0),LocalTime.of(11,59)),
                        new PeriodDiscountCondition(DayOfWeek.THURSDAY,LocalTime.of(18,0),LocalTime.of(20,59))));

        blackMoney = new Movie("블랙머니",12000,
                new Discount(new PercentDiscountPolicy(0.1f),
                        new SequenceDiscountCondition(2),
                        new PeriodDiscountCondition(DayOfWeek.THURSDAY,LocalTime.of(10,0),LocalTime.of(13,59))));

        findMe = new Movie("나를 찾아줘",10000,new Discount());
    }
}
