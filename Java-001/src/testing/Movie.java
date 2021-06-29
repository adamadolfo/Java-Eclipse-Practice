package testing;

public class Movie {
	private int runTime;
	private String director;
	int ticketsLeft;
	
	
	public Movie(int runTime, String director) {
		this.runTime = runTime;
		this.director = director;
		this.ticketsLeft = 5;
	}
	
	public int getTicketsLeft() {
		return this.ticketsLeft;
	}
	
	// override practice
	public void buyTicket() {
		if (getTicketsLeft() > 0) {
			this.ticketsLeft = getTicketsLeft() - 1;
			System.out.println("Sold ticket!");
		} else {
			System.out.println("Sorry! Sold out!");
		}
	}
}
