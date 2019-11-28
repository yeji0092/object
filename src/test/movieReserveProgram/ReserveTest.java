package movieReserveProgram;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReserveTest {

    @Test
    void reservation() throws ParseException {
        //Movie객체들 만들기
        Movie avatar = new Movie();
        //Reserve 객체만들면서 상영과 인원수 선택
        Reserve reserve = new Reserve(3, 10, avatar,
                new SimpleDateFormat("yyyy-mm-dd hh:mm").parse("2019-11-30 11:30"));
        //calculateTotalFee() 호출하여 총 영화값 계산
        reserve.calculateTotalFee();

        //영화정보 출력하는 함수?
        //선택한 상영 정보 출력하는 함수?
        //totalFee 값도 출력
    }
}