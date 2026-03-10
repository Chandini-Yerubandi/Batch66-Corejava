package in.multithreading;

class bookmyseat{
	int totaltickets=20;
	synchronized void bookSeats(int Seats) {
		
		if(Seats<totaltickets) {
			totaltickets=totaltickets-Seats;
			System.out.println(Seats+" Tickets have been Successfully Booked");
			System.out.println("Reamining available tickets are: "+totaltickets);
		}else {
			System.out.println("Tickets have been sold out");
			System.out.println("The available tickets only: "+totaltickets);
		}
	}
}
public class BookMyTicket extends Thread{
	static bookmyseat bookMySeat;
	int Seats;
	@Override
	
	public void run() {
		bookMySeat.bookSeats(Seats);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookMySeat =new bookmyseat();
		BookMyTicket b=new BookMyTicket();
		b.Seats=8;
		b.start();
		
		BookMyTicket a=new BookMyTicket();
		a.Seats=6;
		a.start();

		
		BookMyTicket c=new BookMyTicket();
		c.Seats=5;
		c.start();//to avoid data inconsistency problem during 3 threads are executing parallelly.to avoid data inconsistency we using synchronized keyword


	}

}
