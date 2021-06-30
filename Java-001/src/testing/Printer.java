package testing;

public class Printer {

	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	
	public Printer(int tonerLevel, boolean duplex) {
		if (tonerLevel >= 0 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			this.tonerLevel = 100;
		}
		this.pagesPrinted = 0;
		this.duplex = duplex;
	}
	public int getTonerLevel() {
		return tonerLevel;
	}
	public int getPagesPrinted() {
		return pagesPrinted;
	}
	public boolean isDuplex() {
		return duplex;
	}
	
	public void fillToner(int tonerAmount) {
		
		int newAmount = getTonerLevel() + tonerAmount;
		
		if ( newAmount <= 100) {
			tonerLevel = newAmount;
		}
		
		System.out.println("toner level is " + tonerLevel);
	}
	
	public void printPage(int pages) {
		if (duplex) {
			pagesPrinted += (pages / 2) + (pages % 2);
		} else {
			pagesPrinted += pages;
		}
	}
}
