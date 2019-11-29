package movieReserveProgram;

import movieReserveProgram.Discount.Discount;

public class Movie {
    private String title;
    private int fee;
    private Discount discount;

    public Movie(String title, int fee, Discount discount) {
        this.title = title;
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "영화제목='" + title + '\'' +
                ", 영화요금=" + fee +
                '}';
    }

    public int getFee() {
        return fee;
    }

    public Discount getMovieDiscountInfo(Movie movie) {
        return movie.discount;
    }
}
