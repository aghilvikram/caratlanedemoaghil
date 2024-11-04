package caratlane.testScripts;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,2,1,6,3,4,6,9,7,8,9};
		for ( int i : arr) 
			//System.out.println(i);
			Arrays.sort(arr);
			
			for (int j : arr) 
				System.out.println(j);
				
				
				
				String[] str= {"vikram","abirtyu","devisxsggg"};
				Arrays.sort(str);
				for (String k : str) 
					System.out.println(k); 
				
				Comparator cmp=new Comparatorimp();
				//cmp.compare(str, cmp)
				Arrays.sort(str, cmp);
				
				for (String k : str) 
					System.out.println(k);
				
			
			
			
		}

	}


