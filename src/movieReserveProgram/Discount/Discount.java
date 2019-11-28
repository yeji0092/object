package movieReserveProgram.Discount;

import movieReserveProgram.Discount.Condition.DiscountCondition;
import movieReserveProgram.Discount.Policy.DiscountPolicy;
import movieReserveProgram.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Discount {
    private List<DiscountCondition> discountConditions = new ArrayList<>();
    private DiscountPolicy discountPolicy;

    public Discount() {
        this.discountPolicy = null;
        this.discountConditions = null;
    }
    public Discount(DiscountCondition ... conditions){
        this.discountPolicy = null;
        this.discountConditions = Arrays.asList(conditions);
    }
    public Discount(DiscountPolicy discountPolicy, DiscountCondition... conditions){
        this.discountPolicy = discountPolicy;
        this.discountConditions = Arrays.asList(conditions);
    }
    /////////////////////////////////////////////////////////////////////////////////////
    public void getDiscountInfo() {
        if(isDiscount()){
            //할인정책 요청
            discountPolicy.getDiscountPolicyInfo();
        }else{
            //할인조건, 할인정책 음슴
        }


    }

    private boolean isDiscount() {
        DiscountCondition discountCondition=null;
        discountCondition.getDiscountCondition();
        if(discountCondition.getDiscountCondition() != null){
            //for()문 돌면서 할인조건 넣기
            return true;
        }
        else
            return false;

    }

    public int getDiscountMovieFee(Screening screening) {
        /*
        Screening
        private Movie movie; //title, fee, discount
        private Date date;
        private int sequence;
        */
        //문제 발생! screening안에 movie있고, movie안에 discount있고, discount안에 discountcondition 존재한다는 모든 사실을 알아야함
        //discount에서 계산하는게 맞는가?
        //그냥 인포들만 반환해서 Screening에서 계산할까?
        List<DiscountCondition> discountConditions = screening.getMovie().getDiscount().getDiscountConditions();
        return 0;
    }

    private List<DiscountCondition> getDiscountConditions() {
        return discountConditions;
    }
}
