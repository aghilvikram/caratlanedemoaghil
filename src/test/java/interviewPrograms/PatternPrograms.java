package interviewPrograms;

public class PatternPrograms {
	
	public static void numbersPattern1() 
	{
		int n=4;
		for(int i=1; i<=n; i++) 
		{
			for(int j=1; j<=i; j++)
			{
				int k=i+j-1;
				System.out.print(k);
				/*
				 * if(k>n) { k=k-n; System.out.print(k); } else { System.out.print(k); }
				 */
				
			}
			System.out.println();
	    }
	}
	
	public static void numbersPattern2() {
		int n=5;
		
		for(int i=1; i<=n; i++) {
			for(int k=n-1; k>=i; k--) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				int m=i+j-1;
				System.out.print(m);
			}
			System.out.println();
			
		}
	}
	
	
	
	public static void numbersPattern() {
		int n=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		
		numbersPattern2();
		
		
		
		
		/*
		 * int n=5; for(int i=1; i<=n; i++) { for(int j=1; j<=n; j++) { if(i==1 ||
		 * i==3|| i==n || j==1 ) { System.out.print("*"); } else {
		 * System.out.print(" "); } } System.out.print("\n"); }
		 */

	}

}
