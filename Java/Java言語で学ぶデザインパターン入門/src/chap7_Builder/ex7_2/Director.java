package chap7_Builder.ex7_2;

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