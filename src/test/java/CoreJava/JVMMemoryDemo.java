package CoreJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JVMMemoryDemo {
	static WebDriver driver;
	static int a=m1();
	
	public static int m1()
	{
		int b=6;
		int c=a+b;
		System.out.println(c);
		return 10;
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		JVMMemoryDemo mem=new JVMMemoryDemo();
		mem.m1();

	}

}
