package Selenium;

import org.apache.poi.util.SystemOutLogger;

public class StringHandling {

	public static void main(String[] args) {
		String str="hi how are you";
		String[] s = str.split(" ");
		for(int i=0; i<s.length; i++) {
			for(int j=s[i].length()-1; j>=0; j--) {
				System.out.print( s[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		/*
		 * for(String se:s) { System.out.println(se); }
		 */
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
