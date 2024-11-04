package caratlane.testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import caratlane.base.BaseClass;

public class SignUpTest extends BaseClass{
	//WebDriver driver;
	
	@BeforeMethod
	public static void setUp() {
		launchApp();
	}
	
	@AfterMethod
	public static void tearDown() {
		//driver.close();
		
	}
	
	@Test
	public static void signUp() {
		launchApp();
		
		
	}

}
