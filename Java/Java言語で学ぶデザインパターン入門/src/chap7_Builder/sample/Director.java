package chap7_Builder.sample;

public class Director {
	protected Builder _builder;


	public Director(Builder builder) {
		_builder = builder;
	}


	public void construct() {
		_builder.makeTitle();

		_builder.makeString();

		_builder.makeItems();

		_builder.complete();
	}

}