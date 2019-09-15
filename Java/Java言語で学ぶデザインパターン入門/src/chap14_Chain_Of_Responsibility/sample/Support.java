package chap14_Chain_Of_Responsibility.sample;

public abstract class Support {
	private String		_name;
	private Support	_next = NullSupport.getInstance();


	public Support(String name) {
		_name = name;
	}


	public void setNext(Support next) {
		_next = next;
	}


	@Override
	public String toString() {
		return "[" + _name + "]";
	}


	public final void support(Trouble trouble) {
		if (resolve(trouble)) {
			done(trouble);

			return;
		}

		_next.support(trouble);
	}


	protected void done(Trouble trouble) {
		System.out.format("%s is resolved by %s.\n", trouble, this);
	}


	protected abstract boolean resolve(Trouble trouble);

}
