package chapter01;

public class Bag {
    /*
    관람객이 소지할 수 있는 품목
    현금, 초대장, 티켓
     */
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) { //현금만 있는 사람
        this(amount,null);
    }

    public Bag(Invitation invitation) { //초대장만 있는 사람
        this(null,invitation);
    }

    public Bag(Long amount, Invitation invitation) { //현금, 초대장 보유한 사람
        this.amount = amount;
        this.invitation = invitation;
    }

    public boolean hasInvitaion(){
        return invitation != null;
    }

    public boolean hasTicket(){
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }
}