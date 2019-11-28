package movieReserveProgram.Discount;

import movieReserveProgram.Discount.Condition.DiscountCondition;
import movieReserveProgram.Discount.Policy.DiscountPolicy;
import movieReserveProgram.Screening;

import java.util.ArrayList;

public class Discount {
    private ArrayList<DiscountCondition> discountConditions;
    private DiscountPolicy discountPolicy;




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
       return 0;
    }
}
