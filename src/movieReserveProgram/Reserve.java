package movieReserveProgram;

import java.util.Date;

public class Reserve {
    //reserve 객체 생성 시, <인원수, 영화제목, 상영날짜, 상영시간 선택>
    private int customer;
    private Date date;
    private int fee;

    public Reserve(){

    }

    public int Reservation(){
        int fee=0;
        Screening screening = new Screening();
        screening.getScreening();
        return fee;
    }

}
