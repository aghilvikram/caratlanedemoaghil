package CoreJava;

public class ConstructorDemo {
	
	int a=10;
	int b=5;
	
	
	  ConstructorDemo(){
		  System.out.println("vikram"); 
		  }
	 
      ConstructorDemo(String name, int d){
    	  System.out.println(name+" "+d);
      }
	
	public void add() {
		int c;
		c=a+b;
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd1=new ConstructorDemo("devi",50);
		 System.out.println(cd1.a);
		 cd1.add();

	}

}
