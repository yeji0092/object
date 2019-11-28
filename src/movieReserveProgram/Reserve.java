package movieReserveProgram;

import java.time.LocalDateTime;
import java.util.Date;

public class Reserve {
    //reserve 객체 생성 시, <인원수, 영화제목, 상영날짜 및 상영시간 선택>
    private int customer;
    private Movie movie;
    private Date date;

    private Screening screening;
    private int screeningFee; //선택한 상영의 1인 요금
    private int totalFee; //인원수에 맞게 계산한 최종 영화요금(할인 포함)

    public Reserve(int customer, Movie movie, Date date){
        this.customer = customer;
        this.movie = movie;
        this.date = date;
    }

    public int calculateTotalFee(){
        //인원수랑 screening 객체 안의 정보들 이용해서 해당 영화 요금 계산해서 반환
        screening = new Screening(movie, date);
        screeningFee = screening.calculateScreeningFee();
        totalFee = screeningFee*customer;
        return totalFee;
    }

}
