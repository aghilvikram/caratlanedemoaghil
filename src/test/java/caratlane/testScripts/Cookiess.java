package caratlane.testScripts;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookiess {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().addCookie(new Cookie("vik","vikram"));
		Set<Cookie> cookies = driver.manage().getCookies();
		//driver.manage().getCookieNamed(null);
		
		
		for (Cookie cookie : cookies) {
			System.out.println("name: "+cookie.getName()+"  "+"value: "+cookie.getValue());
			
		}
		
		int noOfCookies = cookies.size();
		System.out.println(noOfCookies);
	}

}
