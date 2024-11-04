package caratlane.testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.
		//ChromeDriver driver1=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://uitestpractice.com");
		WebElement ele = driver.findElement(By.id(""));
		File tempFile = ele.getScreenshotAs(OutputType.FILE);
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File sfile = ss.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sfile, new File("Screenshot\\fullpage.png"));
	}

}
