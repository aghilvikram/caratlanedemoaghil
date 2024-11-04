package CoreJava;

public class StaticVar {
	String name;
	String address;
	static String city="salem1";  //class variables
	
	StaticVar(String name,String address){
		this.name=name;
		this.address=address;
		
	}
	public String getAddress() {
		System.out.println(address+" "+city);
		getName();
		return address;
	}
	public static void getName() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		StaticVar obj=new StaticVar("vikram","salem");
		StaticVar obj1=new StaticVar("devi","tanjore");
		obj.getAddress();
		obj1.getAddress();
		getName();
		

	}

}
