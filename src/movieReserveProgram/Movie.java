package movieReserveProgram;

public class Movie {
    private String title;
    private int fee;


    public Movie(){
        //생성시, 해당 영화의 할인 조건과 할인정책도 넣어야함
    }
    public void getMovieInfo() {
        Discount discount=null;
        discount.getDiscountInfo();
    }
}
