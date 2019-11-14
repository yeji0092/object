package chapter04;

import chapter02.Money;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Movie movie = screening.getMovie();

        boolean discountable = false;
        for (DiscountCondition condition : movie.getDiscountConditions()) { //DiscountCondition에 대해 할인 가능 여부 확인하는 for문
            if (condition.getType() == DiscountConditionType.PERIOD) { //기간조건일 경우
                discountable =
                        condition.getStartTime().compareTo(screening.getWhenScreened()) <= 0 &&
                                condition.getEndTime().compareTo(screening.getWhenScreened()) >= 0;
            } else { //순서조건일 경우
                discountable = condition.getSequence() == screening.getSequence();
            }

            if (discountable) {
                break;
            }
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Money fee;
        if (discountable) { //할인여부 확인 뒤, 할인 정책에 따라 예매 요금 계산하는 구문
            Money discountAmount = Money.ZERO;
            switch (movie.getMovieType()) {
                case AMOUNT_DISCOUNT:
                    discountAmount = movie.getDiscountAmount();
                    break;
                case PERCENT_DISCOUNT:
                    discountAmount = movie.getFee().times(movie.getDiscountPercent());
                    break;
                case NONE_DISCOUNT:
                    discountAmount = Money.ZERO;
                    break;
            }

            fee = movie.getFee().minus(discountAmount).times(audienceCount);
        } else {
            fee = movie.getFee();
        }
        return new Reservation(customer, screening, fee, audienceCount);

    }


}
