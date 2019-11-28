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
    public int getFee() {
        return fee;
    }

    public Discount getMovieDiscountInfo(Movie movie) {
        return movie.discount;
    }
}
