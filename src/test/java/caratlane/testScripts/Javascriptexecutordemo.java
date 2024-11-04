package caratlane.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecutordemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.
		//ChromeDriver driver1=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://uitestpractice.com/Students/Index");
		WebElement ele = driver.findElement(By.id(null));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('').value='';");
		js.executeAsyncScript("arguments[0].click();", ele);
		String url=js.executeAsyncScript("return document.URL;").toString();

	}

}
