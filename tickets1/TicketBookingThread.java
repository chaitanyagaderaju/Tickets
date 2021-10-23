package threads.tickets;


public class TicketBookingThread extends Thread {
	int ticketstoBook;
	String name;
	TicketCounter TicketCounter;
	public  TicketBookingThread(int ticketstoBook, String name, TicketCounter ticketCounter) {
		
		this.ticketstoBook = ticketstoBook;
		this.name=name;
		this.TicketCounter = ticketCounter;
	}

public void run() {
	TicketCounter.booktickets(name,ticketstoBook);
}
}

