package testing;

public class HorrorMovie extends Movie {
	private int scariness;
	
	public HorrorMovie(int scariness, int runTime, String director) {
		super(runTime, director);
		this.scariness = scariness;
	}

	@Override
	public void buyTicket() {
		// TODO Auto-generated method stub
		if (getTicketsLeft() > 0) {
			this.ticketsLeft = getTicketsLeft() - 1;
			System.out.println("Sold ticket! Very Scary!");
		} else {
			System.out.println("lucky! Sold out!");
		}
//		super.buyTicket();
	}
	
//	}
}
