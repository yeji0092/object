package movieReserveProgram;

import movieReserveProgram.Discount.Condition.DiscountCondition;
import movieReserveProgram.Discount.Discount;
import movieReserveProgram.Discount.Policy.DiscountPolicy;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Screening {
    private Movie movie;
    private Date date;
    private int sequence;

    private Discount movieDiscount;
    private DiscountPolicy discountPolicy;
    private List<DiscountCondition> discountConditions;

    private int screeningFee;

    public Screening(Movie movie, Date date, int sequence) {
        this.movie = movie;
        this.date = date;
        this.sequence = sequence;
    }
    /*
    Screening 정보 Movie로 넘기고, Movie에서 Discount로 넘기고
    Discount에서 상영시간과 일치하는 할인조건 검사 후 1인 요금 계산하여 반환
    */
    public int calculateScreeningFee() {
        //반환된 정보들과, screening이 가지고 있는 상영의 정보들 일치 여부
        movieDiscount = movie.getMovieDiscountInfo(this.movie);
        discountPolicy = movieDiscount.getDiscountPolicy();
        discountConditions = movieDiscount.getDiscountConditions();

        //메소드
        int count=0;
        if(isExistDiscount(discountConditions)){ //할인 조건이 존재할 경우
            //할인조건이 순서조건일 경우
            //할인조건이 기간조건일 경우
            //for문 돌면서 조건 일치할때마다 counting
            count = 10;
        }else{ //적용될 할인조건, 정책이 없음
            return movie.getFee();
        }

        //할인정책에 따라 계산하는 함수호출
        //위의 counting 전달
        screeningFee = movie.getFee() - getTotalDiscountAmount(discountPolicy, count);
        return screeningFee;
    }

    private int getTotalDiscountAmount(DiscountPolicy discountPolicy, int count){ //할인금액
        int fee = movie.getFee(); //선택한 영화 요금
        return (discountPolicy.getDiscountAmount(fee)*count);
    }
    private boolean isExistDiscount(List<DiscountCondition> discountConditions) {
        if(!discountConditions.isEmpty()){ //할인조건이 비어있지 않다면
            return true;
        }else
            return false;
    }


    public Movie getMovie(){
        return movie;
    }

    public boolean isSequence(int sequence) {
        if(this.sequence == sequence)
            return true;
        else return false;
    }

    public Date getDate() {
        return date;
    }

}
