package chap21_Proxy.sample;

public class Main {

	public static void main(String[] args) {
		Printable proxy = new PrinterProxy("Brian");
		System.out.println("name: " + proxy.getPrinterName());

		proxy.setPrinterName("Kernighan");
		System.out.println("name: " + proxy.getPrinterName());

		proxy.print("Hello world!");
	}

}
