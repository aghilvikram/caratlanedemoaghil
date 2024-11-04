package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//xpath axes
		
		//following-sibling
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
	
	
	//child to parent
	//header/div/button[1]/parent::div
	}

}
