package movieReserveProgram;

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
        discountCondition.getDiscount();
        if(discountCondition.getDiscount() != null){
            //for()문 돌면서 할인조건 넣기
            return true;
        }
        else
            return false;

    }
}
