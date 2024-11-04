package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemoFbSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.findElement(By.name("firstname")).sendKeys("Vikram");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Balasubramanian");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("9443665515");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vikramaghil777@");
		Thread.sleep(3000);
		
		
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		Select sel1=new Select(dayDropdown);
		sel1.selectByValue("22");
		Thread.sleep(3000);
		
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select sel2=new Select(monthDropdown);
		sel2.selectByVisibleText("May");
		Thread.sleep(3000);
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select sel3=new Select(yearDropdown);
		sel3.selectByValue("1990");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		
		
		String title = driver.getTitle();
		System.out.println("---------- title is ---------------------");
		System.out.println(title);
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("--------- currentUrl is -----------------");
		System.out.println(currentUrl);
		
		
		String windowHandleID = driver.getWindowHandle();
		System.out.println("--------- window handle id is -----------");
		System.out.println(windowHandleID);
		
		
		driver.close();

	}

}
