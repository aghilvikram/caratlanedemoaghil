package CoreJava;

public class MultiDimArray {

	public static void main(String[] args) {
		int a[][]= {{4,5,2},{3,-3,6},{9,8,0}};
		int min=a[0][0];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(a[i][j]<=min) {
					min=a[i][j];
				}
				
			}
			
		}System.out.println(min);

	}

}
