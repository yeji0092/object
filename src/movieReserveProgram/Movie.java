package movieReserveProgram;

import movieReserveProgram.Discount.Discount;

public class Movie {
    private String title;
    private int fee;
    private Discount discount;

    public Movie(){
        //생성시, 해당 영화의 할인 조건과 할인정책도 넣어야함
    }
    public Movie(String title, int fee, Discount discount) {
        this.title = title;
        this.fee = fee;
        this.discount = discount;
    }
    public int getFee(Screening screening) {
        //Screening과 fee 넘기고 할인적용한 요금 반환받기
        //Screening안에 Movie(title, fee,discount)와 선택한 상영날짜(date) 있음
        return discount.getDiscountMovieFee(screening);
    }
}
