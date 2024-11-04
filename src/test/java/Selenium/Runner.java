package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner {
	public static void main(String[] arg) {
		String browser = PropertyFileReading.readPropertyFile("browser");
		System.out.println(browser);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String timeout = PropertyFileReading.readPropertyFile("timeout");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(timeout)));
		String favtools = PropertyFileReading.readPropertyFile("favtools");
		String[] ft = favtools.split(",");
		List<String> ftools = Arrays.asList(ft);
		for(int i=0; i<ftools.size(); i++) {
			System.out.println(ftools.get(i));
		}
	}

}
