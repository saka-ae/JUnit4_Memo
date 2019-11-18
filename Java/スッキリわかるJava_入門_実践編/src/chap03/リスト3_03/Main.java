package chap03.リスト3_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> strs = new ArrayList<>();
		
		strs.add("abc");
		strs.add("def");
		strs.add("ghi");
		
		Iterator<String> it = strs.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
	
}
