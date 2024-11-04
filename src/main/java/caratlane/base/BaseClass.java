package caratlane.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import caratlane.actiondriver.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static Properties prop;
    static WebDriver driver;
	
	@BeforeTest
	public static void loadConfig() throws Exception {
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\vikra\\eclipse-workspace\\caratlane.vik.com\\Configuration\\config.properties");
		prop.load(ip);
		
	}
	
	public static void launchApp() {
		WebDriverManager.chromedriver().setup();
		String browserName=prop.getProperty("browser");
		
		if(browserName=="chrome") {
			driver=new ChromeDriver();
		}
		else if(browserName=="firefox") {
			driver=new FirefoxDriver();
		}
		else if(browserName=="IE") {
			driver=new InternetExplorerDriver();
		}
		
		//Action.implicitWait(20);
		driver.get(prop.getProperty("url"));
		
	}

}
