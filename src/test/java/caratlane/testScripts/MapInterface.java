package caratlane.testScripts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("name", "vikram");
		hm.put("mobile", 6380455178f);
		hm.put("place", "salem");
		
		//hm.get
		System.out.println(hm);
		Set keySet = hm.keySet();
		System.out.println(keySet);
		Collection values = hm.values();
		System.out.println(values);
		Set entrySet = hm.entrySet();
		System.out.println(entrySet);
		Iterator i = entrySet.iterator();
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry) i.next();
			System.out.println( me.getKey()+":"+ me.getValue());  
		}
		Object object = hm.get("name");
		System.out.println(object);
		hm.replace("name", "devi");
		System.out.println(hm);
		
		//String string = hm.toString();
		//System.out.println(string);

	}

}
