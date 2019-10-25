package chapter01;

public class TicketSeller {
    //티켓 판매원
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /*
    티켓 판매원이 직접 자율적으로 티켓을 판매하도록 sellTo 메소드에 로직 추가
    ticketOffice를 외부에 반환하지 않고 내부에서 직접 접근하여 티켓판매를 수행하므로
    getTicketOffice 메소드 삭제
    ticketOffice에 대한 접근을 캡슐화(객체 내부의 세부사항을 감추는 일)하여 객체(theater)와 객체(ticketOffice) 사이의 결합도를 낮춤
     */
    public void sellTo(Audience audience){
        if(audience.getBag().hasInvitaion()){ //초대장 있는 관람객
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().setTicket(ticket);
            //관람객 초대장 삭제하는 로직도 필요
        }else{
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
