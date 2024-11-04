package CoreJava;

public class SuperKeyword  extends SuperDemo{
	String parentVariable="devi";
	public SuperKeyword() {
		super();
		System.out.println("Child class constructor");
	}
	
	public void m1() {
		super.m1();
		System.out.println(parentVariable);
		System.out.println(super.parentVariable);
		System.out.println("child class methods");
	}

	public static void main(String[] args) {
		SuperKeyword sk=new SuperKeyword();
		sk.m1();

	}

}
