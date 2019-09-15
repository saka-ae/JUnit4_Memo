package chap21_Proxy.ex21_1;

import java.lang.reflect.Constructor;
import java.util.Objects;

import chap21_Proxy.sample.Printable;

public class PrinterProxy implements Printable {
	private String		_name;
	private String		_className;
	private Printable	_real;


	public PrinterProxy(String name, String className) {
		_name		= name;
		_className	= className;
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
			realize();

		_real.print(str);
	}


	private void realize() {
		try {
			Class classObj = Class.forName(_className);

			Constructor constructor = classObj.getConstructor(new Class[] { String.class });

			_real = (Printable) constructor.newInstance(new Object[] { _name });

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
