package threads.tickets;



public class Reservation extends Thread{

	public static void main(String[] args) {
		
			

		TicketCounter TicketCounter = new TicketCounter(); 
		TicketBookingThread t1= new TicketBookingThread(1200 ,"john", TicketCounter);				
		TicketBookingThread t2= new TicketBookingThread(1300 ,"sunil", TicketCounter);	
		
		t1.start();
		t2.start();

	}

}
