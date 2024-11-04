package caratlane.testScripts;

public class Eventotal {

	public static void main(String[] args) {
		int even=0;
		int total=0;
		int count=0;
		
		while(even<100) {
			even=even+2;
			total=total+even;
			System.out.println(even);
			count++;
			
		}
		System.out.println(total);
		System.out.println(count);

	}

}
