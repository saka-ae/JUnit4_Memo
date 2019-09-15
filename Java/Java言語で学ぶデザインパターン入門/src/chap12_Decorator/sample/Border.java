package chap12_Decorator.sample;

public abstract class Border extends Display {
	protected Display _display;


	public Border(Display display) {
		_display = display;
	}


	protected Display getDisplay() {
		return _display;
	}

}
