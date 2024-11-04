package Selenium;

public class CoreJavaBrushup {

	public static void main(String[] args) {
		int num=5;
		String website="Vikram.com";
		char letter='r';
		double dec=5.99;
		boolean myCard=true;
		System.out.println(num+"vikram");
		
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int arr2[]= {1,2,3,4,5,6};
		System.out.println(arr2[3]);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] name= {"vikram","devi","aghil"};
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		for(String s:name) {
			System.out.println(s);
		}
		
		

	}

}
