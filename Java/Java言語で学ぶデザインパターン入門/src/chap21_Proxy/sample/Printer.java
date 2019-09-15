package chap21_Proxy.sample;

public class Printer implements Printable {
	private String _name;


	public Printer(String name) {
		_name = name;
	}

	@Override
	public String getPrinterName() {
		return _name;
	}

	@Override
	public void setPrinterName(String name) {
		_name = name;
	}

	@Override
	public void print(String str) {
		System.out.format("%s: %s\n", _name, str);
	}

}
