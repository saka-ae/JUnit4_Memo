package chap9_Bridge.ex9_3;

import chap9_Bridge.sample.DisplayImpl;

public class CharacterDisplayImpl implements DisplayImpl {
	private char _head;
	private char _body;
	private char _foot;


	public CharacterDisplayImpl(char head, char body, char foot) {
		_head = head;
		_body = body;
		_foot = foot;
	}


	@Override
	public void setUp() {
		System.out.print(_head);
	}

	@Override
	public void tearDown() {
		System.out.print(_foot);
	}

	@Override
	public void print() {
		System.out.print(_body);
	}

}
