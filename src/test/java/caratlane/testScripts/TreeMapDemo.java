package caratlane.testScripts;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put("name", "vikram");
		tm.put("mobile", 6380455178f);
		tm.put("place", "salem");
		
		System.out.println(tm);
		Entry lastEntry = tm.lastEntry();
		System.out.println(lastEntry);
		

	}

}
