package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
				break;
			}
			else {
				System.out.println(arr[i]+"is not multiple of 2");
			}
		}
		
		ArrayList<String> al=new ArrayList<String>();
        al.add("vikram");
        al.add("devi");
        al.add("aghil");
        al.add("maghil");
        System.out.println(al.get(3));
        
        for(int i=0; i<al.size(); i++) {
        	System.out.println(al.get(i));
        }
        for(String val:al) {
        	
        System.out.println(val);
        }
        System.out.println(al.contains("vikram"));
        
        
        String[] name= {"vikram","devi","aghil","maghil"};
	    List<String> nameList = Arrays.asList(name);
	    
	}

}
