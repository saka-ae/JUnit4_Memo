package chap21_Proxy.ex21_1;

import chap21_Proxy.sample.Printable;

public class Main {

	public static void main(String[] args) {
		Printable proxy = new PrinterProxy("Brian", "chap21_Proxy.sample.Printer");
		System.out.println("name: " + proxy.getPrinterName());

		proxy.setPrinterName("Kernighan");
		System.out.println("name: " + proxy.getPrinterName());

		proxy.print("Hello world!");
	}

}
