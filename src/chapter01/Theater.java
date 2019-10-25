package chapter01;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }
    //입장하는 로직
    public void enter(Audience audience){
        if(audience.getBag().hasInvitaion()){ //초대장 있는 관람객
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
            //초대장을 없애주는 로직은?
        }else{ //초대장 없는 관람객-> 돈주고 티켓 사야함
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
