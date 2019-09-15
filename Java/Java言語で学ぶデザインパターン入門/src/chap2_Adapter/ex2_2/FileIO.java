package chap2_Adapter.ex2_2;

public interface FileIO {

	void readFromFile(String fileName);
	void writeToFile(String fileName);

	String getValue(String key);
	void setValue(String key, String value);

}
