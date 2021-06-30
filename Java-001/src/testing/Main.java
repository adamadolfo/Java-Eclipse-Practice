package testing;

public class Main {

	public static void main(String[] args) {

		Printer printer = new Printer(50, true);
		
		System.out.println(printer.getPagesPrinted());
		printer.printPage(11);
		System.out.println(printer.getPagesPrinted());
	}

}
