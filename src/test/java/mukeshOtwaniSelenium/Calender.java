package mukeshOtwaniSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[3]")).click();
		List<WebElement> datas = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//td"));
        int sizeCount = datas.size();
        for(int i=0; i<sizeCount; i++) {
        	if(datas.get(i).getText().equals("28")) {
        		datas.get(i).click();
        		break;
        	}
        }
	}

}
