package caratlane.testScripts;

import java.util.HashMap;

public class Countofchars {

	public static void main(String[] args) {
		String str="vikramaghil7811100378";
		char[] c = str.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(char ch:c) {
		if(hm.containsKey(ch)) {
			hm.put(ch, hm.get(ch)+1);
		}
		else {
			hm.put(ch, 1);
		}
		}
		System.out.println(hm);

	}

}
