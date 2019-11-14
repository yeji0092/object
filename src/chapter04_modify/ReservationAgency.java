package chapter04_modify;

import chapter02.Money;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Money fee = screening.calcauteFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);

    }
}
