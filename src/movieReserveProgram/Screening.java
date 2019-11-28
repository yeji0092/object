package movieReserveProgram;

import java.time.LocalDateTime;
import java.util.Date;

public class Screening {
    private Movie movie;
    private Date date;
    private int sequence;

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
        //Movie로 넘길 책임 : 해당 영화의 할인정보가 포함된 요금을 내놔라
        //할인정보 비교하기 위해서 Screening 전체를 넘겨서 date와 비교한다.
        //Movie에서 반환할 값 : 할인 적용된 영화요금
        return movie.getFee(this); //movie로 정보 그대로 넘김
    }

    public Movie getMovie(){
        return movie;
    }

}
