package chap8_Abstract_Fatctory.sample.factory;

public interface Factory {

	Item createItem(String item);
	Text createText(String title);

}
