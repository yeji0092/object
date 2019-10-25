package chapter01;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }
    //입장하는 로직
    public void enter(Audience audience){
        /*
        입장 시, 티켓이 필요한 로직은 티켓판매원이 자율적으로 하도록 변경
        Theater에서는 더이상 ticketOffice에 접근하지 못함
        ticketOffice가 ticketSeller 내부에 존재하는 사실을 알지 못함
        =>캡슐화(객체 내부의 세부사항을 감추는 일)
         */
        ticketSeller.sellTo(audience);
    }
}
