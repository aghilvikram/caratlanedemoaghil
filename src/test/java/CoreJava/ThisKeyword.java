package CoreJava;

public class ThisKeyword {
	int a=2;
	
	public void getData() {
		int a=5;
		int c;
		c=a+this.a;
		System.out.println(c);
	}

	public static void main(String[] args) {
		ThisKeyword th=new ThisKeyword();
		th.getData();

	}

}
