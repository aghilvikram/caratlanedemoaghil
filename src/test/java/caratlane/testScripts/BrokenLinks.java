package caratlane.testScripts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int brokenLink=0;
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			try {
				
				URL ulink=new URL(url);
				HttpURLConnection oc = (HttpURLConnection)ulink.openConnection();
				oc.setRequestMethod("HEAD");
				oc.connect();
				int resCode = oc.getResponseCode();
				if(resCode>=400) {
					System.out.println(url);
					brokenLink++;
				}
			}
			catch(MalformedURLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(brokenLink);
		
		

	}

}
