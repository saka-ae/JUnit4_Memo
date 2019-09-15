package chap14_Chain_Of_Responsibility.ex14_4;

import chap14_Chain_Of_Responsibility.sample.Trouble;

public class NullSupport extends Support {
	private static final NullSupport _singleton = new NullSupport();


	private NullSupport() {
		super("Nullオブジェクト");
	}


	public static NullSupport getInstance() {
		return _singleton;
	}


	@Override
	protected boolean resolve(Trouble trouble) {
		return true;
	}

	@Override
	protected void done(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved");
	}

}
