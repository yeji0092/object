package chapter04_modify;

import chapter02.Money;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public Money calcauteFee(int audienceCount){
        switch (movie.getMovieType()) {
            case AMOUNT_DISCOUNT:
               if(movie.isDiscountable(whenScreened, sequence)){
                   return movie.calculateAmountDiscountedFee().times(audienceCount);
               }
                break;
            case PERCENT_DISCOUNT:
                if(movie.isDiscountable(whenScreened, sequence)){
                    return movie.calculatePercentDiscountedFee().times(audienceCount);
                }
                break;
            case NONE_DISCOUNT:
                return movie.calculateNoneDiscountedFee().times(audienceCount);
        }
        return movie.calculateNoneDiscountedFee().times(audienceCount);
    }
}
