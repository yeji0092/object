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
//            discountPolicy.getDiscountPolicyInfo();
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

    public List<DiscountCondition> getDiscountConditions() {
        return discountConditions;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }
}
