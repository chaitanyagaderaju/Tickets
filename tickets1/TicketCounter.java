package threads.tickets;

public class TicketCounter  {
int availabletickets =1500;
public synchronized void booktickets(String pname,int requiredtickets) {
	if(requiredtickets<=availabletickets) {
		System.out.println("hi" +" " + pname + "tickets are available");
		availabletickets=availabletickets-requiredtickets;
	}
	else
	System.out.println("hi" + " " + pname + "tickets are not available");
}
}
