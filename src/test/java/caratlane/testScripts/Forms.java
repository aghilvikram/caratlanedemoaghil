package caratlane.testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forms {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement uname = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.id("password"));
		//driver.findElement(By.id("login-button")).click();
		
		
		Actions actions=new Actions(driver);
		actions.moveToElement(uname)
		.click()
		.sendKeys("standard_user",Keys.TAB)
		.sendKeys("secret_sauce",Keys.ENTER)
		.build().perform();
	}

}
