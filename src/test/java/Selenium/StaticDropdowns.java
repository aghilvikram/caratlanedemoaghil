package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/dropdownsPractice/");
    //select tag for static dropdown
    WebElement sd=driver.findElement(By.id(""));
    Select dd=new Select(sd);
    dd.selectByIndex(3);
    String val = dd.getFirstSelectedOption().getText();
    List<WebElement> dds = dd.getAllSelectedOptions();
    
    //visible text
    dd.selectByVisibleText("AED");
    dd.selectByValue("AED");
	}

}
