package caratlane.testScripts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();
		ll.add(2);
		ll.add(2);
		ll.add(4);
		ll.add(3);
		ll.add(3);
		Object[] a = ll.toArray();
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		List<Object> ll1 = Arrays.asList(a);
		System.out.println(ll1);
		//LinkedHashSet hs=new LinkedHashSet(ll);
		//System.out.println(hs);
		
		/*LinkedHashSet hs1=new LinkedHashSet();
		hs.add(5);
		hs.add(10);
		hs.add(51);
		hs.add(1);
		hs.add(5);
		hs.add(10);
		//System.out.println(hs);*/
		
		TreeSet ts=new TreeSet();
		ts.add(2);
		ts.add(2);
		ts.add(4);
		ts.add(3);
		ts.add(3);
		
		System.out.println(ts);
		
		
		
	}}