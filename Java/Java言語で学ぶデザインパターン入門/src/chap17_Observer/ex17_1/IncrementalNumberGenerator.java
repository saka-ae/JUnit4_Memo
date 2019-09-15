package chap17_Observer.ex17_1;

import chap17_Observer.sample.NumberGenerator;

public class IncrementalNumberGenerator extends NumberGenerator {
	private int _begin;
	private int _end;
	private int _incremental;


	public IncrementalNumberGenerator(int begin, int end, int incremental) {
		_begin = begin;
		_end = end;
		_incremental = incremental;
	}


	@Override
	public void execute() {
		for (int i = _begin; i < _end; i += _incremental) {
			super.setNumber(i);

			super.notifyObservers();
		}
	}

}
