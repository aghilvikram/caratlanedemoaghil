package CoreJava;

public  class InterfaceImplementation implements InterfaceDemo {
	//by default variables declared in interface have public access modifier
	
	int i=1;

	public static void main(String[] args) {
		InterfaceDemo ii=new InterfaceImplementation();
        
        ii.greenGo();
        ii.redStop();
        ii.blink();
        InterfaceImplementation ia=new InterfaceImplementation();
	    ia.classMethod();
	    
	
	}

	@Override
	public void greenGo() {
		System.out.println("hi");
		
	}
	
	public void classMethod() {
		System.out.println("class method");
	}
	//public abstract void m1();

	@Override
	public void redStop() {
		System.out.println("how");
		
	}

	@Override
	public void blink() {
		System.out.println("you");
		
	}

}
