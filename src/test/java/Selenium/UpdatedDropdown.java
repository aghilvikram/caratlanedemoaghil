package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractice/");
	    //driver.findElement(By.id(""))
	    int i=1;
	    while(i<5) {
	    	driver.findElement(By.id("")).click();
	    	i++;
	    }
	    

	}

}
