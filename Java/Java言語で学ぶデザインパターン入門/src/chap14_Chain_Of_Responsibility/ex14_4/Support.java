package chap14_Chain_Of_Responsibility.ex14_4;

import chap14_Chain_Of_Responsibility.sample.Trouble;

public abstract class Support {
	private String		_name;
	private Support	_next = NullSupport.getInstance();


	public Support(String name) {
		_name = name;
	}


	protected Support getNext() {
		return _next;
	}

	public void setNext(Support next) {
		_next = next;
	}


	@Override
	public String toString() {
		return "[" + _name + "]";
	}


	public final void support(Trouble trouble) {
		for (Support support = this; !(support.isNullSupport()); support = support.getNext())
			if (support.resolve(trouble)) {
				support.done(trouble);

				return;
			}

		fail(trouble);
	}


	protected void done(Trouble trouble) {
		System.out.format("%s is resolved by %s.\n", trouble, this);
	}

	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved");
	}


	protected boolean isNullSupport() {
		return this instanceof NullSupport;
	}


	protected abstract boolean resolve(Trouble trouble);

}
