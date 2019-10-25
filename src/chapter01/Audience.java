package chapter01;

public class Audience {
    //관람객 클래스
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    /*
    Bag를 외부에 반환하지 않고 내부에서 직접 접근하여 티켓 구매를 수행하므로
    getBag 메소드 삭제
    Bag에 대한 접근을 캡슐화하여 TicketSeller와 Bag사이의 결합도를 낮춤
     */
    public Long buyTicket(Ticket ticket){
        if(bag.hasInvitaion()){//초대장 소지하고 있는 관람객
            bag.setTicket(ticket);
            return 0L;
            //초대장 삭제하는 로직?
        }else{
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
