package movieReserveProgram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Reserve {
    /*
     Reserve의 책임 : 할인적용한 상영을 인원수에 맞춰 계산한 총 요금을 반환
      */
    //reserve 객체 생성 시, <인원수, 영화제목, 상영날짜 및 상영시간 선택>
    private int customer;
    private Movie movie;
    private LocalDate date;
    private LocalTime screeningTime;
    private int sequence;

    private Screening screening;
    private int screeningFee; //선택한 상영의 1인 요금
    private int totalFee; //인원수에 맞게 계산한 최종 영화요금(할인 포함)

    public Reserve(int customer, int sequence, Movie movie, LocalDate date, LocalTime screeningTime){
        this.customer = customer;
        this.sequence = sequence;
        this.movie = movie;
        this.date = date;
        this.screeningTime = screeningTime;
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "인원수=" + customer +
                ", 선택한 영화=" + movie.toString() +
                ", 선택한 날짜=" + date +
                ", 상영 시작 시간=" + screeningTime +
                ", 회차=" + sequence +
                '}';
    }

    public int calculateTotalFee(){
        //인원수랑 screening 객체 안의 정보들 이용해서 해당 영화 요금 계산해서 반환
        screening = new Screening(movie, sequence, date, screeningTime);
        screeningFee = screening.calculateScreeningFee();
        totalFee = screeningFee*customer;
        return totalFee;
    }

}
