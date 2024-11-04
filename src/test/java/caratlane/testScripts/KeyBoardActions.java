package caratlane.testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//keydown
		/*driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
		Actions action=new Actions(driver);
		Action key = action.keyDown(Keys.CONTROL).sendKeys("a").build();
		key.perform();*/
		
		//keyup
		driver.get("https://google.com");
		//driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
		Actions action2=new Actions(driver);
		WebElement searchBox = driver.findElement(By.name("q"));
		action2.keyDown(Keys.SHIFT).sendKeys(searchBox,"selenium").keyUp(Keys.SHIFT).sendKeys(searchBox, "selenium").perform();
		
		
		
		
		

	}

}
