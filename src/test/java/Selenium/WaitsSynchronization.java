package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsSynchronization {
	public static void sendKeys(WebDriver driver, WebElement ele, int timeout, String value) {
		new WebDriverWait(driver,Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(ele));
	    ele.sendKeys(value);
	
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//gloabal ->if driver interacting with 50 elements this waits applicable implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		WebElement ele1 = driver.findElement(By.name("email"));
		WebElement ele2 = driver.findElement(By.name("pass"));
		sendKeys(driver, ele1, 10, "vikram");
		sendKeys(driver, ele2, 10, "devi");
		

	}

}
