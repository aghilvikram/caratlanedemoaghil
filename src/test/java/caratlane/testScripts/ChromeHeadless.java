package caratlane.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		// options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.in");
		driver.findElement(By.id("input")).sendKeys("vikram",Keys.ENTER);
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.quit();

	}

}
