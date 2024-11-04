package Selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data {
	public static HashMap<String, String> getUserLoginInfo() {
		HashMap<String,String> userMap=new HashMap<String,String>();
		userMap.put("customer", "vikram_devi");
		userMap.put("admin", "Vikram_aghil");
		//userMap.put("vikram", "maghil");
		return userMap;
	}
	
	public static  HashMap<Integer, String> monthMap() {
		HashMap<Integer,String> mmap=new HashMap<Integer,String>();
		mmap.put(1, "Jan");
		mmap.put(2, "feb");
		mmap.put(3, "mar");
		mmap.put(4, "apr");
		mmap.put(5, "may");
		mmap.put(6, "jun");
		mmap.put(7, "jul");
		mmap.put(8, "aug");
		mmap.put(9, "sep");
		mmap.put(10, "oct");
		mmap.put(11, "nov");
		mmap.put(12,"dec");
		return mmap;
		
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
		String str = getUserLoginInfo().get("customer");
        String[] val = str.split("_");	
        driver.findElement(By.name("username")).sendKeys(val[0]);
        driver.findElement(By.name("password")).sendKeys(val[1]);
	
	}

}
