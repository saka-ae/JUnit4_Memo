package chap21_Proxy.sample;

import java.util.Objects;

public class PrinterProxy implements Printable {
	private String		_name;
	private Printer	_real;


	public PrinterProxy(String name) {
		_name = name;
	}


	@Override
	public String getPrinterName() {
		return _name;
	}

	@Override
	public void setPrinterName(String name) {
		_name = name;

		if (Objects.nonNull(_real))
			_real.setPrinterName(name);
	}


	@Override
	public void print(String str) {
		if (Objects.isNull(_real))
			_real = new Printer(_name);

		_real.print(str);
	}

}
